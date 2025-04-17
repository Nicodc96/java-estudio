package com.talentotech.ejercicios;

import java.util.Scanner;

import com.talentotech.ejercicios.ejercicio.*;

public class Main {
    public static void main(String[] args) {
        Scanner scannerGlobal = new Scanner(System.in);

        Ejercicio.EjercicioOcho(scannerGlobal);

        scannerGlobal.close();
    }
}