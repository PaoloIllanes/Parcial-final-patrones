package bridge.ejercicio;

public class Client {

    public static  void main(String[]ags){

        ISistema colegio = new Colegio();
        ISistema universidad = new Universidad();
        ISistema escuela =  new Escuela();

        IRedSocial facebook = new Facebook();
        IRedSocial whatsapp = new Whatsapp();
        IRedSocial twitter = new Twitter();

        colegio.showInfo(facebook);
        universidad.showInfo(whatsapp);
        escuela.showInfo(twitter);

    }

}
