
package com.mycompany.lista02_matrizes;

import java.util.Random;


public class ex06 {
    public static void main(String[] args) {
        int [][] matriz = new int [2][3];
        preencherMatrizAleatorio(matriz);
        ImprimirMatriz(matriz);
        menorVetor(matriz);
        
    }
    private static int [][]preencherMatrizAleatorio(int[][] matriz){
        Random rd = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rd.nextInt(50); 
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

    private static void menorVetor(int[][] matriz) {
        int menor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]< menor) {
                   menor = matriz[i][j];
                }
            }      
        }
        System.out.println("\n-------------------------------------");
        System.out.println("O menor valor armazenado é " + menor);
    }
}
