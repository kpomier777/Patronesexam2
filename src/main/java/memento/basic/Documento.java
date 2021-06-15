package memento.basic;

public class Documento {
    private String cambion;
    private String content;

    public Documento(){}

    public Documento(String cambion, String content) {
        this.cambion = cambion;
        this.content = content;
    }

    public String getCambion() {
        return cambion;
    }

    public void setCambion(String cambion) {
        this.cambion = cambion;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void info(){
        System.out.println("****");
        System.out.println("INFO > cambio: "+cambion);
        System.out.println("INFO > palabras agregadas: "+content);
        System.out.println("****");
    }
}
