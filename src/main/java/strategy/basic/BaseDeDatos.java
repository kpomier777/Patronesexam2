package strategy.basic;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    private IStrategyOrdenamiento cambioOrdenamiento;
    private List<Usuarios> usuarioList= new ArrayList<>();
    public void cambiarEstrategiaOrdenamiento(){
        cambioOrdenamiento.cambiar(this.usuarioList);
    }

    public IStrategyOrdenamiento getModoOrdenamiento() {
        return cambioOrdenamiento;
    }

    public void setModoOrdenamiento(IStrategyOrdenamiento modoOrdenamiento) {
        this.cambioOrdenamiento = modoOrdenamiento;
    }

    public List<Usuarios> getUsuarioList() {
        return usuarioList;
    }

    public void setusuarioList(List<Usuarios> usuarioList) {
        this.usuarioList = usuarioList;
    }
}
