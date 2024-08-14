def obtener_agenda():
    contactos = {}
    telefono  ={}
    while True:
        nombre = input("Ingrese un nombre o dejelo vacio para terminar de agregar: ")
        if nombre == "":
            break
        if nombre in contactos:
            print("Nombre ya existente")
        else:
            telefono = input(f"Ingrese el telefono de {nombre}:")
            contactos [nombre] = telefono
    return contactos        

x = obtener_agenda()

print(x)