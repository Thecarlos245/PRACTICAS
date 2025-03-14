class Coche:

    def __init__(self, marca, modelo, velocidad):
        self.marca = marca
        self.modelo = modelo 
        self.velocidad = velocidad

    def acelerar(self):
        self.velocidad += 10

    def frenar(self):
        self.velocidad -= 5

    def getVelocidad(self):
        return f"La velocidad que va {self.marca} {self.modelo} es de: {self.velocidad}"

   
c1 = Coche("Toyota", "Corolla", 50)
c2 = Coche("Nissan", "Sentra", 80)
c1.getVelocidad()
c2.getVelocidad()