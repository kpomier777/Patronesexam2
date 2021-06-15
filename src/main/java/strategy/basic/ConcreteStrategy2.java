package strategy.basic;

import java.util.Collections;
import java.util.List;

public class ConcreteStrategy2 implements IStrategyOrdenamiento {


    @Override
    public void cambiar(List<Usuarios> usuarioList) {
        System.out.println("Usuario Name Sorting:");
        Collections.sort(usuarioList, Usuarios.NameORDER);

        for(Usuarios str: usuarioList){
            str.info();
        }
    }
}
