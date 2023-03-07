
package com.mycompany.tiagorabelloado1;

public class Tucano {
    
    private String nome;
    private String coloracao_bico;
    private String habitat;
     
    public Tucano(){
        this.nome = "Tucano";
    }
    
    public Tucano(String novaColoracao, String novoHabitat){
        this.nome = "Tucano";
        this.coloracao_bico = novaColoracao;
        this.habitat = novoHabitat;   
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getColoracao_bico() {
        return coloracao_bico;
    }

    public void setColoracao_bico(String coloracão_bico) {
        this.coloracao_bico = coloracão_bico;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    //métodos - ação;
    
    public void voar(){
        System.out.println("O tucano está voando.");
    }
    public void comer(){
        System.out.println("O tucano está comendo.");
    }

}
