library(ggplot2)

ggplot(mtcars, aes(x= as.factor(cyl), y = mpg, fill = as.factor(cyl))) +
  geom_boxplot(alpha = 0.7, outlier.color = "#E74C2C", outlier.shape = 16) +
  scale_fill_brewer(palette = "Blues") +
  
  labs(
    
    title = "Miles per Gallon Across Cylinders",
    x = "Cylinders",
    y = "MPG",
    fill = "Cylinder Legend"
    
  ) +
  
  install.packages("dplyr"
  )


install.packages("ggrepel")
library(ggplot2)
library(ggrepel)
library(dplyr)

cars <- mtcars %>%
  mutate(
    model = rownames(mtcars),
    cylinders = factor(cyl),
    efficiency = mpg / wt
  )


ggplot(cars, aes(x = wt, y = mpg)) +
  
  
  theme_void() +
  
  
  geom_point(
    aes(
      color = efficiency,
      size = hp,
      shape = cylinders
    ),
    alpha = 0.9,
    stroke = 1.2
  ) +
  
  
  geom_smooth(
    method = "loess",
    se = TRUE,
    color = "#FFB703",
    fill = "#FFB703",
    alpha = 0.15,
    linewidth = 1.2
  ) +
  
  
  geom_text_repel(
    data = cars %>% slice_max(mpg, n = 5),
    aes(label = model),
    color = "white",
    size = 3.5,
    box.padding = 0.7,
    point.padding = 0.3,
    max.overlaps = Inf
  ) +
  
  
  scale_color_gradient(
    low = "#8338EC",
    high = "#00F5D4",
    name = "Efficiency\nMPG / Weight"
  ) +
  
  
  scale_size_continuous(
    range = c(3, 12),
    name = "Horsepower"
  ) +
  
  
  scale_shape_manual(
    values = c("4" = 16, "6" = 17, "8" = 15),
    name = "Cylinders"
  ) +
  
  
  labs(
    title = "Galaxy of Cars",
    subtitle = "Lightweight cars tend to travel farther on every gallon",
    x = "Vehicle Weight",
    y = "Miles per Gallon",
    caption = "Data: mtcars"
  ) +

  
  theme(
    plot.background = element_rect(fill = "#090B1A", color = NA),
    panel.background = element_rect(fill = "#090B1A", color = NA),
    plot.title = element_text(
      color = "#FFFFFF",
      size = 24,
      face = "bold",
      hjust = 0.5
    ),
    plot.subtitle = element_text(
      color = "#A8DADC",
      size = 12,
      hjust = 0.5
    ),
    axis.title = element_text(color = "#FFFFFF", face = "bold"),
    axis.text = element_text(color = "#CED4DA"),
    legend.background = element_rect(fill = "#090B1A", color = NA),
    legend.key = element_rect(fill = "#090B1A", color = NA),
    legend.title = element_text(color = "#FFFFFF"),
    legend.text = element_text(color = "#CED4DA"),
    plot.caption = element_text(color = "#6C757D"),
    panel.grid.major = element_line(color = "#242744", linewidth = 0.3),
    panel.grid.minor = element_blank()
  )

install.packages("rvest", type = "binary")