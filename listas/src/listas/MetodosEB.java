package listas;

import java.util.Scanner;

public class MetodosEB {
    
    Nodo head;
    Nodo tail;
    Scanner entrada;

    public MetodosEB() {
        this.head = null;
        this.tail = null;
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        int opc;
        System.out.println("Ingresar nuevo elemento [1]: ");
        System.out.println("Recorrer la lista       [2]:");
        System.out.println("Ingresar Ordenado       [3]:");
        System.out.println("Salir                   [0]:");
        opc = entrada.nextInt();
        return opc;
    }

    public boolean listaVacia() {
        if (head == null)
            return true;
        else
            return false;
    }

    public void ingresar() {
        int _id;
        String _nombre;
        int _edad, n1, n2, n3;

        System.out.println("Ingrese Id del alumno: (Entero)");
        _id = entrada.nextInt();
        entrada.nextLine(); // Limpieza de buffer
        System.out.println("Ingrese nombre del alumno: ");
        _nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del alumno:");
        _edad = entrada.nextInt();
        System.out.println("Ingrese la nota 1: ");
        n1 = entrada.nextInt();
        System.out.println("Ingrese la nota 2: ");
        n2 = entrada.nextInt();
        System.out.println("Ingrese la nota 3: ");
        n3 = entrada.nextInt();

        Nodo nuevo = new Nodo(_id, _nombre, _edad, n1, n2, n3);
        /*
         * if(listaVacia()){
         * head = nuevo;
         * }else{
         * tail.sig = nuevo;
         * }
         * tail = nuevo;
         */
        nuevo.sig = head;
        if (listaVacia())
            tail = nuevo;
        head = nuevo;
    }

    public void ingresarF() {
        int _id;
        String _nombre;
        int _edad, n1, n2, n3;
        System.out.println("Ingrese Id del alumno: (Entero)");
        _id = entrada.nextInt();
        entrada.nextLine(); // Limpieza de buffer
        System.out.println("Ingrese nombre del alumno: ");
        _nombre = entrada.nextLine();
        System.out.println("Ingrese el la edad del alumno: ");
        _edad = entrada.nextInt();
        System.out.println("Ingrese la nota 1: ");
        n1 = entrada.nextInt();
        System.out.println("Ingrese la nota 2: ");
        n2 = entrada.nextInt();
        System.out.println("Ingrese la nota 3: ");
        n3 = entrada.nextInt();

        Nodo nuevo = new Nodo(_id, _nombre, _edad, n1, n2, n3);

        nuevo.sig = head;
        if (listaVacia()) {
            head = nuevo;
        } else {
            tail.sig = nuevo;
        }
        tail = nuevo;
    }

    public void ingresarO() {
        int _id;
        String _nombre;
        int _edad, n1, n2, n3;

        System.out.println("Ingrese Id del alumno: (Entero)");
        _id = entrada.nextInt();
        entrada.nextLine(); // Limpieza de buffer
        System.out.println("Ingrese nombre del alumno: ");
        _nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del alumno:");
        _edad = entrada.nextInt();
        System.out.println("Ingrese la nota 1: ");
        n1 = entrada.nextInt();
        System.out.println("Ingrese la nota 2: ");
        n2 = entrada.nextInt();
        System.out.println("Ingrese la nota 3: ");
        n3 = entrada.nextInt();
        Nodo nuevo = new Nodo(_id, _nombre, _edad, n1, n2, n3);
        if (listaVacia()) {
            head = nuevo;
            tail.sig = nuevo;
        } else {
            if (_id < head.alumno.id) {
                nuevo.sig = head;
                head = nuevo;
            } else {
                Nodo actual = head;
                while (actual.sig != null && (_id > actual.sig.alumno.id))
                    actual = actual.sig;
                nuevo.sig = actual.sig;
                actual.sig = nuevo;
                if (nuevo.sig == null) {
                    tail = nuevo;
                }
            }
        }
    }

    public void eliminar() {
        int _id;
        System.out.println("Ingrese Id: ");
        _id = entrada.nextInt();
        if (listaVacia()) {
            System.out.println("No hay elementos a eliminar");
        } else {
            if (_id == head.alumno.id) {
                head = head.sig; // Si solamente había uno
                if (head == null) {
                    tail = null;
                }
            } else {
                Nodo actual = head;
                while ((actual.sig != null) && (_id != actual.sig.alumno.id))
                    actual = actual.sig;
                if (actual == tail)
                    System.out.println("El elemento no existe");
                else {
                    actual.sig = actual.sig.sig;
                    if(actual.sig==null)
                        tail=actual;
                }
            }
        }
    }

    public void recorrer() {
        Nodo actual = head;
        float prom;
        while (actual != null) {
            prom = (actual.alumno.notas[0] + actual.alumno.notas[1] + actual.alumno.notas[2]) / 3;
            System.out.printf("Id: %s\n"
                    + "Nombre: %s\n"
                    + "Edad: %s\n"
                    + "Promedio: %.2f\n\n",
                    actual.alumno.id,
                    actual.alumno.nombre,
                    actual.alumno.edad,
                    prom);
            actual = actual.sig;
        }
    }

}
