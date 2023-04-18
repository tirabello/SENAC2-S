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
public class ex03 {
    public static void main(String[] args) {
        int mat[][] = new int [3][4];
        int somaMat[]= new int [mat.length];
        
        gerarMatriz(mat);
        calcularlinha(mat, somaMat);
        ImprimirMatriz(mat, somaMat);
        
    }
    private static void gerarMatriz(int[][] matriz) {
        Random rd = new Random();
        for (int i = 0; i < matriz.length; i++) { //linha
            for (int j = 0; j < matriz[i].length; j++) { //coluna 
                matriz[i][j] = rd.nextInt(20); 
            }           
        }
    }
    private static void ImprimirMatriz(int[][] matriz, int[] somaMat) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf(matriz[i][j] + "\t");
                
            }
            System.out.println(somaMat[i] + " -soma da linha");
            soma += somaMat[i];
        }
        System.out.println("total da soma das linhas: " + soma);
    }

    private static void calcularlinha(int[][] mat, int[] somaMat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                somaMat[i] += mat[i][j];
            }    
        }
    }
}
