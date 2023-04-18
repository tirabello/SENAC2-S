
package com.mycompany.lista01_vetores;

import static com.mycompany.lista01_vetores.Lista01_Vetores.imprimeVetor;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        int [] vBase = new int [8];
        vBase = criarVetor(vBase);
        imprimeVetor(vBase);
        MaiorVetor(vBase);    
    }
    
   private static int [] criarVetor (int [] vRecebido){
        Scanner scan = new Scanner (System.in);
        System.out.println("Insira 8 numeros: ");
        for (int i = 0; i < vRecebido.length; i++) {
            vRecebido[i] = scan.nextInt();
        }
        return vRecebido;
    }
   
   public static void MaiorVetor(int[] mVetor){
       int maiorValor = mVetor[0];
       for (int i = 0; i < mVetor.length; i++) {
            if (mVetor[i]> maiorValor) {
                maiorValor = mVetor[i];
            }
        }
       for (int i = 0; i < mVetor.length; i++) {
           if(mVetor[i] == maiorValor){
               System.out.println("\nO maior valor armazenado é " + maiorValor + " e está no índice " + (i+1) );
           }
       }
   }
}
