print("La suma de 10 + 4 es: ", 10 + 4)
#Resolver todas las operaciones: 10-4, 10*4, 10/4, 10%4, 10//4, 10**4
print("La resta de 10 - 4 es: ", 10 - 4 )
print("La multiplicacion de 10 * 4 es: ", 10 * 4)
print("La division de 10 / 4 es: ", 10 / 4)
print("La potencia de 10 % 4 es: ", 10 % 4)
print("La operacion de 10 // 4 es: ", 10 // 4)
print("La operacion de 10 ** 4 es: ", 10 ** 4)

#resolver la ecuacion cuadratica: 2x**2 - 7x+3 = 0
a = 2
b = -7
c = 3
print("La cuadratica de la suma: ", ((-b) + ((b**2)-(4*a*c))**0.5)/(2*a))
print("La cuadratica de la resta: ", ((-b) - ((b**2)-(4*a*c))**0.5)/(2*a))
#Operaciones con cadenas de texto
print("Aula" +str(2102) + " Programacion Python")
#aqui tendremos un error, 2102 no es una cadena de texto, por eso se añade"" o funcion str

#Operaciones mixtas
print("Tun chi " * 5)
print("Ja " * (2**3))

#Operadores de comparacion
print(3 > 4)
print(3 < 4)
print(3 >= 4)
print(4 <= 4)
print(3 == 4)
print(3 != 4)

#Operaciones con cadenas de texto
print("python" > "PYTHON")
print("aaa" >= "abaa") #Ordenacion alfabetica por ASCII
print(len("aaa") >= len("abaa")) #Cuenta caracteres
print("python" != "PYTHON")

###Operadores Logicos
print(10 > 4 and "Z" > "A") 
print(10 > 4 or "Z" > "A") 
print(not(10 > 4) and "Z" > "A")
