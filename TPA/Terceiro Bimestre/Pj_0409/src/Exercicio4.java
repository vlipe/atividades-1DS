/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author apare
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Por favor, informe o valor inicial: ");
        int valorinicial = scanner.nextInt();
        
        System.out.println("Por favor, informe o valor final: ");
        int valorfinal = scanner.nextInt();
        
        int somaImpar = 0;
        
        for (int i = valorinicial; i <= valorfinal; i++) {
            if (i % 2 != 0) { 
                somaImpar += i; 
            }
        }

        System.out.println("A soma dos números ímpares no intervalo é: " + somaImpar);

        scanner.close(); 
        
    }
}
