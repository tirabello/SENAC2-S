
package com.mycompany.lista02_matrizes;

import java.util.Scanner;

public class ex09 {
     static Scanner scan = new Scanner (System.in);
     
    public static void main(String[] args) {
        System.out.println("Insira o tamanho de linhas que deseja na sua matriz: ");
        int linhas = scan.nextInt();
        System.out.println("Agora, insira a quantidade de colunas: ");
        int colunas = scan.nextInt();
        int matriz [][] = new int [linhas][colunas];
        
        preencherMatrizValores(matriz);
        ImprimirMatriz(matriz);
        somarElementosPar(matriz);
        somaIndicesImpares(matriz);
        multiElementoImpar(matriz);
        buscarNumero(matriz);
        if (linhas == colunas) { 
            somaDiagonaisPrincSec(matriz);
        }
        somaLinha(matriz);
        somaColuna(matriz);
    }
    
    private static int [][]preencherMatrizValores(int[][] matriz){
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

    private static void somarElementosPar(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] %2==0) {
                    soma+= matriz[i][j];
                }
            }
        }
        System.out.println("\nSoma dos elementos pares da matriz: " + soma);
    }

    private static void somaIndicesImpares(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i+j) %2!=0) {
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println("nSoma dos indices Impares da matriz: " + soma);
    }

    private static void multiElementoImpar(int[][] matriz) {
        int multi = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] %2!=0) {
                    multi *= matriz[i][j];
                }
            }
        }
        System.out.println("Multiplicação dos elementos impares da matriz: " + multi);
       
        
    }

    private static void buscarNumero(int[][] matriz) {
        int quantidadeVezes = 0;
        System.out.println("Qual numero deseja encontrar na matriz? ");
        int busca = scan.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == busca) {
                    System.out.println("Numero encontrado na linha: " + i + " na coluna: "+ j);
                    quantidadeVezes++;
                }
            }
        }
        if (quantidadeVezes==0) {
            System.out.println("Elemento não encontrado");
        }else{
            System.out.println("Quantidade de numeros encontrados: " + quantidadeVezes );
        }
    }

    private static void somaDiagonaisPrincSec(int[][] matriz) {
        int DiagPrincipal = 0;
        int DIagSecundaria = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i==j) {
                    DiagPrincipal += matriz[i][j];
                }
                if (i+j == matriz.length -1) {
                    DIagSecundaria += matriz[i][j];
                }
            }
        }
        System.out.println("Soma da diagonal principal: " + DiagPrincipal);
        System.out.println("Soma da diagonal Secundaria: " + DIagSecundaria);
    }

    private static void somaLinha(int[][] matriz) {
        int linha [] = new int [matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                linha[i] += matriz[i][j];
            }
        }
        for (int i = 0; i < linha.length; i++) {
            System.out.println("A Soma da linha " + i + " é " + linha[i]);
            System.out.println("----------------------------------------");
        }
    }

    private static void somaColuna(int[][] matriz) {
        int coluna [] = new int [matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                coluna[j] += matriz[i][j];
            }
        }
        for (int i = 0; i < coluna.length; i++) {
            System.out.println("A Soma da coluna " + i + " é " + coluna[i]);
            System.out.println("----------------------------------------");
        }
    }
}
