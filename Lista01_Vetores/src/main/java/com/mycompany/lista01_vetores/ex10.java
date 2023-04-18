
package com.mycompany.lista01_vetores;

import java.util.Random;

public class ex10 {
    public static void main(String[] args) {
        int [] vBase = new int[10];
        vBase = carregarNumerosAleatorios(vBase);
        //imprimeVetor(vBase);
        //System.out.println("");
        contadorNegativos(vBase);
    }
    private static int[] carregarNumerosAleatorios(int[] vRecebido) {
        Random rd = new Random();
         for (int i = 0; i < vRecebido.length; i++) {
            vRecebido[i] = rd.nextInt();
        }
         return vRecebido;
    }
    private static void imprimeVetor(int[]vEnviado){
       for(int i = 0; i< vEnviado.length;i++){
           System.out.print(vEnviado[i] + " ");
       }
   }

    private static void contadorNegativos(int[] vBase) {
        int contador = 0;
        int num;
        for (int i = 0; i < vBase.length; i++) {
            num = vBase[i];
            if (num <0) {
                contador++;
            }
        }
        System.out.println("A quantidade de elementos negativos no array é de: " + contador);
    } 
}
