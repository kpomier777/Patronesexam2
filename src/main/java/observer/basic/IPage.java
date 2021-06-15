package observer.basic;

public interface IPage {
    void attach(IUsuario observer);
    void deattach(IUsuario observer);
    void notifyObserver(Video video, Image image);
}
