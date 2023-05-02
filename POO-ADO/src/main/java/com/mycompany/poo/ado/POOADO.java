/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo.ado;

/**
 *
 * @author titi2
 */
public class POOADO {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        
        funcionario1.setNome("Pedro");
        funcionario1.setDepartamento("RH");
        funcionario1.setSalario(1500);
        funcionario1.recebeAumento(400);
        funcionario1.setRG("45789014-9");
        funcionario1.setEntrada("21/12/2003");
        
        imprimeDados(funcionario1);
        
        System.out.println("");
        
        Funcionario fun2 = new Funcionario("Luiza", "Financeiro", 1700, "24/05/2015", "11896347-8");
        imprimeDados(fun2);
        
        
        
    }
    private static void imprimeDados(Funcionario funcionario1) {
        System.out.println("------------------");
        System.out.println("Nome = " + funcionario1.getNome());
        System.out.println("Departamento = " + funcionario1.getDepartamento());
        System.out.println("Data de Entrada: " + funcionario1.getEntrada());
        System.out.println("RG: " + funcionario1.getRG());
        System.out.println("-------------------");
        System.out.println("Salário = " + funcionario1.getSalario());
        System.out.println("Ganho Anual: " + funcionario1.calculoGanhoAnual());
        
    }
}
