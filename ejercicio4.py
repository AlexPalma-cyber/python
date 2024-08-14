valores = []
while True:
    try:
        valor = int(input("Ingrese los numeros: "))
        if valor == 0:
            break
        if numero_primo(valor):
            valores.append(valor)
    except ValueError:
        print("Inserta un numero valido")


if valores:
    print("Los numeros primos son: ", valor)
else:
    print("Ningun numero ingresado es un numero primo")

