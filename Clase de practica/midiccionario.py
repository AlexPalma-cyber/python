#traductor
diccionario = {"hola":"hello","chau":"bye"}

while True:
    palabra = input("Ingrese una palabra a traducir: ")

    if(palabra in diccionario):
        print("Español: Ingles")
        print(f"{palabra}: {diccionario[palabra]}")
    
    else:
        print("La palabra no existe en el diccionario")
        resp = input("Desea registrarlo(si/no)") 
        if resp == "si" or resp == "yes":
            #registrar en el diccionario
            traduccion = input(f"Ingresa la traducción al inglés para '{palabra}': ").strip()
            diccionario[palabra] = traduccion
            print(f"La palabra '{palabra}' ha sido registrada con la traducción '{traduccion}'.")
            if traduccion !="":
                diccionario[palabra] = traduccion
        elif (resp =="x"):
            break          