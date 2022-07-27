/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import java.util.Scanner;

public class Converter {

    static int residuo;

    public static String toBinary(int num) {
        String binary = "";

        while (num > 0) {
            residuo = num % 2;
            binary = residuo + binary;
            num /=2 ;
        }
        
        return binary;
    }

    public static void main(String[] args) {
        Scanner scaneador = new Scanner(System.in);
        int r = scaneador.nextInt();
        System.out.println(Converter.toBinary(r));
    }

}
