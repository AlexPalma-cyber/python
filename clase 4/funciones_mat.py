#funciones matematicas
def suma(a,b):
    return a + b

def resta(a,b):
    return a - b

def mutiplicacion (a,b):
    return a * b

def division(a,b):
    if(b == 0):
        return "No se puede dividir por CERO"
    else:
        return a/b
    
def raiz(a,b = 2):
    return

#cuando ejecutamos el script, _name_para a ser igual al string '_main_'
if __name__ == '__main__':
     print("La suma de 3 y 4 son ", suma(3,4))
#implementa y ejecuta las otras funciones
print(suma(7,7))
print(resta(7,6))
print(mutiplicacion(5,5))
print(division(15,3))
print(raiz(4))
