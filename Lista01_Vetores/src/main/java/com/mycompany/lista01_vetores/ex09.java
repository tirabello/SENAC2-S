
package com.mycompany.lista01_vetores;

import java.util.Random;
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        int [] vBase = new int[10];
        vBase = carregarNumerosAleatorios(vBase);
        imprimeVetor(vBase);
        procurarValor(vBase);
        
    }
    private static int[] carregarNumerosAleatorios(int[] vRecebido) {
        Random rd = new Random();
         for (int i = 0; i < vRecebido.length; i++) {
            vRecebido[i] = rd.nextInt(10);
        }
         return vRecebido;
    }
    private static void imprimeVetor(int[]vEnviado){
       for(int i = 0; i< vEnviado.length;i++){
           System.out.print(vEnviado[i] + " ");
       }
   }

    private static void procurarValor(int[] vBase) {
        Scanner scan = new Scanner (System.in);
        System.out.println("-----------------------------");
        System.out.println("Qual numero deseja encontrar?");
        int numero = scan.nextInt();
        
        for (int i = 0; i < vBase.length; i++) {
            if (vBase[i] == numero) {
                System.out.println("O numero " + numero + " esta na posição " + i + " do vetor");
                i= vBase.length;
            }
            else{
                System.out.println("Nao foi encontrado");              
            }        
        }
    }
}
