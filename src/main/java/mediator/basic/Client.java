package mediator.basic;

public class Client {

    public static void main (String[] args){
        ConcreteMediator mediator= new ConcreteMediator();

        Persona concreateColleague1 = new Persona(mediator);
        ConcreateColleague2 concreateColleague2 = new ConcreateColleague2(mediator);

        mediator.setUser1(concreateColleague1);
        mediator.setUser2(concreateColleague2);

        concreateColleague1.send("Hola como estas?");
        System.out.println("***");
        concreateColleague2.send("que tal me encuentro bien , y tu?");


    }

}
