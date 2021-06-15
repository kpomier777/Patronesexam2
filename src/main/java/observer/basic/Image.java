package observer.basic;

public class Image {
    private String titulo;


    public Image(String titulo){
        this.titulo=titulo;

    }

    public void info(){
        System.out.println("INFO > titulo: "+titulo);

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
