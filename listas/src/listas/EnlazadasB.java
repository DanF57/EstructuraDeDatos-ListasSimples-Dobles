package listas;

/**
 *
 * @author Daniel
 */
public class EnlazadasB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MetodosEB obj = new MetodosEB();
        int op;
        do {
            op = obj.menu();
            switch (op) {
                case 1:
                    obj.ingresar();
                    break;

                case 2:
                    obj.recorrer();
                    break;

                case 3:
                    obj.ingresarO();
                    break;

                default:
                    break;
            }
        } while (op != 0);

    }

}
