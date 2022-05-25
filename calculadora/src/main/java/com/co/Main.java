package com.co;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    /*
     Constante que permite mostrar informacion en consola
     */
    private static final Logger log = Logger.getLogger("log");
    /*
    Constante que permite caputrar texto desde la consola.
     */
    private static final Scanner capture = new Scanner(System.in);

    /**
     * Metodo que permite inicilizar la aplicacion.
     *
     * @param args atributo para iniciar la aplicacion
     */
    public static void main(String[] args) {

        /*
         * Atributo para almacenar el primer numero.
         */
        double number1;

        /*
        Atributo para almacenar el segundo numero ingresado.
         */
        double number2;
        /*
        Atributo para indentificar la operacion deseada
         */
        int operator;

        log.info("********CALCULADORA SOFKA*******");
        log.info("Por favor ingrese el primer numero");
        number1 = capture.nextDouble();

        log.info("Por favor ingrese el segundo numero");
        number2 = capture.nextDouble();

        log.info("""
                1- Suma
                2- Resta
                3- Multipilicacion
                4- Division
                5- Todas
                6- salir
                """);

        operator = capture.nextInt();
        calculate(operator, number1, number2);

    }

    /**
     * invoca la operacion seleccionada por el usuario
     *
     * @param operator indica que operacion se va a realizar
     * @param number1  almacena el primer numero ingresado
     * @param number2  almacena el segundo numero ingresado
     */
    public static void calculate(int operator, double number1, double number2) {
        switch (operator) {
            case 1 -> suma(number1, number2);
            case 2 -> resta(number1, number2);
            case 3 -> multi(number1, number2);
            case 4 -> divi(number1, number2);
            case 5 -> all(number1, number2);
            default -> print(0);
        }
    }

    /**
     * este metodo nos permite genear la suma de dos numero
     *
     * @param number1 primer numero ingresado por el usuario
     * @param number2 segundo numero ingresado por el usuario
     */
    public static void suma(double number1, double number2) {
        print(number1 + number2);
    }

    /**
     * Este metodo nos permite generar la resta de los dos numeros
     *
     * @param number1 primer numero ingresado por el usuario
     * @param number2 segundo numero ingresado por el usuario
     */
    public static void resta(double number1, double number2) {
        print(number1 - number2);
    }

    /**
     * Este metodo nos permite generar la multiplicacion de los dos numeros
     *
     * @param number1 primer numero ingresado por el usuario
     * @param number2 segundo numero ingresado por el usuario
     */
    public static void multi(double number1, double number2) {
        print(number1 * number2);
    }

    /**
     * Este metodo nos permite generar la divicion de los dos numeros
     *
     * @param number1 primer numero ingresado por el usuario
     * @param number2 segundo numero ingresado por el usuario
     */
    public static void divi(double number1, double number2) {
        print(number1 / number2);
    }

    /**
     * Este metodo nos permite generar todas las operaciones de los dos numeros
     *
     * @param number1 primer numero ingresado por el usuario
     * @param number2 segundo numero ingresado por el usuario
     */
    public static void all(double number1, double number2) {
        print(number1 + number2);
        print(number1 - number2);
        print(number1 * number2);
        print(number1 / number2);
    }

    /**
     * Metodo que permite imprimir el resultado
     *
     * @param result resultado a imprmir
     */
    public static void print(double result) {
        log.info("El result es: " + result);
    }
}
