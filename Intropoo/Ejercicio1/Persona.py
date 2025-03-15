class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def mostrar(self):
        return f"Hola, soy {self.nombre} de {self.ciudad}"

    def mayorEdad(self):
        if(self.edad >= 18):
            print(f"{self.nombre} es mayor de edad")
        else:
            print(f"{self.nombre} es menor de edad")
# a) Mostrar saludo
p1 = Persona("Juan", 20, "Lima")
print(p1.mostrar)
# b) Crea 3 persona y su saludo 
p2 = Persona("Ana", 15, "Arequipa")
p3 = Persona("Pedro", 30, "Cusco")
p4 = Persona("Maria", 18, "Trujillo")
print(p2.mostrar)
print(p3.mostrar)
print(p4.mostrar)

# c) Verificar si es mayor de edad
p1.mayorEdad()
p2.mayorEdad()
p3.mayorEdad()
p4.mayorEdad()


