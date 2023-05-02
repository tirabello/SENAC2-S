
package com.mycompany.recursivo;

import java.util.Scanner;

/**
 *
 * @author tiago.rbraz
 */
public class Recursivo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor para minha função de soma recursiva: ");
        int num = scan.nextInt();

        int valorRtorno = somaRecursiva(num);
        
        System.out.println("O valor da função recursivo foi " + valorRtorno);
        
       
    }

    private static int somaRecursiva(int num) {
        int varRetorno;
        if (num==1) {
            return 1;
        }else{
        varRetorno =  num + somaRecursiva(num -1) ;
        }
        return varRetorno;
    }
}
