package visitor.ejercicio;

import java.util.Random;

public class Turista implements ITurista{
    private String nombre;
    private int dinero;
    private int ci;

    @Override
    public void viajar(IDepartamento departamento){
        String nombre = departamento.getNombre();
        switch (nombre)
        {
            case "Cochabamba":
                System.out.println("viajando a Cochabamba");
                dinero-= (departamento.getHabitantes()/100)*10;
                System.out.println("Dinero:"+ dinero);
            case "Santa Cruz":
                System.out.println("viajando a Santa Cruz");
                dinero-= departamento.getProvincias()/2;
                System.out.println("Dinero:"+ dinero);
            default:
                Random r = new Random();
                System.out.println("viajando a La Paz");
                dinero-=r.nextInt(dinero);
                System.out.println("Dinero:"+ dinero);
        }
    }
}
