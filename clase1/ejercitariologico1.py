A = True
print("original A: ", A)
print("negacion A: ", not A)

print("A B A and B")
A = True; B = True
print(A, B, A and B)
A = True; B = False
print(A, B, A and B)
A = False; B = True
print(A, B, A and B)
A = False; B = False
print(A, B, A and B)

print("A B A or B")
A = True; B = True
print(A, B, A or B)
A = True; B = False
print(A, B, A or B)
A = False; B = True
print(A, B, A or B)
A = False; B = False
print(A, B, A or B)