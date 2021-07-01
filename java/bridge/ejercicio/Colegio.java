package bridge.ejercicio;

public class Colegio extends ISistema {
    private static final String[] requisitos ={"uniforme","materias","disciplina","edad"} ;
    private static final String[] estudiantes = {"1","2","3","4","5","6","8","9","10"};

    public Colegio() {
        super("Colegio", 400,estudiantes, requisitos);


    }
}
