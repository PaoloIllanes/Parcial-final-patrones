package bridge.ejercicio;

public class Escuela extends ISistema {
    private static final String[] requisitos ={"uniforme","materias","edad"} ;
    private static final String[] estudiantes = {"1","2","3"};

    public Escuela() {
        super("Escuela", 400,estudiantes, requisitos);


    }
}
