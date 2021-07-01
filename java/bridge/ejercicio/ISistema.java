package bridge.ejercicio;

public abstract class ISistema {
    private String nombre;
    private int capacidad;
    private String[] estudiantes;
    private String[] requisitos;


    public ISistema(String nombre, int capacidad,String[] estudiantes,String[] requisitos){

        this.capacidad=capacidad;
        this.estudiantes= estudiantes;
        this.nombre=nombre;
        this.requisitos=requisitos;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(String[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String[] getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String[] requisitos) {
        this.requisitos = requisitos;
    }

    public void showInfo(IRedSocial redSocial){
        System.out.println("Mostrando informacion");
        redSocial.showinfo(this);

    }

}
