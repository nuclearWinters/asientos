/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.asientos;

import java.util.Scanner;

/**
 *
 * @author Armando
 */
public class asientos {
    public static boolean areAllTrue(boolean[] array)
    {
        for(boolean b : array) if(!b) return false;
        return true;
    }
    public static void main(String[] args) {
        boolean[] asientosVuelo = {false, false, false, false, false, false, false, false, false, false};
        int asientoP1 = 0;
        int asientoS2 = 5;
        while (true) {
            if (areAllTrue(asientosVuelo)) {
                System.out.println("Se acabaron los vuelos. Regrese en 3 horas.");
                break;
            }
            System.out.println("Introduzca 1 para Primera Clase y 2 para Economico: ");
            Scanner inputNumero = new Scanner(System.in);
            int numero = inputNumero.nextInt();
            if (numero ==  1) {
                if (asientoP1 == 5) {
                    System.out.println("Sin asientos. ¿Desea pasarse a la clase Economica? (Y)");
                    Scanner inputRespuesta = new Scanner(System.in);
                    String SiONo = inputRespuesta.next();
                    if (SiONo.equals("Y")) {
                        asientosVuelo[asientoS2] = true;
                        asientoS2++;
                        System.out.println("¡Gracias por su preferencia!");
                    } else {
                        System.out.println("De acuerdo. Regrese en 3 horas.");
                    }
                } else {
                    asientosVuelo[asientoP1] = true;
                    asientoP1++;
                    System.out.println("¡Gracias por su preferencia!");
                }
            } else if (numero == 2) {
                if (asientoS2 == 10) {
                    System.out.println("Sin asientos. ¿Desea pasarse a Primera Clase? (Y)");
                    Scanner inputRespuesta = new Scanner(System.in);
                    String SiONo = inputRespuesta.next();
                    if (SiONo.equals("Y")) {
                        asientosVuelo[asientoP1] = true;
                        asientoP1++;
                        System.out.println("¡Gracias por su preferencia!");
                    } else {
                        System.out.println("De acuerdo. Regrese en 3 horas.");
                    }
                } else {
                    asientosVuelo[asientoS2] = true;
                    asientoS2++;
                    System.out.println("¡Gracias por su preferencia!");
                }
            } else {
                System.out.println("Introduzca 1 o 2.");
            }
            
        }
    }
}
