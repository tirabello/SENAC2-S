
package com.mycompany.lista01_vetores;

import java.util.Scanner;

public class ex07 {
    
    public static void main(String[] args) {
        float [] salario = new float[10];
    
        exibirSalario(salario);
        MaiorValor(salario);
        
        
    }

    private static void exibirSalario(float[] salario) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < salario.length; i++) {
            System.out.println("\nDigite o salario recebido: ");
            salario[i] = scan.nextFloat();
        }
    }

    private static void MaiorValor(float[] salario) {
        float maiorSalary = salario[0];
        for (int i = 0; i < salario.length; i++) {
            if (salario[i] > maiorSalary) {
                maiorSalary = salario[i];
            }
        }
        System.out.println("O maior salario é: " + maiorSalary);
    }
    
}
