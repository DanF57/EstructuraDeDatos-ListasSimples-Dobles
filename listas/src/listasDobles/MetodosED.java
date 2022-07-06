package listasDobles;

import java.util.Scanner;

public class MetodosED {
    Nodo head;
    Nodo tail;
    Scanner entrada;

    public MetodosED() {
        head = null;
        tail = null;
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        int opc;
        System.out.println("Ingresar elemento final    [1]:");
        System.out.println("Ingresar elemento inicio   [2]:");
        System.out.println("Recorrer la lista          [3]:");
        System.out.println("Eliminar un numero de lista[4]:");
        System.out.println("Salir                      [0]:");
        opc = entrada.nextInt();
        return opc;
    }

    public boolean listaVacia() {
        return head == null;
    }

    public void insertarFinal() {

        System.out.println("Ingrese un número a insertar:");
        int dato = entrada.nextInt();

        if (listaVacia()) {
            tail = new Nodo(dato, null, null);
            head = tail;
        } else {
            Nodo nuevo = new Nodo(dato, tail, null);
            tail.sig = nuevo;
            tail = nuevo;
        }
    }

    public void insertarInicio() {

        System.out.println("Ingrese un número a insertar:");
        int dato = entrada.nextInt();

        if (listaVacia()) {
            head = new Nodo(dato, null, null);
            tail = head;
        } else {
            Nodo nuevo = new Nodo(dato, null, head);
            head.ant = nuevo;
            head = nuevo;
        }
    }

    public void eliminar() {
        System.out.println("Ingrese un número a eliminar:");
        int numero = entrada.nextInt();

        if (listaVacia()) {
            System.out.println("No hay elementos a eliminar");
        } else {
            if (numero == head.dato) {
                head = head.sig; // Si solamente había uno
                if (head == null) {
                    tail = null;
                }
            } else {
                Nodo actual = head;
                while ((actual.sig != null) && (numero != actual.sig.dato))
                    actual = actual.sig;
                if (actual == tail) {
                    System.out.println("El elemento no existe");
                } else {
                    actual.sig = actual.sig.sig;
                    if (actual.sig == null)
                        tail = actual;
                }
            }
        }
    }

    public void recorrer() {
        Nodo actual = head;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.sig;
        }
    }

}
