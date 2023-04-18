
package com.mycompany.lista01_vetores;

import java.util.Scanner;


public class ex08 {
    
    public static void main(String[] args) {
        int [] vet = new int [6];
        Scanner scan = new Scanner(System.in);
     
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite um numero par: ");
            do{
                vet[i] = scan.nextInt(); 
                 if (vet[i]%2!=0) {
                     System.out.println("PAR!!! digite novamente: ");
                 }
            }while(vet[i]%2!=0);
        }
        
        imprimeVetor(vet);
        int [] vet2 = inverterVetor(vet);
        System.out.println("");
        imprimeVetor(vet2);
        
    }
    private static void imprimeVetor(int[]vEnviado){
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
