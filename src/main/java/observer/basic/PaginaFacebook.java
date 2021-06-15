package observer.basic;

import java.util.ArrayList;
import java.util.List;

public class PaginaFacebook implements IPage {
    private List<IUsuario> observerList= new ArrayList<>();

    private List<Video> videoList = new ArrayList<>();
    private List<Image> imageList = new ArrayList<>();


    public void uploadNewVideo(Video video, Image image){
        videoList.add(video);
        this.notifyObserver(video,image);
    }

    @Override
    public void attach(IUsuario observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(IUsuario observer) {
       observerList.remove(observer);
    }

    @Override
    public void notifyObserver(Video video, Image image) {
        for (IUsuario userYoutube:observerList) {
            if (userYoutube.getPreference()){
                // notificacion
                userYoutube.update("Se subio un nuevo video titulo: "+video.getTitulo(),video);
            }else{
                // notificacion
                userYoutube.update("Se subio un nuevo video titulo: "+video.getTitulo()+" y la nueva imagen de titulo: "+image.getTitulo(),video);
            }

        }
    }


}
