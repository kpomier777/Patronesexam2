package strategy.basic;

import java.util.*;

public class Client {
    public static void main (String[] args){

        BaseDeDatos bd = new BaseDeDatos();
        List<Usuarios> userList= new ArrayList<>();
        Date date1 = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
        Date date2 = new GregorianCalendar(1998, Calendar.DECEMBER, 10).getTime();
        Date date3 = new GregorianCalendar(1996, Calendar.FEBRUARY, 8).getTime();
        Date date4 = new GregorianCalendar(2021, Calendar.SEPTEMBER, 5).getTime();

        userList.add(new Usuarios("B",date1,"E",160));
        userList.add(new Usuarios("D",date2,"G",70));
        userList.add(new Usuarios("C",date3,"F",50));
        userList.add(new Usuarios("A",date4,"D",240));

        bd.setusuarioList(userList);
        bd.setModoOrdenamiento(new ConcreteStrategy1());
        bd.cambiarEstrategiaOrdenamiento();
        System.out.println("TERMINO ESTRATEGIA 1");

        bd.setusuarioList(userList);
        bd.setModoOrdenamiento(new ConcreteStrategy2());
        bd.cambiarEstrategiaOrdenamiento();
        System.out.println("TERMINO ESTRATEGIA 2");

        bd.setusuarioList(userList);
        bd.setModoOrdenamiento(new ConcreteStrategy3());
        bd.cambiarEstrategiaOrdenamiento();
        System.out.println("TERMINO ESTRATEGIA 3");

    }
}
