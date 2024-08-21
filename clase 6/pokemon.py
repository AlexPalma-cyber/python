class Pokemon:
    nombre = None
    tipo = None
    vida = None
    evolucion = None
    ataque = None

    def __init__(self, nombre, tipo, vida, evolucion = 1):
        self.nombre = nombre
        self.tipo = tipo
        self.vida = vida
        self.evolucion = evolucion #1, 2 o 3
        self.ataque = []

    def setAtaque(self, ataque):
        self.ataque.append(ataque)    

    def atacar(self, i):
        return(f"{self.nombre} ataco con {self.ataque[i]}")   

    def defenderse(self):
        return(f"{self.nombre} se defendio")

if __name__ == "__main__":
    pikachu = Pokemon(tipo = "Electrico", nombre = "Pikachu", vida= 200)
    charizard = Pokemon(tipo = "Fuego", nombre = "Charizard", vida= 300, evolucion= 3)
    pikachu.setAtaque("impactrueno")
    pikachu.setAtaque("coletazo")
    pikachu.setAtaque("arañazo")
    charizard.defenderse
print(pikachu.atacar(0))
print(charizard.defenderse())
