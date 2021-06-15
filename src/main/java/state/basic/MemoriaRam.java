package state.basic;

public class MemoriaRam {
      private int percentageUse=0;

      public MemoriaRam(int percentageUse){
          this.percentageUse=percentageUse;

      }

    public int getPercentageUse() {
        return percentageUse;
    }

    public void setPercentageUse(int percentageUse) {
        this.percentageUse = percentageUse;
    }


}
