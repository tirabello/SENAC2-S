
package com.mycompany.vetor1ex;

import java.util.Random;
import java.util.Scanner;



public class Vetor1ex {

    public static void main(String[] args) {
        
        int[] vBase = new int[5];              
        
        imprimeVetor(vBase);
        vBase = carregarNumerosAleatorios(vBase);
                      
        System.out.println(" ");
        System.out.println("Com os numeros aleatorios");
        imprimeVetor(vBase);
        
        //somar e mostrar indices pares e impares
        int valorSomadoIndicePar = 0;
        int valorImpar = 0;
        for (int i = 0; i < vBase.length; i++) {
            if (i%2==0){
                valorSomadoIndicePar = valorSomadoIndicePar + vBase[i];
            }
            else{
                valorImpar = valorImpar + vBase[i];
            }
        }
        System.out.println("\n");
        System.out.println("O valor dos indices par é " + valorSomadoIndicePar);
        System.out.println("O valor dos indices impar é " + valorImpar);
        
         //somar somente os numeros 
       int SomarTodosPares = 0;
       int SomarTodosImpares = 0;
        for (int i = 0; i < vBase.length; i++) {
            if (vBase[i]%2==0){
                SomarTodosPares = SomarTodosPares + vBase[i];
            }
            else{
               SomarTodosImpares  = SomarTodosImpares + vBase[i];
            }
        }
        System.out.println("------------------------------------------------");
        System.out.println("O valor dos numeros pares é: " + SomarTodosPares);
        System.out.println("O valor dos numeros impares é: " + SomarTodosImpares);
               
        //buscar numero
        buscarNumero(vBase);
        
        //menor vetor
        MenorVetor(vBase);
        //maior vetor
        MaiorVetor(vBase);
        
        //multiplicar
        vBase = MultiplicarVetor(vBase);
        imprimeVetor(vBase);
    }
       
   private static void imprimeVetor(int[]vEnviado){
       for(int i = 0; i< vEnviado.length;i++){
           System.out.print(vEnviado[i] + " ");
       }
   }
    private static int[] carregarNumerosAleatorios(int[] vRecebido) {
        Random rd = new Random();
         for (int i = 0; i < vRecebido.length; i++) {
            vRecebido[i] = rd.nextInt(10);
        }
         return vRecebido;
    }
    public static void buscarNumero(int[] vetor){
        Scanner scan = new Scanner (System.in);
        System.out.println("-----------------------------");
        System.out.println("Qual numero deseja encontrar?");
        int numero = scan.nextInt();
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("O numero " + numero + " esta na posição " + i + " do vetor");
                i= vetor.length;
            }
            else{
                System.out.println("Nao foi encontrado");              
            }        
        }
    }
    public static void MenorVetor(int[] mVetor){
        int menor = mVetor[0];
        for (int i = 0; i < mVetor.length; i++) {
            if (mVetor[i]< menor) {
                menor = mVetor[i];
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("O menor valor armazenado é " + menor);
    }
    public static void MaiorVetor(int[] mVetor){
        int maior = mVetor[0];
        for (int i = 0; i < mVetor.length; i++) {
            if (mVetor[i]> maior) {
                maior = mVetor[i];
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("O maior valor armazenado é " + maior);
    }
    public static int[] MultiplicarVetor(int[]vMulti){
        Scanner scan = new Scanner (System.in);
        System.out.println("--------------------------------------");
        System.out.println("\nPor qual numero deseja multiplicar?");
        int numero = scan.nextInt();
        
        for (int i = 0; i < vMulti.length; i++) {
            vMulti[i] *= numero;
        }
        return vMulti;
    }
}
