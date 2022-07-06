package listas;

/**
 *
 * @author Daniel
 */
public class Nodo {
    Persona alumno;
    Nodo sig;

    public Nodo(int _id, String _nombre, Integer _edad, int n1, int n2, int n3) {
        this.alumno = new Persona(_id, _nombre, _edad,
                n1, n2, n3);
        this.sig = null;
    }
}
