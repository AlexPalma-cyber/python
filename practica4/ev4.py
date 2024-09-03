'''Desarrollar un programa que muestre la tabla de multiplicar del 5'''


for i in range(1,11):
    numero = 5

# Imprimir tabla de multiplicar
print(f"Tabla de multiplicar del {numero}:")

# Usar un bucle for para iterar desde 1 hasta 10
for i in range(1, 11):
    # Calcular el resultado de la multiplicación
    resultado = numero * i
    # Imprimir el resultado
    print(f"{numero} x {i} = {resultado}")