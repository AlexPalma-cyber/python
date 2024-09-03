#mostrar los numeros pares del 1 al 100
#usando while y otro con for

x=1
while (x <= 100):
    if x % 2 == 0:
     print(x)
    x +=1

for x in range(2, 101,2):  
    print(x)