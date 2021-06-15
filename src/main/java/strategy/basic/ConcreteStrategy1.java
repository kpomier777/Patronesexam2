package strategy.basic;

import java.util.Collections;
import java.util.List;

public class ConcreteStrategy1 implements IStrategyOrdenamiento {

    @Override
    public void cambiar(List<Usuarios> usuarioList) {
        System.out.println("Usuario Name Sorting:");
        Collections.sort(usuarioList, Usuarios.CiORDER);

        for(Usuarios str: usuarioList){
            str.info();
        }

    }
}
