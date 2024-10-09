/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_0210;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author apare
 */
public class Exercicio6 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    
        int[] numeros = new int[100];
        int[] impares = new int[50];   
        int indiceImpares = 0;
        int indiceNumeros = 0;

        while (indiceNumeros < 100) {
            System.out.println("Digite o número " + (indiceNumeros + 1) + ": ");
            
            int num = scanner.nextInt();
            
            numeros[indiceNumeros] = num;
            
            indiceNumeros++;

            if (num % 2 != 0 && indiceImpares < 50) {
                impares[indiceImpares] = num;
                
                indiceImpares++;
            }
        }

        Arrays.sort(impares);

        System.out.println("Números ímpares em ordem crescente:");
        
        for (int impar : impares) {
            System.out.println(impar);
        }

        scanner.close();
    }
}