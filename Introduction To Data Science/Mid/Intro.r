# Create a simple dataset and plot a boxplot
set.seed(123)
df <- data.frame(
  group = rep(c("A", "B", "C"), each = 20),
  value = c(rnorm(20, mean = 5), rnorm(20, mean = 7), rnorm(20, mean = 6))
)

boxplot(value ~ group, data = df,
        main = "Boxplot of sample groups",
        xlab = "Group",
        ylab = "Value",
        col = c("lightblue", "lightgreen", "lightpink"))
