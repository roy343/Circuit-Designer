package Circuit.Puertas;

public class NOR{
    //Entradas y salida del nodo
    private NOR entry1;
    private NOR entry2;
    private NOR exit;

    //Verificadores de corriente
    boolean i1;
    boolean i2;
    boolean o1;

    //Constructor de la clase
    public NOR(NOR entry1, NOR entry2, NOR exit, boolean i1, boolean i2, boolean o1) {

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
    public void NOR(boolean i1, boolean i2, boolean o1){
        i1 = geti1();
        i2 = geti2();
        o1 = geto1();

        //Si ambas entradas son verdaderas devuelve "true"
        //En  caso contrario devuelve "false"
        if(i1 == false){
            if(i2 == false){
                o1 = true;
            }
        } o1 = false;
    }
}
