
package com.mycompany.lista01_vetores;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        float vetor1 [] = new float[10];
        vetor1= criarVetor(vetor1);
        
        System.out.println("Vetor:");
        imprimeVetor(vetor1);
        
        float vetor2[] = lerQuadrado(vetor1);
        
        System.out.println("Vetor Quadrado:");
        imprimeVetor(vetor2);      
    }
    public static float [] criarVetor (float [] vRecebido){
        Scanner scan = new Scanner (System.in);
        System.out.println("Insira 10 numeros: ");
        for (int i = 0; i < vRecebido.length; i++) {
            vRecebido[i] = scan.nextFloat();
        }
        return vRecebido;
    }

    private static void imprimeVetor(float[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i] + " ");
        }
    }

    private static float[] lerQuadrado(float[] vet1) {
        float[] vetorQuadrado = new float[vet1.length];
        for (int i = 0; i < vet1.length; i++) {
            vetorQuadrado[i] = (vet1[i] * vet1[i] );
        }
        return vetorQuadrado;
    }
}
