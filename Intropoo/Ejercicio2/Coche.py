class Coche:

    def __init__(self, marca, modelo, velocidad):
        self.marca = marca
        self.modelo = modelo 
        self.velocidad = velocidad
# a) Crear un método que acelere 
    def acelerar(self):
        self.velocidad += 10
        return f"El coche {self.marca} {self.modelo} ha acelerado a {self.velocidad} km/h"
# b) Crear un método que frene
    def frenar(self):
        self.velocidad -= 5
        return f"El coche {self.marca} {self.modelo} ha frenado a {self.velocidad} km/h"

    def mostar(self):
        return f"La velocidad que va {self.marca} {self.modelo} es de: {self.velocidad} km/h"

# c) Crear 2 coches
c1 = Coche("Toyota", "Corolla", 50)
c2 = Coche("Nissan", "Sentra", 80)
print(c1.mostar())
print(c2.mostar())
print("------ COCHE1 ------")
print(c1.acelerar())
print(c1.frenar())

print("------ COCHE2 ------")
print(c2.acelerar())
print(c2.frenar())