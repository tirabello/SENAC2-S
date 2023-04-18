
package com.mycompany.lista01_vetores;


public class ex20 {
    public static void main(String[] args) {
        int[] x = {5,1,4,2,3};
        int[] y = {8,7,6,5,1};
        
        somaVetores(x,y);
        produtoVetor(x,y);
        System.out.println("Diferença entre x e y: ");
        diferencaVet(x,y);
        System.out.println("\nInterseção entre x e y:  ");
        intersecaoVet(x,y);
        System.out.println("\nUnião entre x e y: ");
        uniaoVet(x,y);
    }
    
    private static void somaVetores(int[] vet1, int[] vet2) {
        System.out.println("Soma dos elementos de cada vetor: ");
        for (int i = 0; i < vet1.length; i++) {
            System.out.println(vet1[i] + " + " + vet2[i] + " = " +(vet1[i] + vet2[i]));
        }
    }

    private static void produtoVetor(int[] x, int[] y) {
        System.out.println("Multiplicação dos elementos de cada vetor: ");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + " * " + y[i] + " = " +(x[i] * y[i]));
        }
    }

    private static void diferencaVet(int[] x, int[] y) {
        for (int i = 0; i < x.length; i++) {
            boolean igual = false;
            for (int j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    igual = true;
                }              
            }
            if (!igual) {
                System.out.print(x[i]+ " ");
            }
        }
    }

    private static void intersecaoVet(int[] x, int[] y) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (x[i] == y[j]) {
                    System.out.print(x[i] + " ");
                }
            }
        }
    }

    private static void uniaoVet(int[] x, int[] y) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        for (int i = 0; i < y.length; i++) {
            boolean igual = false;
            for (int j = 0; j < x.length; j++) {
                if (y[i] == x[j]) {
                    igual = true;
                }              
            }
            if (!igual) {
                System.out.print(y[i]+ " ");
            }
        }
    }
}
