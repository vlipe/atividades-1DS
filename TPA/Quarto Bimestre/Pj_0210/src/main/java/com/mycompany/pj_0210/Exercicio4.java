/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_0210;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author apare
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numeros = new Integer[50];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + (i + 1) + " (não necessariamente na ordem correta): ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.println("Números em ordem decrescente: ");

        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
