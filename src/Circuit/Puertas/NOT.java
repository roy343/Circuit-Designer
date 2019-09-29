package Circuit.Puertas;

public class NOT{
    //Entradas y salida del nodo
    private NOT entry1;
    private NOT exit;

    //Verificadores de corriente
    public boolean i1;
    public boolean o1;

    //Constructor de la clase
    public NOT(NOT entry1, NOT exit, boolean i1, boolean o1) {
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

        //Devuelve el valor opuesto a la entrada
        if(i1 == true){
            o1 = false;
        }o1 = true;

    }
}

