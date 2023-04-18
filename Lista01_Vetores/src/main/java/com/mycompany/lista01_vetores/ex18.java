

package com.mycompany.lista01_vetores;

import java.util.Scanner;

public class ex18 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamanho;
        System.out.println("Digite o numero de alunos a ser avaliado: ");
        tamanho = scan.nextInt();
        
        String [] aluno = new String[tamanho];
        float [] prova1 = new float[tamanho];
        float [] prova2 = new float[tamanho];
        float [] media = new float[tamanho];
        
        armazenadorAlunos(aluno, prova1, prova2, media);
        exibirAluno(aluno, prova1, prova2, media);
    }

    private static void armazenadorAlunos(String[] aluno, float[] prova1, float[] prova2, float[] media) {
        Scanner scan = new Scanner(System.in);
        Scanner nome = new Scanner(System.in);
        for (int i = 0; i < media.length; i++) {
            System.out.println("Digite o nome do estudante: ");
            aluno[i] = nome.nextLine();
            
            System.out.println("Agora, digite a nota da prova 1: ");
            prova1[i] = scan.nextFloat();
            
            System.out.println("Em seguida, a prova 2: ");
            prova2[i] = scan.nextFloat();
            
            media[i]=(prova1[i] + prova2[i])/2;
        }    
    }

    private static void exibirAluno(String[] aluno, float[] prova1, float[] prova2, float[] media) {
        for (int i = 0; i < media.length; i++) {
            System.out.println("Aluno: " + aluno[i] + " ");
            System.out.println("Prova 1: " + prova1[i] + " ");
            System.out.println("Prova 2: " + prova2[i] + " ");
            System.out.println("Média: " + media[i] + " ");
            System.out.println("");
        }
    }
}
