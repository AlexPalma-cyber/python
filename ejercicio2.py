alumnos = ["Moises", "Camila", "Fernanda","Pablo", "Tania", "David", "Marcos"]
def promedio_calificaciones1():
    valores = [2,5,8,4,0,1,6,7]
    while True:
        valor = int(input("calificacion: "))
        if valor == 0:
            break
        else:
            valores.append(valor)

    #promedio
    sumatoria = 0
    for x in range(len(valores)):
        sumatoria += valores[x]
    average = sumatoria/ len(valores)
    print("Tu promedio es de: ", average)
    print(valores)

def promedio_calificaciones2():
    valores = [2,5,8,4,0,1,6,7]
    valor = 99
    while True:
        valor = int(input("calificacion: "))
        if valor == 0:
            break
        elif (valor >= 1 and valor <= 5):
            valores.append(valor)
    average = valores/ len(valores)
    print("Tu promedio es de: ", average)
    print(valores)

promedio_calificaciones1()
promedio_calificaciones2()