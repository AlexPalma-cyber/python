'''Cargar una oracion por teclado
Imprime la candidad de vocales que tiene'''

cadena = input("Ingrese una oracion: ")
longCad = len(cadena)
vocales = 0

for i in range(0, longCad):
    if (cadena[i] == "a" or cadena[i] == "A" or cadena[i] == "e" or cadena[i] == "E" or cadena[i] == "i" or cadena[i] == "I"
         or cadena[i] == "o" or cadena[i] == "O" or cadena[i] == "u" or cadena[i] == "U"):
        vocales += 1

print("La oracion ingresada es: ", cadena) 
print("La cantidad de vocales es: ", vocales)       