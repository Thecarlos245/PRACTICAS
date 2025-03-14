package Intropoo.Ejercicio3;

public class Estudiante {
    String nombre;
    double nota1;
    double nota2;

    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // a) metodo calcular promedio

    public void calcularPromedio() {
        double promedio = (nota1 + nota2) / 2;
        System.out.println("El promedio de " + nombre + " es: " + promedio);
    }

    // b) metodo verifiAprovacion

    public void verificarAprovacion() {
        double promedio = (nota1 + nota2) / 2;
        if (promedio >= 6) {
            System.out.println(nombre + " Aprobo la materia.");
        } else {
            System.out.println(nombre + " No aprobo la materia.");
        }
    }


    public static void main(String[] args) {

        // c) Crear 3 estudiantes y mostrar su promedio y si aprobaron
        Estudiante e1 = new Estudiante("Carlos", 5, 6);
        Estudiante e2 = new Estudiante("Mauricio", 7, 8);
        Estudiante e3 = new Estudiante("Manuel", 4, 5);
       
        e1.calcularPromedio();
        e2.calcularPromedio();
        e3.calcularPromedio();
       
        e1.verificarAprovacion();
        e2.verificarAprovacion();
        e3.verificarAprovacion();
       
    }
 
    
}
