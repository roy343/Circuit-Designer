package Circuit.Puertas;

public class XOR{
    //Entradas y salida del nodo
    private OR entry1;
    private OR entry2;
    private OR exit;

    //Verificadores de corriente
    public boolean i1;
    public boolean i2;
    public boolean o1;

    //Constructor de la clase
    public XOR(OR entry1, OR entry2, OR exit, boolean i1, boolean i2, boolean o1) {
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
    public void XOR(boolean i1, boolean i2, boolean o1){
        i1 = geti1();
        i2 = geti2();
        o1 = geto1();

        //Si las entradas son iguales devuelve "false"
        //En caso contrario devuleve "true"
        if(i1 == i2){
            o1 = false;
        }o1 = true;
    }
}
