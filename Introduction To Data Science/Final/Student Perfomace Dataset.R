library(readr)
student_performance_dataset <- read_csv("C:\Users\talha\Downloads\student_performance_dataset.csv")
View(student_performance_dataset)

# 1. Load Required Libraries
library(tidyverse)
library(GGally)
library(corrplot)
library(caret)

# 2. Load the Dataset
# (Make sure to use the exact path where your file is located)
student_data <- student_performance_dataset

# Remove student_id so it doesn't interfere with numeric correlations
student_data <- student_data %>% select(-student_id)

# 3. Data Type Conversions
# Convert character columns to factors
categorical_cols <- c("gender", "parental_education", "internet_access", 
                      "extracurricular_activities", "part_time_job", "final_grade")

student_data[categorical_cols] <- lapply(student_data[categorical_cols], as.factor)

# Example: Factor to numeric conversion (ordinal mapping)
student_data$parental_edu_num <- as.numeric(student_data$parental_education)

# Example: Numeric to factor conversion
student_data$high_attendance <- as.factor(ifelse(student_data$attendance_percent >= 80, "High", "Low"))

# 4. Data structure and summary statistics
str(student_data)
# Calculate Central Tendencies for a specific column (e.g., final_exam_score)
mean_score <- mean(student_data$final_exam_score, na.rm = TRUE)
median_score <- median(student_data$final_exam_score, na.rm = TRUE)

# View summary statistics for all numeric columns
summary(student_data)
# Filter students who have 80% or more attendance and study more than 5 hours
filtered_data <- student_data %>%
  filter(attendance_percent >= 80 & study_time_hours > 5)

View(filtered_data)
# 5. Correlation matrix for numeric features
numeric_cols <- student_data %>% select_if(is.numeric)
# Added use="complete.obs" to prevent errors if there are NAs
cor_matrix <- cor(numeric_cols, use = "complete.obs") 
print(cor_matrix)



# 6. Function to detect outliers using IQR method
detect_outliers <- function(x) {
  q1 <- quantile(x, 0.25, na.rm = TRUE)
  q3 <- quantile(x, 0.75, na.rm = TRUE)
  iqr <- q3 - q1
  which(x < (q1 - 1.5 * iqr) | x > (q3 + 1.5 * iqr))
}

# Identify outlier indices in numerical variables
outliers_study <- detect_outliers(student_data$study_time_hours)
outliers_attendance <- detect_outliers(student_data$attendance_percent)
outliers_sleep <- detect_outliers(student_data$sleep_hours)



# 7. Visualizations
# Plot 1. Boxplot (Outlier visualization across classes)
ggplot(student_data, aes(x = final_grade, y = final_exam_score, fill = final_grade)) +
  geom_boxplot() +
  theme_minimal() +
  labs(title = "Final Exam Score Distribution by Grade", x = "Final Grade", y = "Score")

# Plot 2. Scatter Plot with linear trendline
ggplot(student_data, aes(x = study_time_hours, y = final_exam_score, color = gender)) +
  geom_point(alpha = 0.7) +
  geom_smooth(method = "lm", se = FALSE) +
  theme_minimal() +
  labs(title = "Study Hours vs Final Exam Score", x = "Study Hours", y = "Score")

# Extract numeric columns and create the correlation matrix
numeric_cols <- student_data %>% select_if(is.numeric)
cor_matrix <- cor(numeric_cols, use = "complete.obs")

# Generate Correlation Heatmap
corrplot(cor_matrix, method = "color", type = "upper", addCoef.col = "black", tl.col = "black")

# Plot 4. Pairs Plot for key numerical features
ggpairs(student_data, columns = c("study_time_hours", "attendance_percent", "previous_grade", "final_exam_score"))

# Plot 5. Creative Combined Plot (Violin + Jitter Points)
ggplot(student_data, aes(x = parental_education, y = attendance_percent, fill = parental_education)) +
  geom_violin(alpha = 0.5) +
  geom_jitter(width = 0.2, alpha = 0.4) +
  theme_minimal() +
  labs(title = "Attendance Percentage across Parental Education Levels", x = "Parental Education", y = "Attendance %")

# 8. Feature Engineering
# Create interaction term and score difference features
student_data <- student_data %>%
  mutate(
    study_attendance_index = study_time_hours * (attendance_percent / 100),
    grade_progress = final_exam_score - previous_grade
  )
colnames(student_data)

# Normalizing the dataset function
normalize <- function(x) {
  return((x - min(x, na.rm = TRUE)) / (max(x, na.rm = TRUE) - min(x, na.rm = TRUE)))
}

# Create a copy to store normalized data
normalize_dataset <- student_data

# Apply normalization to specific numeric columns
normalize_dataset$study_time_hours   <- normalize(student_data$study_time_hours)
normalize_dataset$attendance_percent <- normalize(student_data$attendance_percent)
normalize_dataset$sleep_hours        <- normalize(student_data$sleep_hours)
normalize_dataset$previous_grade     <- normalize(student_data$previous_grade)
normalize_dataset$final_exam_score   <- normalize(student_data$final_exam_score)

View(normalize_dataset)

# 9. Train/Test Split
set.seed(123)

train_index <- createDataPartition(student_data$final_grade, p = 0.80, list = FALSE)

train_data <- student_data[train_index, ]
test_data  <- student_data[-train_index, ]

# 10. Dataset Balancing
# Oversample minority classes in training set
train_balanced <- upSample(
  x = train_data[, -which(names(train_data) == "final_grade")],
  y = train_data$final_grade,
  yname = "final_grade"
)
# UNDER SAMPLING (Down Sampling) - Balances by decreasing majority class size
train_balanced_down <- downSample(
  x = train_data[, -which(names(train_data) == "final_grade")],
  y = train_data$final_grade,
  yname = "final_grade"
)
# Inspect target distributions before and after balancing
print("Before Balancing:")
table(train_data$final_grade)

print("After Balancing:")
table(train_balanced$final_grade)
View(student_data)
# ==============================================================================
library(randomForest)
library(rpart)
library(e1071)
library(pROC)
library(ggplot2)
library(corrplot)
library(dplyr)

# ==============================================================================
# 2. MODEL TRAINING
# ==============================================================================
# Model 1: Random Forest
rf_model <- randomForest(final_grade ~ ., data = train_balanced, ntree = 100)

# Model 2: Decision Tree
dt_model <- rpart(final_grade ~ ., data = train_balanced, method = "class")

# Model 3: Support Vector Machine (SVM)
svm_model <- svm(final_grade ~ ., data = train_balanced, probability = TRUE)

# ==============================================================================
# 3. MODEL EVALUATION
# ==============================================================================
# Model Predictions
rf_pred  <- predict(rf_model, newdata = test_data)
dt_pred  <- predict(dt_model, newdata = test_data, type = "class")
svm_pred <- predict(svm_model, newdata = test_data)

# Confusion Matrices
rf_cm  <- confusionMatrix(rf_pred, test_data$final_grade)
dt_cm  <- confusionMatrix(dt_pred, test_data$final_grade)
svm_cm <- confusionMatrix(svm_pred, test_data$final_grade)

# Print Evaluations
print("--- Random Forest Evaluation ---"); print(rf_cm)
print("--- Decision Tree Evaluation ---"); print(dt_cm)
print("--- SVM Evaluation ---"); print(svm_cm)

# ==============================================================================
# 4. HEATMAP & CORRELATION MATRIX FOR EACH MODEL
# ==============================================================================

# Helper Function: Confusion Matrix Heatmap
plot_cm_heatmap <- function(cm, model_name) {
  cm_df <- as.data.frame(cm$table)
  ggplot(cm_df, aes(x = Reference, y = Prediction, fill = Freq)) +
    geom_tile(color = "white") +
    geom_text(aes(label = Freq), color = "black", size = 5, fontface = "bold") +
    scale_fill_gradient(low = "#e0f2fe", high = "#0284c7") +
    theme_minimal() +
    labs(title = paste(model_name, "- Confusion Matrix Heatmap"),
         x = "Actual Target", y = "Predicted Class")
}

# Helper Function: Model Feature & Prediction Correlation Matrix
plot_model_cor <- function(model_pred, data, model_name) {
  num_data <- data %>% select_if(is.numeric)
  num_data$Predicted_Grade <- as.numeric(model_pred)
  cor_mat <- cor(num_data, use = "complete.obs")
  
  corrplot(cor_mat, method = "color", type = "upper", 
           addCoef.col = "black", tl.col = "black",
           title = paste(model_name, "- Feature & Prediction Correlation"), 
           mar = c(0, 0, 2, 0))
}

# --- Random Forest Plots ---
plot_cm_heatmap(rf_cm, "Random Forest")
plot_model_cor(rf_pred, test_data, "Random Forest")

# --- Decision Tree Plots ---
plot_cm_heatmap(dt_cm, "Decision Tree")
plot_model_cor(dt_pred, test_data, "Decision Tree")

# --- SVM Plots ---
plot_cm_heatmap(svm_cm, "SVM")
plot_model_cor(svm_pred, test_data, "SVM")

# 6. Combined 1 ROC Curve for All Models

ggroc(list("Logistic Regression" = roc_lr, 
           "Decision Tree"       = roc_dt, 
           "Random Forest"       = roc_rf), 
      legacy.axes = TRUE, size = 1) +
  geom_abline(intercept = 0, slope = 1, linetype = "dashed", color = "gray") +
  theme_minimal() +
  labs(title = "ROC Curve Comparison Across All Models",
       x = "1 - Specificity (False Positive Rate)",
       y = "Sensitivity (True Positive Rate)",
       color = "Model")
