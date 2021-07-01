package bridge.ejercicio;

public class Universidad extends ISistema {


    private static final String[] requisitos ={"uniforme","materias","disciplina","edad"} ;
    private static final String[] estudiantes = {"1","2","3","4","5","6"};

    public Universidad() {
        super("Universidad", 400,estudiantes, requisitos);
        
     
    }
}
