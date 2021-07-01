package bridge.ejercicio;

public abstract class IRedSocial {
    private String nombre;


    public IRedSocial(String name ){
        this.nombre= name;

    }

    public void showinfo(ISistema sistema){
        System.out.println("Mostrando info del sistema");
        System.out.println("Nombre: "+sistema.getNombre());
        System.out.println("Capacidad: "+sistema.getCapacidad());
        System.out.println("Estudiantes: "+sistema.getEstudiantes().length);
        System.out.println("Requisitos: "+sistema.getRequisitos().length);
    }

}
