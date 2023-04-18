
package com.mycompany.lista01_vetores;

import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) {
        int [] vet = new int [10];
        vet = criarVetor(vet);
        contadorPares(vet);
        
    }
    public static int [] criarVetor (int [] vRecebido){
        Scanner scan = new Scanner (System.in);
        System.out.println("Insira 10 numeros: ");
        for (int i = 0; i < vRecebido.length; i++) {
            vRecebido[i] = scan.nextInt();
        }
        return vRecebido;
    }

    private static void contadorPares(int[] vet) {
        int contador = 0;
        for (int i = 0; i < vet.length; i++) {
            if (vet[i]%2==0) {
                contador++;
            }
        }
        if (contador==0) {
            System.out.println("O vetor não possui elementos pares");
        }else{
            System.out.println("O vetor possui " + contador + " elementos pares.");
        }
    }
}
