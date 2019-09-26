package Circuit.Puertas;

public class Door {
    private int i1;
    private int i2;
    private int o2;

    //Entradas y salida del nodo
    private Door entry1;
    private Door entry2;
    private Door exit;
    private int n;
    //Constructor del nodo
    public Door(Door entry1,Door entry2, Door exit,int n){
        this.entry1 = entry1;
        this.entry2 = entry2;
        this.exit = exit;
        this.n = n;
    }

    public void setNext(Door n){
        exit = n;
    }

}
