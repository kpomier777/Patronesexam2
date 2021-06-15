package state.basic;



public class Client {
    public static void main(String []args){
        int cantidadProg=(int)(Math.random()*20+1);
        IStateComputadora state = new Apagado();
        Computadora computadora = new Computadora();
        computadora.setState(state);
        computadora.request();

        state = new Reiniciar(cantidadProg);
        computadora.setState(state);
        computadora.request();

        state = new Prendido();
        computadora.setState(state);
        computadora.request();



    }
}
