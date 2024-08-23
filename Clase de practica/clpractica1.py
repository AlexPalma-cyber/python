#Leer tres notas por teclado y cargarlos en una lista.
#Calcular el promedio y si esta aprobado o reprobado. Si el promedio > 1.7 = aprobado sino reprobado
notas = [2,3,1]


#Leer datos
for x in range(3):
    nota = float(input(f"Ingrese la nota {x}: "))
    notas.append(nota)
    
#Calcular el promedio y si esta aprobado o reprobado
promedio = sum(notas)/len(notas)
    
if promedio > 1.7:
    print(f"Promedio: {promedio:.2f} - aprobado")

else:
    print(f"Promedio: {promedio:.2f} - reprobado")

