package br.com.caixaeletronico.classes;

public class Movimentacao {
    
    // Atributos
    private float valor;
    private String descricao;
    private boolean credito;
    
    // Construtor
    public Movimentacao() {
    
    }

    // Métodos Acessores
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

       
    public boolean getCredito() {
        return credito;
    }

    
    public void setCredito(boolean credito) {
        this.credito = credito;
    }
    
    
}
