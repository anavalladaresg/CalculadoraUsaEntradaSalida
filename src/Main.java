import libreria.EntradaSalida;

/**
 * Clase principal
 * @author Ana
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

        final float OPERACION = EntradaSalida.entrada("Elija la operación a realizar: \n1. Suma\n2. Resta\n" +
                "3. Multiplicación\n4. División\n", 1);
        float a;
        float b;

        /*Menú de opciones para el usuario*/
        switch ((int) OPERACION) {
            case 1:
                Suma suma = new Suma();
                a = EntradaSalida.entrada("Primer número a sumar: ", 1);
                b = EntradaSalida.entrada("Segundo número a sumar: ", 1);
                EntradaSalida.salida("Resultado: " + suma.sumar(a,b), 1);
                break;
            case 2:
                Resta resta = new Resta();
                a = EntradaSalida.entrada("Primer número a restar: ", 1);
                b = EntradaSalida.entrada("Segundo número a restar: ", 1);
                EntradaSalida.salida("Resultado: " + resta.restar(a, b), 1);
                break;
            case 3:
                Multiplicacion multiplicacion = new Multiplicacion();
                a = EntradaSalida.entrada("Primer número a multiplicar: ", 1);
                b = EntradaSalida.entrada("Segundo número a multiplicar: ", 1);
                EntradaSalida.salida("Resultado: " + multiplicacion.multiplicar(a, b), 1);
                break;
            case 4:
                Division division = new Division();
                a = EntradaSalida.entrada("Primer número a dividir: ", 2);
                b = EntradaSalida.entrada("Segundo número a dividir: ", 2);
                EntradaSalida.salida("Resultado: " + division.dividir(a, b), 1);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}