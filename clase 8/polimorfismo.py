class Persona:

    def __init__(self, nombre):
        self.nombre = nombre
    
    def avanza(self):
        print("Ando caminando")

class Cilcista(Persona):
    def __init__(self, nombre):
        super().__init__(nombre)

    def avanza(self):
         print("Ando moviendome en mi bicicleta")

if __name__=="__main__":
    persona = Persona("Pepe")
    persona.avanza()

    ciclista = Cilcista("Juanca")        
    ciclista.avanza()        
             
                