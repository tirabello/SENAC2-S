
package com.mycompany.lista02_matrizes;

import java.util.Random;

public class ex04 {
    public static void main(String[] args) {
        int [][] A = new int [3][3];
        int [][] B = new int [3][3];
        int [][] C = new int [3][3];
        
        gerarMatriz(A,B);
        System.out.println("Matriz A");
        ImprimirMatriz(A);
        System.out.println("");
        System.out.println("Matriz B");
        ImprimirMatriz(B);
        System.out.println("\nMatriz C: A-B");
        Subtracao(C, B, A);
        
    }
    private static void gerarMatriz(int[][] matriz1, int[][] matriz2) {
        Random rd = new Random();
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = rd.nextInt(10); 
            }       
        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[i][j] = rd.nextInt(10);
            }
        }
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

    private static void Subtracao(int[][] matrizSub, int[][] B, int[][] A) {
        for (int i = 0; i < matrizSub.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrizSub[i].length; j++) {
                matrizSub[i][j] = A[i][j] - B[i][j];
                System.out.printf(matrizSub[i][j] + "\t");
            }        
        }
    }
}
