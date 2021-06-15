package observer.basic;

public class UsuarioNotificado implements IUsuario {
    private boolean soloVideo;
    private Persona persona;

    public UsuarioNotificado(Persona persona, boolean soloVideo) {
        this.persona=persona;
        this.soloVideo=soloVideo;
    }

    @Override
    public void update(String message, Video video) {
        System.out.println("********* NOTIFY *********");
        System.out.println(message);
        persona.info();
        video.info();

    }

    @Override
    public boolean getPreference() {
        return this.soloVideo;
    }
}
