package Circuit.Puertas;

public class Linea{

    //Entradas y salida del nodo
    private Linea entry1;
    private Linea exit;

    //Verificadores de corriente
    public boolean i1;
    public boolean o1;

    //Constructor de la clase
    public Linea(NOT entry1, NOT exit, boolean i1, boolean o1) {
    }

    //Funcion que dicta que si la compuerta es el primer elemento del circuito siempre retorne un valor positivo
    private void firsElement(){
        if(entry1 == null){
            o1 = true;
        }
    }

    //Devuelve el valor de i1
    public boolean geti1() {
        return i1;
    }

    //Devuelve el valor de o1
    public boolean geto1(){
        return o1;
    }

    //Funcion encargada de la logica de la puerta
    public void NOT(boolean i1, boolean o1){
        i1 = geti1();
        o1 = geto1();

        //Devuelve el mismo valor de la entrada
        if(i1 == true){
            o1 = true;
        }o1 = false;

    }

}
