/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista02_matrizes;

/**
 *
 * @author titi2
 */
public class Lista02_Matrizes {

    public static void main(String[] args) {
        int matriz [][] = new int [2][5];
        
        gerarMatriz(matriz);
        ImprimirMatriz(matriz);
    }

    private static void gerarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (matriz[i].length* i)+ (j+1);
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
}
