
package com.mycompany.lista02_matrizes;

import java.util.Scanner;


public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Defina o tamanho da matriz: ");
        int tamanho = scan.nextInt();
        //int matriz [][] = new int [tamanho][tamanho];
        
        diagonalPrincipal(tamanho);
        diagonalSecundaria(tamanho);
        contornoMatriz(tamanho);
        parteInferiorPartindoDiagPrincipal(tamanho);
        zeroNaDiagPrincipal(tamanho);
        //ImprimirMatriz(matriz);
    }

    private static void diagonalPrincipal(int tamanho) {
        String matriz[][] = new String [tamanho][tamanho];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i==j) {
                    matriz[i][j] = "1";
                }else{
                    matriz[i][j] = " ";
                }
            }
        }
        System.out.println("----Diagonal Principal----");
        ImprimirMatriz(matriz);
    }
    private static void ImprimirMatriz(String[][] matriz) {
               //para impressao
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf(matriz[i][j] + "\t");
            }
        }
        System.out.println("\n");
    }

    private static void diagonalSecundaria(int tamanho) {
        String matriz[][] = new String [tamanho][tamanho];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
               if (i+j == matriz.length -1) {
                   matriz[i][j] = "1";
               }else{
                   matriz[i][j] = " ";
               }
            }
        }
        System.out.println("----Diagonal Secundaria----");
        ImprimirMatriz(matriz);
    }

    private static void contornoMatriz(int tamanho) {
        String matriz[][] = new String [tamanho][tamanho];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i==0 ||  j==0|| i ==matriz.length -1 || j==matriz.length-1 ) {
                    matriz[i][j] = "1";
                }else{
                    matriz[i][j] = " ";
                }
            }
        }
        System.out.println("----Contorno----");
        ImprimirMatriz(matriz);
    }

    private static void parteInferiorPartindoDiagPrincipal(int tamanho) {
        String matriz[][] = new String [tamanho][tamanho];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i==j) {
                    matriz[i][j] = "1";
                }else if (i>j) {
                    matriz[i][j] = "1";
                }else{
                    matriz[i][j] = " ";
                }
            }
        }
        System.out.println("----Desenho Inferior----");
        ImprimirMatriz(matriz);
    }

    private static void zeroNaDiagPrincipal(int tamanho) {
        int matriz[][] = new int [tamanho][tamanho];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i==j) {
                    matriz[i][j] = 0;
                }else if (i>j) {
                    matriz[i][j] = 1;
                }
            }
        }
        System.out.println("----Zero na Diagonal Principale superior----");
        ImprimirMatrizINT(matriz);
    }
    private static void ImprimirMatrizINT(int[][] matriz) {
               //para impressao
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf(matriz[i][j] + "\t");
            }
        }
        System.out.println("\n");
    }
}
