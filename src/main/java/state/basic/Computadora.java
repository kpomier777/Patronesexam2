package state.basic;


public class Computadora {

    private IStateComputadora state;
    private CPU cpu;
    private MemoriaRam memoriaRam;
    private String programasAbiertos;

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public String getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(String programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public MemoriaRam getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(MemoriaRam memoriaRam) {
        this.memoriaRam = memoriaRam;
    }



    public IStateComputadora getState() {
        return state;
    }

    public void setState(IStateComputadora state) {
        this.state = state;
    }

    public void request(){
        this.state.handler(this);
    }


}
