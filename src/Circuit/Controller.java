package Circuit;

import Circuit.Puertas.*;
import javafx.scene.control.Button;

public class Controller {

    public Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;

    public void callAND(){
        AND A = new AND();
        A.AND();
    }
    public void callNAND(){
        NAND N = new NAND();
        N.NAND();

    }
    public void callOR(){
        OR or = new OR();
        or.OR();

    }
    public void callNOR(){
        NOR nr = new NOR();
        nr.NOR();
    }
    public void callNOT(){
        NOT nt = new NOT();
        nt.NOT();

    }
    public void callXOR(){
        XOR xr = new XOR();
        xr.XOR();
    }
    public void callXNOR(){
        XNOR xn = new XNOR();
        xn.XNOR();
    }
}
