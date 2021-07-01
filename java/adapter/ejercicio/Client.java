package adapter.ejercicio;

import adapter.basic.*;

public class Client {

    public static void main (String [] arggggg){
        CuadratrackElectrico cuadratrackElectrico = new CuadratrackElectrico();

        ICuadratrack diesel = new Diesel();
        ICuadratrack gasolina = new Gasolina();
        ICuadratrack gasEspecial = new GasolinaEspecial();
        CuadratrackElectricoAdaptado cuadraAdaptado = new CuadratrackElectricoAdaptado(cuadratrackElectrico);

        diesel.llenarGasolina(22);
        gasolina.llenarGasolina(33);
        gasEspecial.llenarGasolina(11);
        cuadraAdaptado.llenarGasolina(10);
        cuadraAdaptado.estadoCombustible();
    }

}
