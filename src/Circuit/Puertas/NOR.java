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

    public boolean geti1(){
        return i1;
    }

    public boolean geti2(){
        return i2;
    }

    public boolean geto1(){
        return o1;
    }

    public void NOR(boolean i1, boolean i2, boolean o1){
        i1 = geti1();
        i2 = geti2();
        o1 = geto1();

        if(i1 == true){
            if(i2 == true){
                o1 = false;
            }
        } o1 = true;
    }
}
