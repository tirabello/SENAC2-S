/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.ado;

/**
 *
 * @author titi2
 */
public class Funcionario {
    String nome;
    String departamento;
    double salario;
    String entrada;
    String RG;

    public Funcionario() {
    }

    public Funcionario(String nome, String departamento, double salario, String entrada, String RG) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.entrada = entrada;
        this.RG = RG;
    }
    
    public double recebeAumento(double aumento){
        this.salario += aumento;
        return this.salario;
    }
    
    public double calculoGanhoAnual(){
        return this.salario * 12;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
    
}
