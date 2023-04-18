
package com.mycompany.lista01_vetores;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        int [] vet1 = new int[5];
        int [] vet2 = new int[5];
        
        vet1 = criarVetor(vet1);
        System.out.println("\n agora, para o segundo vetor: ");
        vet2 = criarVetor(vet2);
        
        somaVetores(vet1, vet2);
        SubtracaoVetor(vet1, vet2);
        MultiVetor(vet1, vet2);
        divisaoVet(vet1, vet2);
    }
    public static int [] criarVetor (int [] vRecebido){
        Scanner scan = new Scanner (System.in);
        System.out.println("Insira 5 numeros: ");
        for (int i = 0; i < vRecebido.length; i++) {
            vRecebido[i] = scan.nextInt();
        }
        return vRecebido;
    }

    private static void somaVetores(int[] vet1, int[] vet2) {
        System.out.println("Soma dos elementos de cada vetor: ");
        for (int i = 0; i < vet1.length; i++) {
            System.out.println(vet1[i] + " + " + vet2[i] + " = " +(vet1[i] + vet2[i]));
        }
    }

    private static void SubtracaoVetor(int[] vet1, int[] vet2) {
        System.out.println("Subtração dos elementos de cada vetor: ");
        for (int i = 0; i < vet1.length; i++) {
            System.out.println(vet1[i] + " - " + vet2[i] + " = " +(vet1[i] - vet2[i]));
        }
    }

    private static void MultiVetor(int[] vet1, int[] vet2) {
        System.out.println("Multiplicação dos elementos de cada vetor: ");
        for (int i = 0; i < vet1.length; i++) {
            System.out.println(vet1[i] + " * " + vet2[i] + " = " +(vet1[i] * vet2[i]));
        }
    }

    private static void divisaoVet(int[] vet1, int[] vet2) {
       System.out.println("Divisão dos elementos de cada vetor: ");
        for (int i = 0; i < vet1.length; i++) {
            if (vet2[i] == 0) {
                System.out.println(vet1[i] + " / " + vet2[i] + " = Não é possivel dividir por zero");
            }else{
                System.out.println(vet1[i] + " / " + vet2[i] + " = " +(vet1[i] / vet2[i]));
            }           
        }
    }
}
