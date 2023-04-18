
package com.mycompany.lista01_vetores;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        int [] vet = new int [10];
        int num;
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < vet.length; i++) {
            boolean jaExiste;
            do{
                jaExiste = false;
                System.out.println("Digite o numero " +(i+1) + " do vetor: ");
                num = scan.nextInt();
                for (int j = 0; j < i; j++) {
                    if (num==vet[j]) {
                        jaExiste=true;
                    }
                }
                if (jaExiste) {
                    System.out.println("Esse numero ja está no vetor, digite outro: ");
                }else{
                    vet[i] = num;
                }
            }while(jaExiste);
        }
        imprimeVetor(vet);
    }
    private static void imprimeVetor(int[]vEnviado){
       for(int i = 0; i< vEnviado.length;i++){
           System.out.print(vEnviado[i] + " ");
       }
   }
}
