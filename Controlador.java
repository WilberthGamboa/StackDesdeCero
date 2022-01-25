import java.util.NoSuchElementException;
import java.util.Scanner;

public class Controlador {

    private Stack pilarKny;

    public Controlador() {

    }

    public void inicializarPilar() {
        Scanner reader = new Scanner(System.in);
        int cantidad;
        try {
            do {
                System.out.println("Inserte el tamaño de la pila");
                cantidad = reader.nextInt();
            } while (cantidad < 1);

            this.pilarKny = new Stack(cantidad);

        } catch (NoSuchElementException e) {
            reader.close();
        }

    }

    public void eleccion() {
        int opcion;
        long valorPila;
        Scanner reader = new Scanner(System.in);
        Scanner readerFunciones = new Scanner(System.in);

        System.out.println(
                "1)Agregar, 2)Eliminar 3)Consultar Top 4)Consultar Vacio 5)Consultar lleno 6)Salir del programa");
        try {
            do {
                System.out.println("Inserte la opcion");
                opcion = reader.nextInt();

                switch (opcion) {
                    case 1:
                        if (pilarKny.isFull()) {
                            System.out.println("Pila llena, no se pueden agregar más elementos");

                        } else {
                            System.out.println("Inserte el valor a agregar");
                            valorPila = readerFunciones.nextLong();
                            pilarKny.push(valorPila);

                        }

                        break;
                    case 2:

                        if (pilarKny.isEmpty()) {
                            System.out.println("Pila vacia, no se puede eliminar");
                        } else {
                            System.out.println("Se ha eliminado el valor " + pilarKny.peek());
                            pilarKny.pop();
                        }

                        break;
                    case 3:
                    if (pilarKny.isEmpty()) {
                        System.out.println("Pila vacia, no hay tope");
                    } else {
                        System.out.println("El tope es: " + pilarKny.peek());
                    }

                        

                        break;
                    case 4:
                        if (pilarKny.isEmpty()) {
                            System.out.println("La pila está vacía");
                        } else {
                            System.out.println("La pila no está vacía y el tope es:" + pilarKny.peek());
                            pilarKny.pop();
                        }
                        break;
                    case 5:
                        if (pilarKny.isFull()) {
                            System.out.println("La pila llena");

                        } else {
                            System.out.println("La pila no está llena");

                        }

                        break;
                    case 6:
                        break;

                    default:
                        break;

                }

            } while (opcion != 6);

        } catch (Exception e) {
            reader.close();
            readerFunciones.close();
            // TODO: handle exception
        }

    }

}
