package Circuit;

import Circuit.Puertas.*;

public class Lista {

    private AND and1;//Head 1
    private AND and2;//Head 2
    private AND and3;//tail

    private NAND nand1;//Head 1
    private NAND nand2;//Head 2
    private NAND nand3;//tail

    private OR or1;//Head 1
    private OR or2;//Head 2
    private OR or3;//Tail

    private NOR nor1;//Head 1
    private NOR nor2;//Head 1
    private NOR nor3;//Tail

    private NOT not1;//Head 1
    private NOT not2;//Tail

    private XOR xor1;//Head 1
    private XOR xor2;//Head 2
    private XOR xor3;//Tail

    private XNOR xnor1;//Head 1
    private XNOR xnor2;//Head 2
    private XNOR xnor3;//Tail

    //Constructor de la lista
    public Lista(){
        and1 = null;
        and2 = null;
        and3 = null;
        nand1 = null;
        nand2 = null;
        nand3 = null;
        or1 = null;
        or2 = null;
        or3 = null;
        nor1 = null;
        nor2 = null;
        nor3 = null;
        not1 = null;
        not2 = null;
        xor1 = null;
        xor2 = null;
        xor3 = null;
        xnor1 = null;
        xnor2 = null;
        xnor3 = null;

    }

    public void addAND(char x){
        AND and = new AND(and1,and2,and3);
        if(and1 == null){
            if(and2 == null){
                and1 = and2 = and3 = and;
            }else{
            }

        }

    }

}


