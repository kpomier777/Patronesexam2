package strategy.basic;

import java.util.Collections;
import java.util.List;

public class ConcreteStrategy3 implements IStrategyOrdenamiento {


    @Override
    public void cambiar(List<Usuarios> usuarioList) {
        System.out.println("Usuario date Sorting:");
        Collections.sort(usuarioList, Usuarios.DateORDER);

        for(Usuarios str: usuarioList){
            str.info();
        }
    }
}
