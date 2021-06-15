package strategy.basic;

import java.util.List;

public class ConcreteStrategy3 implements IStrategyOrdenamiento {


    @Override
    public void cambiar(List<Usuarios> usuarioList) {
        System.out.println("Usuario date Sorting:");
    }
}
