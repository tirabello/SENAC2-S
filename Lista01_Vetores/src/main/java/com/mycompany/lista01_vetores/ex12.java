
package com.mycompany.lista01_vetores;

public class ex12 {
    public static void main(String[] args) {
        int [] A = {1,0,5,-2,-5,7};
        int soma = A[0] + A[1] + A[5];
        System.out.println("A soma dos valores da posição  A[0], A[1],e A[5] é: " + soma);
        A[4] = 100;
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}
