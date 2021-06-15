package state.basic;



public class Prendido implements IStateComputadora {



    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: Prendido**");
        int cantidadProg=(int)(Math.random()*20+1);
        computadora.setProgramasAbiertos(""+cantidadProg);
        computadora.setMemoriaRam(new MemoriaRam(cantidadProg*5));
        computadora.setCpu(new CPU(cantidadProg*5));
        System.out.println("%Programas abiertos:"+computadora.getProgramasAbiertos());
        System.out.println("%Meoria Ram:"+computadora.getMemoriaRam().getPercentageUse()+"%");
        System.out.println("%Consumo CPU:"+computadora.getCpu().getPercentageUse()+"%");
        System.out.println("********");
    }
}
