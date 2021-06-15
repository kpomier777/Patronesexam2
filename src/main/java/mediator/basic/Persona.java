package mediator.basic;


public class Persona extends Colleague {

    private String identificacion;
    private String cargo;
    private String name;

    public Persona(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO - mensage recivido "+cargo+","+name+">"+message);
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
