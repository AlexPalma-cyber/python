#Ingresar el sueldo de una persona, si supera los 80000000 millones mostrar un mesnaje
#en la pantalla indicando que debe abonar IRP
#sino mostrar eel mensaje la persona No debe abonar impuestos

MONTOIRP = 80000000
sueldo = int(input("Ingrese cual es su sueldo: "))

sueldoAnual = sueldo * 12#calcular por los 12 meses
if sueldoAnual > MONTOIRP:
    print("Esta persona debe pagar impuestos.")
else:
    print("La persona no debe abonar impuestos.")