df <- data.frame(
  
  ID     = c(101,102,103,104),
  Name   = c("Alice","Bob","Charlie","David"),
  Age    = c(23,25,22,24),
  Score  = c(89.5,76,91.2,88.8),
  Passed = c(TRUE,FALSE,TRUE,TRUE)
  
)

print(df)

df$Name # Variable extraction

mean(df$Age)
var(df$Age)
sd(df$Age)


table(df$Passed) # Total Number extraction

df[2,4] # Second Row, 4th Column

df[df$Name=="Alice","Score"] # Specific Extraction

df[df$Name=="Bob",c("Score","Age")]

View(df) # Viewing the big data
