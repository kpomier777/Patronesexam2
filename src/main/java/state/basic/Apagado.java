package state.basic;



public class Apagado implements IStateComputadora {

    public Apagado(){

    }


    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: Apagado **");
        computadora.setProgramasAbiertos("0");
        computadora.setMemoriaRam(new MemoriaRam(7));
        computadora.setCpu(new CPU(10));
        System.out.println("%Programas abiertos:"+computadora.getProgramasAbiertos());
        System.out.println("%Meoria Ram:"+computadora.getMemoriaRam().getPercentageUse()+"%");
        System.out.println("%Consumo CPU:"+computadora.getCpu().getPercentageUse()+"%");
        System.out.println("********");
    }
}
