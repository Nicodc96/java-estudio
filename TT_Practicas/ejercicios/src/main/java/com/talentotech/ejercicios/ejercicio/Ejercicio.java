package com.talentotech.ejercicios.ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio {
    // 1) Pedir un número al usuario y decir si es positivo, negativo o cero.
    public static void EjercicioUno(Scanner entradaDeDatos) {
        int numeroIngresado = 0;

        System.out.print("Ingrese un número: ");
        numeroIngresado = entradaDeDatos.nextInt();

        System.out.println(
                "El número es " + (numeroIngresado > 0 ? "positivo." : (numeroIngresado == 0 ? "0." : "negativo.")));
    }

    // 2) Pedir dos números e imprimir cuál es el mayor.
    public static void EjercicioDos(Scanner entradaDeDatos) {
        int primerNumero = 0;
        int segundoNumero = 0;

        System.out.print("Ingrese el primer número: ");
        primerNumero = entradaDeDatos.nextInt();
        entradaDeDatos.nextLine();
        System.out.print("Ingrese el segundo número: ");
        segundoNumero = entradaDeDatos.nextInt();

        System.out.println("El mayor de ambos es: " + Math.max(primerNumero,
                segundoNumero));
    }

    // 3) Determinar si un número es par o impar.
    public static void EjercicioTres(Scanner entradaDeDatos) {
        int numeroIngresado = 0;

        System.out.print("Ingrese un número: ");
        numeroIngresado = entradaDeDatos.nextInt();

        System.out.println("El número es " + (numeroIngresado % 2 == 0 ? "par." : "impar."));
    }

    // 4) Verificar si un número es divisible por 3 y por 5.
    public static void EjercicioCuatro(Scanner entradaDeDatos) {
        int numeroIngresado = 0;

        System.out.print("Ingrese un número: ");
        numeroIngresado = entradaDeDatos.nextInt();

        System.out.println(
                "El número " + (numeroIngresado % 3 == 0 && numeroIngresado % 5 == 0 ? "es divisible por 5 y por 3."
                        : "no es divisible por 5 y por 3."));
    }

    // 5) Pedir la edad del usuario y verificar si es mayor de edad (>= 18).
    public static void EjercicioCinco(Scanner entradaDeDatos) {
        int edadIngresada = 0;

        System.out.print("Ingrese un número: ");
        edadIngresada = entradaDeDatos.nextInt();

        System.out.println("El usuario " + (edadIngresada >= 18 ? "es mayor de edad." : "es menor de edad."));
    }

    // 6) Pedir tres notas y calcular el promedio. Decir si aprobó (>=6).
    public static void EjercicioSeis(Scanner entradaDeDatos) {
        short notaUno = 0;
        short notaDos = 0;
        short notaTres = 0;

        System.out.print("Ingrese la primera nota: ");
        notaUno = entradaDeDatos.nextShort();
        System.out.print("Ingrese la segunda nota: ");
        entradaDeDatos.nextLine();
        notaDos = entradaDeDatos.nextShort();
        System.out.print("Ingrese la tercera nota: ");
        entradaDeDatos.nextLine();
        notaTres = entradaDeDatos.nextShort();

        float promedio = (float) (notaUno + notaDos + notaTres) / 3;

        System.out.printf("El promedio de notas es: %.2f, %s", promedio,
                promedio >= 6f ? "usted ha aprobado." : "usted ha desaprobado.");
    }

    // 7) Verificar si un número es divisible por 3 y por 5.
    public static void EjercicioSiete(Scanner entradaDeDatos) {
        int numeroLimite = 0, i = 1;

        System.out.print("Ingrese el número hasta donde contar: ");
        numeroLimite = entradaDeDatos.nextInt();

        System.out.printf("** Se contará hasta el número %d **\n", numeroLimite);
        while (i <= numeroLimite) {
            System.out.println(i);
            i++;
        }
    }

    // 8) Pedir dos números e imprimir los pares entre ellos usando for.
    public static void EjercicioOcho(Scanner entradaDeDatos) {

    }

    // 9) Calcular la suma de los primeros N números naturales.
    public static void EjercicioNueve(Scanner entradaDeDatos) {
        int limiteNatural = 0;
        long suma = 0;

        System.out.print("Ingrese hasta donde calcular la suma de números naturales: ");
        limiteNatural = entradaDeDatos.nextInt();

        for (int i = 1; i <= limiteNatural; i++) {
            suma += i;
        }

        System.out.printf("La suma de los primeros %d numeros naturales es: %d", limiteNatural, suma);
    }

    // 10) Mostrar la tabla de multiplicar del 5.
    public static void EjercicioDiez(short numeroTablaParam, Scanner entradaDeDatos) {
        System.out.printf("--- Mostrando la tabla del %d ---\n\n", numeroTablaParam);
        for (short i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numeroTablaParam, i, numeroTablaParam * i);
        }
    }

    // 1) Pedir un número e imprimir cuántos dígitos tiene.
    public static void EjercicioUno_Avanzado(Scanner entradaDeDatos) {
        Double numeroIngresado = 0.00;

        System.out.print("Ingresa un número para calcular cuantos dígitos tiene: ");
        numeroIngresado = entradaDeDatos.nextDouble();
        String numeroStr = numeroIngresado.toString();
        String decimales = numeroStr.split("[.]").length > 0
                ? numeroStr.split("[.]")[1].toString().length() + " decimales."
                : "0 decimales.";
        numeroStr = numeroStr.split("[.]")[0];

        System.out.printf("El número ingresado tiene %d dígitos y %s", numeroStr.length(), decimales);
    }

    // 2) Verificar si un número es primo.
    public static void EjercicioDos_Avanzado(Scanner entradaDeDatos) {
        long numeroIngresado = 0;

        System.out.print("Ingrese el número para deducir si es primo: ");
        numeroIngresado = entradaDeDatos.nextLong();
        String respuesta = "es primo.";

        if (numeroIngresado <= 0 || numeroIngresado == 1) {
            respuesta = "NO es primo.";
        }

        for (short i = 2; i < numeroIngresado; i++) {
            if (numeroIngresado % i == 0) {
                respuesta = "NO es primo.";
                break;
            }
        }

        System.out.printf("El número ingresado %s\n", respuesta);
    }

    // 3) Pedir una contraseña al usuario y permitirle 3 intentos.
    public static void EjercicioTres_Avanzado(Scanner entradaDeDatos) {
        String password = "86j1kGlazFc5";
        String datoEntrada = "";
        short intentos = 3;

        for (short i = 0; i < intentos; i++) {
            System.out.print("Ingrese su contraseña: ");
            datoEntrada = entradaDeDatos.nextLine();
            if (datoEntrada.equals(password)) {
                System.out.println("¡Acceso concedido!");
                break;
            }
            System.out.println(i + 1 < 3 ? "**ERROR** Vuelva a intentar." : "**Se han terminado los intentos.**");
        }
    }

    // 4) Imprimir los 10 primeros números de la serie de Fibonacci.
    public static void EjercicioCuatro_Avanzado() {
        short limite = 10;
        int[] sucesion = new int[limite];
        short encontrados = 2;

        // Fibonacci (los primeros 2 números son 0 y 1)
        sucesion[0] = 0;
        sucesion[1] = 1;

        for (short i = 2; encontrados < limite; i++) {
            sucesion[i] = sucesion[i - 1] + sucesion[i - 2];
            encontrados++;
        }

        for (short i = 0; i < sucesion.length; i++) {
            System.out.printf("Numero %d de la succesión de Fibonacci: %d\n", i + 1, sucesion[i]);
        }
    }

    // 5) Leer 5 números y mostrar cuántos son positivos, negativos y ceros.
    public static void EjercicioCinco_Avanzado(short limite, Scanner entradaDeDatos) {
        List<Integer> numeros = new ArrayList<>();;
        String[] posiciones = { "primer", "segundo", "tercer", "cuarto", "quinto" };

        for (short i = 0; i < limite; i++) {
            System.out.printf("Ingrese el %s número: ", posiciones[i]);
            numeros.add(entradaDeDatos.nextInt());
        }

        System.out.printf(
                "La cantida de números positivos es %d, la cantidad de negativos %d, y la cantida de ceros es %d",
                numeros.stream().filter((n) -> n > 0).collect(Collectors.toList()).size(),
                numeros.stream().filter((n) -> n < 0).collect(Collectors.toList()).size(),
                numeros.stream().filter((n) -> n == 0).collect(Collectors.toList()).size());
    }

    // 6) Leer 10 números e imprimir el mayor y el menor.
    public static void EjercicioSeis_Avanzado(Scanner entradaDeDatos) {
        List<Integer> numeros = new ArrayList<>();
        short limite = 10;

        for (short i = 0; i < limite; i++) {
            System.out.printf("Ingrese el número %d: ", i + 1);
            numeros.add(entradaDeDatos.nextInt());
        }

        System.out.printf("El número mayor ingresado es %d y el menor es %d\n",
                numeros.stream().max(Integer::compare).get(), numeros.stream().min(Integer::compare).get());
    }

    // 7) Calcular el factorial de un número.
    public static void EjercicioSiete_Avanzado(Scanner entradaDeDatos) {
        int numeroEntrada = 0;
        double respuesta = 1;

        System.out.print("Ingrese el número a calcular su factorial: ");
        numeroEntrada = entradaDeDatos.nextInt();

        if (numeroEntrada < 0)
            respuesta = 0;
        if (numeroEntrada == 0)
            respuesta = 1;

        for (int i = 1; i <= numeroEntrada; i++) {
            respuesta *= i;
        }

        System.out.printf("El factorial de %d es: %s", numeroEntrada,
                respuesta == 0 ? "No existe factorial de un número negativo" : String.format("%.0f", respuesta));
    }

    // 8) Mostrar los múltiplos de 3 entre 1 y 100 que no sean múltiplos de 5.
    public static void EjercicioOcho_Avanzado() {
        List<Integer> multiplos = new ArrayList<>();
        short minimo = 1, maximo = 100;

        for (short i = minimo; i <= maximo; i++) {
            if (i % 3 == 0 && i % 5 == 1) {
                multiplos.add((int) i);
            }
        }
        System.out.printf("Mostrando números múltiplo de 3 pero NO de 5, entre %d y %d.\n", minimo, maximo);
        multiplos.stream().forEach((num) -> System.out.printf("- %d\n", num));
    }

    // 10) Contar cuántos números entre 1 y 1000 son divisibles por 3 o por 7 pero no por ambos.
    public static void EjercicioDiez_Avanzado() {
        List<Integer> multiplos = new ArrayList<>();
        short minimo = 1, maximo = 1000;

        for (short i = minimo; i <= maximo; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                if (!(i % 3 == 0 && i % 7 == 0)) {
                    multiplos.add((int) i);
                }
            }
        }

        System.out.printf(
                "La cantidad de números que existen entre %d y %d, que son divisibles por 3 o por 7 pero no por ambos son: %d",
                minimo, maximo, multiplos.size());
    }
}
