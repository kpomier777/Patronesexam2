package observer.basic;

public class Video {
    private String titulo;


    public Video (String titulo){
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
