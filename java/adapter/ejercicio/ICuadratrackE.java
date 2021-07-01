package adapter.ejercicio;

import java.util.Random;

public abstract class ICuadratrackE {
    private int carga;
    private String vehiculo;

    public  ICuadratrackE(String vehiculoE){

        this.carga=0;
        this.vehiculo= vehiculoE;
    }

    public void cargar(int cantidad){
        carga+= cantidad;
        System.out.println("cargando : "+cantidad+" %");


    }
    public void estadoElectricidad(){
        Random ran = new Random();

        int estado =ran.nextInt(10);
        System.out.println("Estado de la carga :"+estado+" %" );
    }
}
