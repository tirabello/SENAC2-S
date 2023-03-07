
package com.mycompany.tiagorabelloado1;

public class Criador {
    public static void main(String[] args) {
        Tucano tucanoA = new Tucano();
        Tucano tutuB = new Tucano("verde" , "amazonia");
        
        tucanoA.setNome("Lurdes");
        tucanoA.setColoracao_bico("Laranja");
      
        tutuB.setNome("Mikel");
        
        System.out.println("O tucano do bico " + tucanoA.getColoracao_bico() + " se chama " + tucanoA.getNome());
        System.out.println("O outro se chama " + tutuB.getNome() + " e tem o bico " + tutuB.getColoracao_bico());
        System.out.println("E ambos vimem na " + tutuB.getHabitat());
       
    }
}
