package Circuit;

import Circuit.Puertas.*;

public class Lista {

    private AND and1;//Head 1
    private AND and2;//Head 2
    private AND and3;//Head 3

    private NAND nand1;//Head 1
    private NAND nand2;//Head 2
    private NAND nand3;//Head 3

    //Constructor
    public Lista(){
        and1 = null;
        and2 = null;
        and3 = null;
        nand1 = null;
        nand2 = null;
        nand3 = null;
    }

    public void addAND(char x){
        AND a = new AND(and1,and2,and3);

    }

}


