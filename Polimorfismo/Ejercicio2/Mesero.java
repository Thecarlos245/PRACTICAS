package Polimorfismo.Ejercicio2;

public class Mesero {
    private String nombre;
    private int sueldoMes;
    private int horasExtra;
    private float sueldoHora;
    private float propina;

    public Mesero(String nombre, int sueldoMes, int horasExtra, float sueldoHora, float propina) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtra = horasExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }

    public double SueldoTotal() {
        return sueldoMes + (horasExtra * sueldoHora) + propina;
    }
    public void mostrar(){
        System.out.println("El sueldo total del mesero es " + SueldoTotal());
    }
    
     public double mostrarEmpleados(){
        double x = 2300;
        if(getSueldoMes() == x){
            System.out.println("el mesero" + nombre + " tiene el mismo sueldo que X"); 
        }else{
            System.out.println("no es el mismo");
        }
        return x;
        
    }
    
    public int getSueldoMes(){
        return sueldoMes;
    }
    
}
