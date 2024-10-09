/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_0210;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author apare
 */
public class Exercicio3 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[50];
        
        for (int i = 0; i < numeros.length; i++) {
        
        System.out.println("Digite o número " + (i + 1) + " (não necessariamente na ordem correta): ");
        numeros[i] = scanner.nextInt();
        }
        
        Arrays.sort(numeros);
        
        System.out.println("Números em ordem crescente: ");
        
        for (int numero : numeros){
            System.out.println(numero);
        }
        
        scanner.close();
    }
}
