numero = 10000000
while(True):
    numero += 1
    bandera = 0
    for x in range(2,int(numero/2)):
        if(numero % x == 0):
            bandera = 1

    if(bandera == 0):
        print(f" {numero}")

