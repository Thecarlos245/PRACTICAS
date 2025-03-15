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

    public double calcularPromedio() {
        return (nota1 + nota2) / 2;
        
    }

    // b) metodo verifiAprovacion

    public double verificarAprovacion() {
        double promedio = calcularPromedio();
        if (promedio >= 6) {
            System.out.println(nombre + " aprobo la materia.");
        } else {
            System.out.println(nombre + " No aprobo la materia.");
        }
        return promedio;
    }
    public void mostrarPromedio() {
        System.out.println("El promedio de " + nombre + " es: " + calcularPromedio());
    }
    public void mostrarAprovacion() {
        System.out.println("El estudiante " + nombre + " " + verificarAprovacion());
        
    }


    public static void main(String[] args) {

        // c) Crear 3 estudiantes y mostrar su promedio y si aprobaron
        Estudiante e1 = new Estudiante("Carlos", 5, 6);
        Estudiante e2 = new Estudiante("Mauricio", 7, 8);
        Estudiante e3 = new Estudiante("Manuel", 4, 5);
       
        System.out.println("------ Estudiante1 ------");
        e1.mostrarAprovacion();
        e1.mostrarPromedio();
        System.out.println("------ Estudiante2 ------");
        e2.mostrarPromedio();
        e2.mostrarAprovacion();
        System.out.println("------ Estudiante3 ------");
        e3.mostrarPromedio();
        e3.mostrarAprovacion();
       
        
        
       
       
    }
 
    
}
