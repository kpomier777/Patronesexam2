package observer.basic;

public class Client {

    public static void main (String [] args){
        PaginaFacebook facebookupb= new PaginaFacebook();

        UsuarioNotificado user1= new UsuarioNotificado(new Persona("123","Juan"),true);
        UsuarioNotificado user2= new UsuarioNotificado(new Persona("124","Juan1"),false);
        UsuarioNotificado user3= new UsuarioNotificado(new Persona("125","Juan2"),true);
        UsuarioNotificado user4= new UsuarioNotificado(new Persona("126","Juan3"),false);
        UsuarioNotificado user5= new UsuarioNotificado(new Persona("126","Juan3"),false);

        facebookupb.attach(user1);
        facebookupb.attach(user2);
        facebookupb.attach(user3);
        facebookupb.attach(user4);
        facebookupb.attach(user5);


        facebookupb.uploadNewVideo(new Video("IngSoft"), new Image("Imagen"));
    }



}
