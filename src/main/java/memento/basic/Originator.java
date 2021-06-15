package memento.basic;

public class Originator {
    private Documento state;
    private CareTaker careTaker;

    public Originator(CareTaker careTaker) {
        this.careTaker = careTaker;
    }


    public void setState(Documento state) {
        System.out.println("**** Set State *****");
        state.info();
        this.state = state;
    }

    public Documento getState() {
        return state;
    }

    public Memento createMemento(){
        System.out.println("**** Create State *****");
        state.info();
        return new Memento(state) ;
    }

    public void restoreFromMemento(Memento memento){
        state=memento.getState();
        System.out.println("**** State Restored *****");
        state.info();
    }
    public void revertir() {
        System.out.println("Revertir a cambio anterior..");
        state = careTaker.revertir().getState();
        state.info();
    }

    public void deshacer() {
        System.out.println("Deshacer cambio...");
        state = careTaker.deshacer().getState();
        state.info();
    }

}
