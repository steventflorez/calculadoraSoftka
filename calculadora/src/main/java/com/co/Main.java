package com.co;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger("log");
    private static final Scanner capture = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        se crean variables para la suma de dos numeros
        * */
        double number1;
        double number2;
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
        calculate(operator,number1,number2);

    }

    public static void calculate(int operator, double number1, double number2){
        switch (operator) {
            case 1 -> suma(number1, number2);
            case 2 -> resta(number1, number2);
            default -> print(0);
        }
    }

    public static void suma(double number1, double number2){
       print(number1 + number2);
    }

    public static void resta(double number1, double number2){
        print(number1 - number2);
    }

    public static void print(double result){
        log.info("El result es: " + result);
    }


}
