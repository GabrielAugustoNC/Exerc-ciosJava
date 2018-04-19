package br.com.imovel.classes;

import java.util.ArrayList;

public abstract class Imovel {
    public String cor;
    private final ArrayList<Porta> listaPortas = new ArrayList<>();
    
    public void pinta(String cor){
        this.cor = cor;
    };
    
    public int portasAbertas(){
        int count = 0;
        for(int i=0;i<this.listaPortas.size();i++){
            if(listaPortas.get(i).status() == true){
                count ++;
            }
        }
        return count;
    }

    public void setPorta(Porta porta) {
        if(porta != null){
            this.listaPortas.add(porta);
        }
    }
    
    public int totalPortas(){
        return this.listaPortas.size();   
    }
    
    
}
