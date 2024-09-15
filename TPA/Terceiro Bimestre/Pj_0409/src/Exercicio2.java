/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author apare
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Por favor, informe o número para calcular a tabuada:");
        
        int numero = scanner.nextInt();
        
        System.out.println("\nTabuada do número" +numero+ ":");
        
        for (int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero+ " x " +i+ " = " +resultado);
    }
        scanner.close();
}
}