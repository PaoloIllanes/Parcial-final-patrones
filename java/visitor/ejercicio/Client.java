package visitor.ejercicio;

public class Client {
    public static void main (String[]args){

IDepartamento cocha = new Cochabamba();
IDepartamento santacruz= new SantaCruz();
IDepartamento lapaz = new LaPaz();
ITurista turista = new Turista();

turista.viajar(cocha);
turista.viajar(santacruz);
turista.viajar(lapaz);



    }
}
