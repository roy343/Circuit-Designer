package Circuit.Puertas;

public class OR{
    //Entradas y salida del nodo
    private OR entry1;
    private OR entry2;
    private OR exit;

    //Verificadores de corriente
    public boolean i1;
    public boolean i2;
    public boolean o1;

    //Constructor de la clase
    public OR(OR entry1, OR entry2, OR exit,int n, boolean i1, boolean i2, boolean o1) {
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
    public void OR(boolean i1, boolean i2, boolean o1){
        i1 = geti1();
        i2 = geti2();
        o1 = geto1();

        if(i1 == false){
            if(i2 == false){
                o1 = false;
            }
        }o1 = true;

    }
}
