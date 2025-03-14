class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def __str__(self):
        return f"Hola, soy {self.nombre} de {self.ciudad}"

    def es_mayor_de_edad(self):
        if(self.edad >= 18):
            print(f"{self.nombre} es mayor de edad")
        else:
            print(f"{self.nombre} es menor de edad")

p1 = Persona("Juan", 20, "Lima")
print(p1)

p2 = Persona("Ana", 15, "Arequipa")
p3 = Persona("Pedro", 30, "Cusco")
p4 = Persona("Maria", 18, "Trujillo")
print(p2)
print(p3)
print(p4)


p1.es_mayor_de_edad()
p2.es_mayor_de_edad()
p3.es_mayor_de_edad()
p4.es_mayor_de_edad()