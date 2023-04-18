
package com.mycompany.lista01_vetores;

import static com.mycompany.lista01_vetores.Lista01_Vetores.criarVetor;
import static com.mycompany.lista01_vetores.Lista01_Vetores.imprimeVetor;

public class ex11 {
    public static void main(String[] args) {
        int vBase[] = new int[10];
        vBase = criarVetor(vBase);
        boolean vBolean [] = verificarVetor(vBase);
        
        imprimeVetor(vBase);
        System.out.println("");
        imprimeBoolean(vBolean);
    }

    private static boolean[] verificarVetor(int[] vBase) {
       boolean vetor[] = new boolean [vBase.length];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vBase[i]%2==0;
        }
        return vetor;
    }

    private static void imprimeBoolean(boolean[] vBolean) {
        for (int i = 0; i < vBolean.length; i++) {
            System.out.println(vBolean[i] + "");
        }
    }
}
