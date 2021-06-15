package state.basic;

public class CPU {
       private int percentageUse=0;


       public CPU(int percentageUse){
           this.percentageUse=percentageUse;

       }

    public int getPercentageUse() {
        return percentageUse;
    }

    public void setPercentageUse(int percentageUse) {
        this.percentageUse = percentageUse;
    }

}
