/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pj_0210;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author apare
 */
public class Exercicio2 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
        String[] nomes = new String[20];
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        
        Arrays.sort(nomes, Collections.reverseOrder());
        
        System.out.println("Nomes em ordem decrescente: ");
        
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        scanner.close();
    }
}
