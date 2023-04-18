
package com.mycompany.lista01_vetores;

import static com.mycompany.lista01_vetores.ex06.imprimeVetor;
import static com.mycompany.lista01_vetores.ex13.criarVetor;

public class ex16 {
    public static void main(String[] args) {
        float [] vBase = new float[10];
        vBase = criarVetor(vBase);
        imprimeVetor(vBase);
        mediaVetor(vBase);
    }

    private static void mediaVetor(float[] vBase) {
        float soma = 0;
        for (int i = 0; i < vBase.length; i++) {
            soma += vBase[i];
        }
        System.out.println("\nA media aritmética desse vetor é: " + (soma/vBase.length));
    }
}
