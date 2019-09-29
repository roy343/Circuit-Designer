package Circuit.Puertas;

public class NOT{
    //Entradas y salida del nodo
    private NOT entry1;
    private AND exit;

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

    public boolean geti1() {
        return i1;
    }

    public boolean geto1(){
        return o1;
    }
    public void NOT(boolean i1, boolean o1){
        i1 = geti1();
        o1 = geto1();

        if(i1 == true){
            o1 = false;
        }o1 = true;

    }
}

