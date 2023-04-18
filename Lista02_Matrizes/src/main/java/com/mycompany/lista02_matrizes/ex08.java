
package com.mycompany.lista02_matrizes;

import java.util.Scanner;


public class ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Defina o tamanho da matriz: ");
        int tamanho = scan.nextInt();
        int matriz [][] = new int [tamanho][tamanho];
        
        preencherMatrizValores(matriz);
        ImprimirMatriz(matriz);
        VerificadordeQuadradoMagico(matriz);
        
    }
    private static int [][]preencherMatrizValores(int[][] matriz){
        Scanner scan = new Scanner (System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite o valor presente na linha " +(i+1)+ " e na coluna " +(j+1));
                matriz[i][j] = scan.nextInt(); 
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

    private static void VerificadordeQuadradoMagico(int[][] matriz) {
        int somaLinha [] = new int [matriz.length];
        int somaColuna [] = new int [matriz.length];
        int diagPrincipal =0;
        int diagSecundaria = 0;
        boolean quadradoMagico = false;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                somaLinha[i] += matriz[i][j];
                somaColuna[j] += matriz[i][j];
                if (i==j) {
                    diagPrincipal += matriz[i][j];
                }
                if (i+j == matriz.length - 1) {
                    diagSecundaria += matriz[i][j];
                }
            }
        }
        if (diagPrincipal == diagSecundaria) {
            for (int i = 0; i < somaColuna.length; i++) {
                if (somaColuna[i] == diagPrincipal) {
                    for (int j = 0; j < somaLinha.length; j++) {
                        if (somaLinha[j] == diagPrincipal) {
                            quadradoMagico = true;
                        }
                    }
                }
            }
        }
        if (quadradoMagico) {
            System.out.println("é um quadrado magico");
        }else{
            System.out.println("nao é um quadrado magico.");
        }        
    }
}
