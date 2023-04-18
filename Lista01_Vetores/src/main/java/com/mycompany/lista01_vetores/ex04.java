
package com.mycompany.lista01_vetores;

import java.util.Scanner;


public class ex04 {
    public static void main(String[] args) {
        int[] vet1 = new int[5];
        int[] vet2;
        vet1= criarVetor(vet1);
        System.out.println("Vetor 1: ");
        imprimeVetor(vet1);
        vet2 = vet1;
        System.out.println("\nVetor 2: ");
        imprimeVetor(vet2);   
    }  
    private static int [] criarVetor (int [] vRecebido){
        Scanner scan = new Scanner (System.in);
        System.out.println("Insira 5 numeros: ");
        for (int i = 0; i < vRecebido.length; i++) {
            vRecebido[i] = scan.nextInt();
        }
        return vRecebido;
    }
    public static void imprimeVetor(int[]vEnviado){
       for(int i = 0; i< vEnviado.length;i++){
           System.out.print(vEnviado[i] + " ");
       }
   }
}
