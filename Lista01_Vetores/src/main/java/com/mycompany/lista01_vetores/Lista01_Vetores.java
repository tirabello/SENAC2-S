
package com.mycompany.lista01_vetores;

import java.util.Scanner;

public class Lista01_Vetores {

    public static void main(String[] args) {
        //exercicios 1 e 2; 
        int [] vBase = new int [10];
        vBase = criarVetor(vBase);
        imprimeVetor(vBase);
    } 
    public static void imprimeVetor(int[]vEnviado){
       for(int i = 0; i< vEnviado.length;i++){
           System.out.print(vEnviado[i] + " ");
       }
   }
    public static int [] criarVetor (int [] vRecebido){
        Scanner scan = new Scanner (System.in);
        System.out.println("Insira 10 numeros: ");
        for (int i = 0; i < vRecebido.length; i++) {
            vRecebido[i] = scan.nextInt();
        }
        return vRecebido;
    }
}
