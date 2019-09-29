package Circuit.Puertas;

public class NAND{
    //Entradas y salida del nodo
    private NAND entry1;
    private NAND entry2;
    private NAND exit;

    //Verificadores de corriente
    boolean i1;
    boolean i2;
    boolean o1;

    //Constructor de la clase
    public NAND(NAND entry1, NAND entry2, NAND exit, boolean i1, boolean i2, boolean o1) {

    }

    //Funciones encargadas de retornar los datos de los verificadores de corriente

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
    public void NAND(boolean i1, boolean i2, boolean o1){
        i1 = geti1();
        i2 = geti2();
        o1 = geto1();

        //Si ambas entradas son verdaderas devuelve "false"
        //En  caso contrario devuelve "true"
        if(i1 == true){
            if(i2 == true){
                o1 = false;
            }
        }o1 = true;
    }


}
