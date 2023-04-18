/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista02_matrizes;

import java.util.Random;

/**
 *
 * @author titi2
 */
public class ex02 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][4];
        
        gerarMatriz(matriz);
        ImprimirMatriz(matriz);
        elementosRepetidos(matriz);  
    }
    private static void gerarMatriz(int[][] matriz) {
        Random rd = new Random();
        for (int i = 0; i < matriz.length; i++) { //linha
            for (int j = 0; j < matriz[i].length; j++) { //coluna 
                matriz[i][j] = rd.nextInt(50); 
            }           
        }
    }
    private static void elementosRepetidos(int[][] matriz) {
        boolean repetido = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    for (int l = 0; l < matriz[k].length; l++) {
                        if (matriz[i][j] == matriz[k][l] && i!=k && j!=l) {
                            repetido = true;
                        }
                    }
                }
            }
        }
        if (repetido) {
            System.out.println("\nExiste elementos repetidos na matriz.");
        }else{
            System.out.println("\nNão há elementos repetidos.");
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
