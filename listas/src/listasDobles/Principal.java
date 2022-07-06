package listasDobles;

public class Principal {
    public static void main(String[] args) {

        MetodosED obj = new MetodosED();
        int op;
        do {
            op = obj.menu();
            switch (op) {
                case 1:
                    obj.insertarFinal();
                    break;

                case 2:
                    obj.insertarInicio();
                    break;

                case 3:
                    obj.recorrer();
                    break;

                case 4:
                    obj.eliminar();

                default:
                    break;
            }
        } while (op != 0);

    }

}
