package br.com.paises.classes;

public class Pais {
    // Atributos
    private String nome;
    private String nomeCapital;
    private int dimensao;
    private Pais[] fronteiras;

    // Construtor
    public Pais(String nome, String nomeCapital, int dimensao) {
        this.nome = nome;
        this.nomeCapital = nomeCapital;
        this.dimensao = dimensao;
    }


    // Métodos Acessores
    public String getNome() {
        return nome;
    }
  
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCapital() {
        return nome_capital;
    }

    public void setNomeCapital(String nomeCapital) {
        this.nomeCapital = nomeCapital;
    }

    public int getDimensao() {
        return dimensao;
    }

    public void setDimensao(int dimensao) {
        this.dimensao = dimensao;
    }
    
    public boolean equals(Pais paisComparacao){
        boolean return = false;
        
        String nomePaisComparacao = paisComparacao.getNome();
        String nomeCapitalComparacao = paisComparacao.getNomeCapital();

        String nomePais = this.nome;
        String nomeCapitalPais = this.nome_capital;
        
        if(nomePais.equals(nomePaisComparacao) 
            if(nomeCapitalPais.equals(nomeCapitalComparacao))
                retorno = true;
        
        return retorno;
    }
    
    public void defineFronteira(Pais listaPaises){
        int countIguais = 0;
        
        for(int i=0;i<listaPaises.length;i++){
            if(this.equals(listaPaises[i]))
                quantidadePaisesIguais++;
        }
        
        this.fronteiras = new Pais[listaPaises.length - countIguais];
        
        int indice = 0;

        for(int i=0;i< paises.length;i++){
            if(!this.equals(listaPaises[i])){
                this.fronteiras[indice] = listaPaises[i];
                indice++;
            }
        }
        
    }
    
    public Pais[] getFronteiras(){
        return this.fronteiras;
    }

    public Pais[] paisesProximos(Pais paisComparacao) {
        int Iguais = 0;
        
        for (Pais fronteiraPais : this.fronteiras) {
            for (Pais fronteiraComparacao : paisComparacao.fronteiras) {
                if (fronteiraPais.equals(fronteiraComparacao))
                    Iguais++;
            }
        }

        if (Iguais > 0) {
            int indice = 0;
            Pais[] listaIguais = new Pais[Iguais];
            for (Pais fronteiraPais : this.fronteiras) {
                for (Pais fronteiraComparacao : outro.fronteiras) {
                    if (fronteiraPais.equals(fronteiraComparacao)) {
                        listaIguais[indice] = fronteiraComparacao;
                        indice++;
                    }
                }
            }

            return listaIguais;
        }
        return null;
    }    
    
}
