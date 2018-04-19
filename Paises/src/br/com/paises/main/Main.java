package br.com.paises.main;

import br.com.paises.classes.Pais;

public class Main {

    public static void main(String[] args) {
        Pais pais1 = new Pais("Uruguai","Montevidéu",176215);
        Pais pais2 = new Pais("Afeganistão","Cabul",652864);
        Pais pais3 = new Pais("Croácia","Zagreb",56594);
        Pais pais4 = new Pais("Itália","Roma",301338);
        Pais pais5 = new Pais("Brasil","Brasilia",8516000);
        Pais pais6 = new Pais("Argentina","Buenos Aires",2780000);
        Pais pais7 = new Pais("Alemanha","Berlim",357376);
        
        
        Pais[] listaPaises = {pais1,pais2,pais3,pais4,pais5,pais6,pais7};
        pais.defineFronteira(lista_de_paises);
        
        Pais[] listaFronteirasPais = pais.getFronteiras();
        
        for(int i=0;i<listaFronteirasPais.length;i++){
            System.out.println("Nome  Fronteira: "+ listaFronteirasPais[i].getNome());
        }
        
        Pais[] listaPaisesIguais = {pais1,pais2,pais3,pais4,pais5,pais6,pais7};
        pais.defineFronteira(listaPaisesIguais);
        pais4.defineFronteira(listaPaisesIguais);
        
        Pais[] listaPaisesProximos = pais.paisesProximos(pais4);
        
        for(int i=0;i<listaPaisesProximos.length;i++){
            System.out.println("Nome País: "+ listaPaisesProximos[i].getNome());
        }
        
    }
    
}
