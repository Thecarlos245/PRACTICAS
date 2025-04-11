package Polimorfismo.Ejercicio2;

public class Cocinero {
    private String nombre;
    private int sueldoMes;
    private int horasExtra;
    private float sueldoHora;

    public Cocinero(String nombre, int sueldoMes, int horasExtra, float sueldoHora) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
    }

    
    
    public double SueldoTotal(){
         return sueldoMes + (horasExtra * sueldoHora);
    }
    public void mostrar(){
        System.out.println("El sueldo total del cocinero es " + SueldoTotal());
    }
    
    public double mostrarEmpleados(){
        double x = 2300;
        if(getSueldoMes() == x){
            System.out.println("el cocinero " + nombre + " tiene el mismo sueldo que X "); 
        }else{
            System.out.println("no es el mismo");
        }
        return x;
        
    }
    
    public int getSueldoMes(){
        return sueldoMes;
    }
    
    
}
