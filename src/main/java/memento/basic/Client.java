package memento.basic;

public class Client {
    public static void main (String [] args){
        // el careTaker es el que guarda lo mementos
        CareTaker careTaker= new CareTaker();
        // el originator es el creador de los mementos
        Originator originator= new Originator();

        Documento concreteObject;

        concreteObject= new Documento("cambio 1","Este documento ");
        originator.setState(concreteObject);
        careTaker.addMemento(originator.createMemento());

        concreteObject= new Documento("cambio 2","se ");
        originator.setState(concreteObject);
        careTaker.addMemento(originator.createMemento());// [0]Guadamos nuestro primer estado estado

        concreteObject= new Documento("cambio 3","esta modificando ");
        originator.setState(concreteObject);
        careTaker.addMemento(originator.createMemento());

        concreteObject= new Documento("cambio 4","para examen.");
        originator.setState(concreteObject);
        careTaker.addMemento(originator.createMemento());// [1]Guadamos nuestro segundo estado estado


        originator.revertir();
        originator.revertir();
        originator.revertir();

        originator.deshacer();
        originator.deshacer();
        originator.deshacer();
    }
}
