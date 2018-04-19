package br.com.caixaeletronico.classes;

import java.util.ArrayList;

public class ContaCorrente {

    // Atributos
    private int numeroConta;
    private float saldo;
    private boolean especial;
    private float limiteConta;
    private ArrayList<Movimentacao> listaMovimentacoes = new ArrayList<>();
    
    // Construtor
    public ContaCorrente() {
    
    }

    public ContaCorrente(int numero, float saldo, boolean especial, float limite, ArrayList<Movimentacao> movimentacoes) {
        this.numeroConta = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limiteConta = limite;
        this.listaMovimentacoes = movimentacoes;
    }

    // Métodos Acessores
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo,Movimentacao operacao) {
        this.saldo = saldo;

        if(operacao != null)
            this.listaMovimentacoes.add(operacao);
    }

    public boolean tipoEspecial() {
        return especial;
    }


    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public ArrayList<Movimentacao> getListaMovimentacoes() {
        return listaMovimentacoes;      
        
    }

    
}
