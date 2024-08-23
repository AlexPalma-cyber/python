#Escriba un programa para validar si los datos de acceso (usuario y contraseña) se encuentran en el diccionario.
#Validar a solo 3 intentos erroneos de contraseña utilizando ciclo while.
acceso={"Pablo":"SNP1", "Ana": "abd", "Lucas":"abc"}
i= 0
acceso["Maria"] = "12345"
while i<3:
    usuario=input("ingrese su nombre de usuario")
    if usuario in acceso:
     print("Usuario registrado")
    else:
      print("Usuario no registrado.")
      resp = input ("desea registrarlo? (si/no)")
      if resp == "si" :
         clave = input(f"Ingrese la clave para {usuario}")
         acceso[usuario] = clave
         continue

    if usuario in acceso:
        print("Usuario correcto")
        clave = input("Ingrese su clave")
        if clave == acceso[usuario]:
            print(f"Bienvenido {usuario}")
            break
        else:
            i=1
            
            while i < 3:
                print(f"Clave incorrecta. Falló {i} veces")
                clave = input("Ingrese su clave")
                if clave == acceso[usuario]:
                    print(f"Bienvenido {usuario}")
                    break
                i += 1
            
            if    i>3:
                print("Intentos agotados")


               