package listasDobles;

public class Nodo {

    int dato;
    Nodo ant;
    Nodo sig;

    public Nodo(int dat, Nodo a, Nodo s){
        dato = dat;
        sig = s;
        ant = a;
    }


}
