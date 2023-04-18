
package com.mycompany.buscabinaria;

import java.util.Random;
import java.util.Scanner;

public class BuscaBinaria {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vetor []= new int [100];
        int buscador = 0;
        
        preencherVetorAleatorio(vetor);
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();

        bubblesort(vetor);
        System.out.println("\nOrdenado");
        imprimeVetor(vetor);
        
        buscador = buscaBinaria(vetor,num);
        if (buscador >=0) {
            System.out.println("\nEncontrou o numero na posição " + buscador);
        }else{
            System.out.println("\nO numero não foi encontrado");
        }
        
        
    }
    private static void preencherVetorAleatorio(int[] vetor) {
        Random rd = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100);
        }
    }
    private static void imprimeVetor(int[]vEnviado){
       for(int i = 0; i< vEnviado.length;i++){
           System.out.print(vEnviado[i] + " ");
       }
   }
    private static void bubblesort(int[] vetor) {
        int temp = 0;
        int contador = 0;
        for (int i = 0; i < vetor.length -1; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    //permuta
                    temp = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1]= temp;
                }
                contador ++;
            }
        }
        System.out.println("Numero de vezes necessario para ordenação: " + contador);
    }

    private static int buscaBinaria(int[] v, int x) {
        int cont = 0;
        int i, m , f;
        i = 0;
        f = v.length -1;
        while(i <= f){
            cont++;
            m = (i+f)/2;
            if (v[m] == x) {
                System.out.println("\nNumero de vezes repetida: " + cont);
                return m;
            }
            if (x<v[m]) {
                f = m-1;
            }else{
                i = m+1;
            }
        }
        System.out.println("\nNumero de vezes repetida: " + cont);
        return -1;      
    }
}
