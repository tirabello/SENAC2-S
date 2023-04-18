
package com.mycompany.lista01_vetores;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        int vet[] = new int[5];
        vet = criarVetor(vet);
        atualizarSalarios(vet);
        System.out.println("Salarios atualizados: ");
        imprimeVetor(vet);      
    }
    public static int [] criarVetor (int [] vRecebido){
        Scanner scan = new Scanner (System.in);
        System.out.println("Insira 5 salários: ");
        for (int i = 0; i < vRecebido.length; i++) {
            vRecebido[i] = scan.nextInt();
        }
        return vRecebido;
    }
    public static void imprimeVetor(int[]vEnviado){
       for(int i = 0; i< vEnviado.length;i++){
           System.out.print(vEnviado[i] + " ");
       }
   }
    private static void atualizarSalarios(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i]<1000) {
                vet[i] = (int) (vet[i] * 1.1);
            }
        }
    }   
}
