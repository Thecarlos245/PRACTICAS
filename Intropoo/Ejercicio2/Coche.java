package Intropoo.Ejercicio2;

public class Coche {
    String marca;
    String modelo;
    int velocidad;

    public Coche(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
  
    // a) metodo acelerar
    public void acelerar() {
        velocidad += 10;
        System.out.println(marca + " " + modelo + " acelero en: " + velocidad + " km/h");
        
    }
    // b) metodo frenar 
    public void frenar() {
         velocidad -= 5;          
        System.out.println(marca + " " + modelo + " freno en: " + velocidad + " km/h");
   
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
    public static void main(String[] args ){
        Coche c1 = new Coche("BMW","audi",50);
        Coche c2 = new Coche("Ford","Deveste",80);
        System.out.println("------ LA VELOCIDAD QUE VA ------");
        System.out.println("La velocidad de " + c1.getMarca() + " " + c1.getModelo() + " " + " es de " + c1.getVelocidad() + "km/h");
        System.out.println("La velocidad de " + c2.getMarca() + " " + c2.getModelo() + " " + " es de " + c2.getVelocidad() + "km/h");    
        System.out.println("------ Coche1 ------");
        c1.acelerar();
        c1.frenar();
        System.out.println("------ Coche2 ------");
        c2.acelerar();
        c2.frenar();
    }
    
}
