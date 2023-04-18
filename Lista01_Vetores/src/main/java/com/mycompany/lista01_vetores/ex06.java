
package com.mycompany.lista01_vetores;

import java.util.Random;

public class ex06 {
    public static void main(String[] args) {
        float[] vet = new float[20];
        float media;
        vet = criarVetor(vet);
        imprimeVetor(vet);
        media = mediaAritmedica(vet);
        System.out.println("\nA soma total é: " + media + " e a media aritmetica é " + (media/vet.length) );
        valoresAbaixoMedia(vet, media);     
    }
    public static float [] criarVetor (float [] vRecebido){
        Random rd = new Random();
        System.out.println("vetor com 20 numeros: ");
        for (int i = 0; i < vRecebido.length; i++) {
            vRecebido[i] = rd.nextInt(20);
        }
        return vRecebido;
    }
    public static void imprimeVetor(float[]vEnviado){
       for(int i = 0; i< vEnviado.length;i++){
           System.out.print(vEnviado[i] + " ");
       }
   }

    private static float mediaAritmedica(float[] vet) {
        float media = 0;
        for (int i = 0; i < vet.length; i++) {
            media += vet[i];
        }
       
        return media;
    }

    private static void valoresAbaixoMedia(float[] vet, float media) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < media/vet.length) {
                System.out.print(vet[i] + " ");
            }
        }
    }
}
