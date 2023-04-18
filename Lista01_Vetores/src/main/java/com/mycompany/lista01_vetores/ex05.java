
package com.mycompany.lista01_vetores;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        int[] vet1 = new int[5];
        vet1= criarVetor(vet1);
        int[] vet2 = inverterVetor(vet1);
        
        System.out.println("Vetor 1: ");
        imprimeVetor(vet1);
        
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
    private static int[] inverterVetor(int[] vet1) {
        int vet2[] = new int [vet1.length];
        int contador=0;
        for (int i = vet1.length-1 ; i >=0; i--) { //for invertido
            vet2[contador] = vet1[i];
            contador++;
        }
        return vet2;
    }
}

