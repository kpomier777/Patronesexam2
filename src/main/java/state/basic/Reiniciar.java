package state.basic;


public class Reiniciar implements IStateComputadora {

    private int programaPrendidos;

    public Reiniciar(int programaPrendidos) {
        this.programaPrendidos = programaPrendidos;
    }

    public int getProgramaPrendidos() {
        return programaPrendidos;
    }

    public void setProgramaPrendidos(int programaPrendidos) {
        this.programaPrendidos = programaPrendidos;
    }

    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: Reiniciando**");
        computadora.setProgramasAbiertos(""+getProgramaPrendidos());
        computadora.setMemoriaRam(new MemoriaRam(0));
        computadora.setCpu(new CPU(0));
        System.out.println("%Programas abiertos:"+computadora.getProgramasAbiertos());
        System.out.println("Cerrando..."+getProgramaPrendidos()+" programas");
        System.out.println("%Meoria Ram:"+computadora.getMemoriaRam().getPercentageUse()+"%");
        System.out.println("%Consumo CPU:"+computadora.getCpu().getPercentageUse()+"%");
        System.out.println("********");
    }
}
