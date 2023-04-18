
package com.mycompany.lista02_matrizes;

import java.util.Random;


public class ex07 {
    public static void main(String[] args) {
        int [][] matriz = new int [2][3];
        preencherMatrizAleatorio(matriz);
        ImprimirMatriz(matriz);
        maiorVetor(matriz);
        
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

    private static void maiorVetor(int[][] matriz) {
        int maior = matriz[0][0];
        int posicao [] = new int [2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]> maior) {
                   maior = matriz[i][j];
                   posicao[0] = (i+1);
                   posicao[1] = (j+1);
                }
            }      
        }
        System.out.println("\n-------------------------------------");
        System.out.println("O maior valor armazenado é " + maior + " que está na linha " + posicao[0] + " e coluna " + posicao[1]);
    }
}
