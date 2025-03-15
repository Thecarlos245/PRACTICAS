package Intropoo.Ejercicio4;

public class Celular {
    String aplicacion;
    int bateria;
    int memoria;
    double minutos;

    public Celular(String aplicacion, int bateria, int memoria, double minutos) {
        this.aplicacion = aplicacion;
        this.bateria = bateria;
        this.memoria = memoria;
        this.minutos = minutos;
    }

    // a)  instalar aplicacion

    public void instalarAplicacion() {
        System.out.println("Se instalo una aplicacion: " + aplicacion);
    }

    // b) utilizar Aplicacion

    public void utilizarAplicacion(int memmoria, double minutos) {
        double consumoBateria = 0;
        if (memmoria >= 100) {
            consumoBateria = (minutos/10) * 0.2;
            
        }else if(memoria >= 250) {
            consumoBateria = (minutos/10) * 0.5;
           
        }else{
            consumoBateria = (minutos/10) * 0.1;

        }
        bateria -= consumoBateria;
        if (bateria < 0) {
            bateria = 0;
        }
        System.out.println("Se utilizó la aplicación " + aplicacion + " por " + minutos + " minutos. Batería restante: " + bateria + "%");
        
        // d) apagar celular
        if(bateria == 0){
            System.out.println("Celular apagado.");
        }
    }

     // c) mostrar porcentaje de batería restante
     public void mostrarBateriaRestante() {
        System.out.println("Batería restante: " + bateria + "%");
    }
  



    public static void main(String[] args) {

        
        Celular c1 = new Celular("Facebook", 50, 100, 20);
        Celular c2 = new Celular("Instagram", 60, 250, 40);
        Celular c3 = new Celular("Whatsapp", 0, 230, 0);
       
        c1.instalarAplicacion();
        c2.instalarAplicacion();
        c3.instalarAplicacion();
       
        c1.utilizarAplicacion(100, 20);
        c2.utilizarAplicacion(250, 40);
        c3.utilizarAplicacion(230, 0);
       

        // c) Mostrar bateria restante
        c1.mostrarBateriaRestante();
        c2.mostrarBateriaRestante();
        c3.mostrarBateriaRestante();
       
    }


    
}
