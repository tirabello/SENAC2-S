
package com.mycompany.bubblesort;

import java.util.Random;
import java.util.Scanner;


public class BubbleSort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor= new int[8];
        System.out.println("Que numero deseja encontrar?");
        int num = scan.nextInt();
         
        carregarNumerosAleatorios(vetor);
        System.out.println("Vetor original: ");
        imprimeVetor(vetor);
     
        System.out.println("\nVetor ordenado: ");
        bubblesort(vetor);
        imprimeVetor(vetor);
        
        procuraValor(vetor, num);
        
    }
    private static void imprimeVetor(int[] vetor) {
        System.out.print("[");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf(vetor[i] + "\t");
        }
        System.out.println("]");
    }
    private static int[] carregarNumerosAleatorios(int[] vRecebido) {
        Random rd = new Random();
         for (int i = 0; i < vRecebido.length; i++) {
            vRecebido[i] = rd.nextInt(10);
        }
         return vRecebido;
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
        System.out.println("Numero de vezes repetida: " + contador);
    }

    private static void procuraValor(int[] vetor, int num) {
        int cont = 0;
        int posicao = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == num) {
                posicao = i;
                break;               
            }
            cont++;
        }
        if (posicao == 0) {
            System.out.println("Valor nao encontrado");
        }
        else{
            System.out.println("valor foi encontrado na posicao: " + posicao);
        }
        System.out.println("\nNumero de vezes repetidas: " + cont);
    }
}
