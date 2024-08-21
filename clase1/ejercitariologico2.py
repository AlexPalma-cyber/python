A = True
B = True
Y = (A and not B) or (not A and B) or (A and B)
print(Y)

A = True
B = False
Y = (A and not B) or (not A and B) or (A and B)
print(Y)