package adapter.ejercicio;

public class CuadratrackElectricoAdaptado extends ICuadratrack{

    private CuadratrackElectrico cuadra;

    public CuadratrackElectricoAdaptado(CuadratrackElectrico cua) {
        super("Electrico");
        this.cuadra=cua;


    }
    @Override
    public void llenarGasolina(int cantidad){
        System.out.println("Adaptando Cuadratrack Electrico");
        cuadra.cargar(cantidad);
    }
    @Override
    public void estadoCombustible( ){
        System.out.println("Adaptando Cuadratrack Electrico");
        cuadra.estadoElectricidad();

    }
}
