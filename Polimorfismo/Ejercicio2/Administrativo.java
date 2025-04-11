package Polimorfismo.Ejercicio2;

public class Administrativo {
    private String nombre;
     private float sueldoMes;
    private String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }

    public double SueldoTotal(){
        return sueldoMes;
    }
    
    public void mostrar(){
        System.out.println("El sueldo total del Administrativo es " + SueldoTotal());
    }
    
     public float mostrarEmpleados(){
        float x = 2300;
        if(getSueldoMes() == x){
            System.out.println("El mesero " + nombre + " tiene el mismo sueldo que X "); 
        }else{
            System.out.println("no es el mismo");
        }
        return x;
        
    }
    
    public float getSueldoMes(){
        return sueldoMes;
    }

    
    
}
