package memento.basic;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> stateSaved= new ArrayList<>();
    private int index = -1;

    public void addMemento(Memento memento){
        stateSaved.add(memento);
        index++;
    }

    public Memento getMemento(int statePosition){
        return stateSaved.get(statePosition);
    }
    public Memento revertir() {
        index--;
        return stateSaved.get(index);
    }

    public Memento deshacer() {
        index++;
        return stateSaved.get(index);
    }
}
