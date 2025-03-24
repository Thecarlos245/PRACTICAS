class Persona:
    def __init__(self, edad, nombre, ciudad):
        self.edad = edad
        self.nombre = nombre
        self.ciudad = ciudad

    def Mostrar(self):
        return f"Hola, soy {self.nombre} de {self.ciudad}"

    def VerificarEdad(self):
        if(self.edad >= 18):
            print(f"{self.nombre} es mayor de edad")
        else:
            print(f"{self.nombre} es menor de edad")
# a) Mostrar saludo
p1 = Persona(21,"carlos","La Paz")
print(p1.Mostrar())
# b) Crea 3 persona y su saludo 
p2 = Persona(10,"Mauricio","Beni")
p3 = Persona(18,"Manuel","Santa Cruz")
p4 = Persona(10,"Erland","La Paz")
print(p2.Mostrar())
print(p3.Mostrar())
print(p4.Mostrar())

# c) Verificar si es mayor de edad
p1.VerificarEdad()
p2.VerificarEdad()
p3.VerificarEdad()
p4.VerificarEdad()


