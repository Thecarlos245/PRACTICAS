class Videojuego:
    def __init__(self, nombre, plataforma="Desconocido", cantidadJugadores= 1):
        self.__nombre = nombre
        self.__plataforma = plataforma
        self.__cantidadJugadores = cantidadJugadores


    def mostrar(self):
        print("Nombre: ", self.__nombre)
        print("Plataforma: ", self.__plataforma)
        print("Cantidad de jugadores: ", self.__cantidadJugadores)


    def agragarJugadores(self):
        self.__cantidadJugadores += 1

    def agregarJugadores(self, cantidad=1):
        self.__cantidadJugadores += cantidad
       
j1 = Videojuego("Fornite", "PC",5)
j2 = Videojuego("FIFA 22", "PS4")

j1.mostrar()
j2.mostrar()

j1.agregarJugadores()
j2.agregarJugadores(3)

print("\nDespués de agregar jugadores:")
j1.mostrar()
j2.mostrar()
        