package Circuit.Puertas;

public class XNOR{
    //Entradas y salida del nodo
    private XNOR entry1;
    private XNOR entry2;
    private XNOR exit;

    //Verificadores de corriente
    public boolean i1;
    public boolean i2;
    public boolean o1;

    //Constructor de la clase
    public XNOR(XNOR entry1, XNOR entry2, XNOR exit, boolean i1, boolean i2, boolean o1) {
    }


    //Devuelve el valor de i1
    public boolean geti1(){
        return i1;
    }

    //Devuelve el valor de i2
    public boolean geti2(){
        return i2;
    }

    //Devuelve el valor de o1
    public boolean geto1(){
        return o1;
    }

    //Funcion encargada de la logica de la puerta
    public void XNOR(boolean i1, boolean i2, boolean o1){
        i1 = geti1();
        i2 = geti2();
        o1 = geto1();

        //Si las entradas son iguales devuelve "true"
        //En caso contrario devuleve "false"
        if(i1 == i2){
            o1 = true;
        }o1 = false;
    }


}
