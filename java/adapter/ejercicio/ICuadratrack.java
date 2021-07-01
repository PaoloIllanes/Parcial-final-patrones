package adapter.ejercicio;

import java.util.Random;

public abstract class ICuadratrack {
    private int gasolina;
    private String tipoGas;


    public ICuadratrack(String tipoGas){
        this.gasolina= 0;
        this.tipoGas= tipoGas;
    }

    public void llenarGasolina(int cantidad){

        gasolina+= cantidad;
        System.out.println("cargando "+cantidad+" litros de "+ tipoGas);
    }
    public void estadoCombustible(){
        Random ran = new Random();
        int estado=ran.nextInt(50);
        System.out.println("Estado del combustible : "+estado+" lts");
    }
}
