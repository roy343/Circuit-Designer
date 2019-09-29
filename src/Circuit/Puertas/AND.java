package Circuit.Puertas;

import java.lang.reflect.AnnotatedArrayType;

public class AND{
    //Entradas y salida del nodo
    private AND entry1;
    private AND entry2;
    private AND exit;

    //Verificadores de corriente
    public boolean i1;
    public boolean i2;
    public boolean o1;

    //Constructor de la clase
    public AND(AND entry1, AND entry2, AND exit) {
    }

    public boolean geti1(){
        return i1;
    }

    public boolean geti2(){
        return i2;
    }

    public boolean geto1(){
        return o1;
    }

    public void AND(boolean i1, boolean i2, boolean o1){
        i1 = geti1();
        i2 = geti2();
        o1 = geto1();
        if(i1 == true){
            if(i2 == true){
                o1 = true;
            }
        }o1 = false;
    }




}
//Fin de la clase


