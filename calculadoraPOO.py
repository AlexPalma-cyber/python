#definicion de clase
class Calculadora:
    """Calculadora estandar que opera con dos numeros"""
    numero1 = None
    numero2 = None

    #constructor
    def __init__(self, x, y):
        self.numero1 = x
        self.numero2 = y
        resultado = 0
     

    #operaciones, metodos
    def sumar(self):
        self.resultado = self.numero1 + self.numero2
        return self.resultado
    def restar(self):
        self.resultado = self.numero1 - self.numero2
        return self.resultado
    def multiplicar(self):
        self.resultado = self.numero1 * self.numero2
        return self.resultado
    def dividir(self):
        self.resultado = self.numero1 / self.numero2
        return self.resultado
    def cambiarValor(self, x, y):
        self.numero1 = x
        self.numero2 = y  


if __name__ == "__main__":
    miCasio = Calculadora(20, 2) #instanciacion de Calculadora
    print(f"la suma es: {miCasio.sumar()}") 
    print(f"la resta es: {miCasio.restar()}") 
    print(f"la multiplicacion es: {miCasio.multiplicar()}")  
    print(f"la division es: {miCasio.dividir()}") 
    miCasio.cambiarValor(40, 20)  
    print(f"la suma es: {miCasio.sumar()}")   
    print(f"la resta es: {miCasio.restar()}") 
    print(f"la multiplicacion es: {miCasio.multiplicar()}")  
    print(f"la division es: {miCasio.dividir()}") 

    texas = Calculadora(45, 69)
    print(f"la suma es: {texas.sumar()}")   
    print(f"la resta es: {texas.restar()}")  
    print(f"la multiplicacion es: {texas.multiplicar()}")  
    print(f"la division es: {texas.dividir()}")