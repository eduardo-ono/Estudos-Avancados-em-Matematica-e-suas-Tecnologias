import math

def pitagoras(b, c):
    a = math.sqrt(b ** 2 + c ** 2)
    return a

a = pitagoras(3, 4)
print(a)
