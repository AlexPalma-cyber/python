acceso = {"admin": "123", "pepe": "abc"}
user = input("Ingrese usuario")
password = input("Ingrese clave")
if user in acceso:
    if acceso[user] == password:
        print("Acceso correcto")
    else:
        print("Acceso incorrecto")

else:
    print("El usuario no esta registrado")