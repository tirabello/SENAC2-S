
package com.mycompany.lista02_matrizes;

import java.util.Random;

public class ex05 {
    public static void main(String[] args) {
        int [][] A = new int [3][3];
        int [][] B = new int [3][2];
              
        preencherMatrizAleatorio(A);
        preencherMatrizAleatorio(B);
        System.out.println("Matriz A");
        ImprimirMatriz(A);
        System.out.println("\nMatriz B");
        ImprimirMatriz(B);
        System.out.println("\nMatriz C: A*B");
        multipli(A,B);
    }
    private static int [][]preencherMatrizAleatorio(int[][] matriz){
        Random rd = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rd.nextInt(10); 
            }       
        }
        return matriz;
    }
    private static void ImprimirMatriz(int[][] matriz) {
               //para impressao
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf(matriz[i][j] + "\t");
            }
        }
    } 

    private static void multipli(int[][] A, int[][] B) {
        int [][] C = new int [A.length][B[0].length];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j <C[i].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        ImprimirMatriz(C);
    }
}
