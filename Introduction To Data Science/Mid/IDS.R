# IDS Class 1 (21/6/26) (Sunday)

# Basic Calculations

a = 10
b = 12
c = a+b
d = a**b
e = a-b
f = a/b

# Vector

age = c(22,23,24,21,25,NA)
age2 = c(13,14,15,12,14,11)
name = c("Corporate", "Baddie")

# Basic Operations

root = sqrt(a+b)
avg = mean(age, na.rm=TRUE)
variance = var(age)
standarddeviation = sd(age)

# Extraction

SecondElement = age[2]
TwoElements = age[c(2,4)]
ManyElements = age[c(1:6)]
Conditions = age2[age2>5 & age2<20]
Change = age2[c(2,4)] = c(20,19)  

# Vector Manipulation

VectorSum = age + age2
VectorMultiplication = age*age2



