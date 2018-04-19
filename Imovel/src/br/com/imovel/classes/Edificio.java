package br.com.imovel.classes;

public class Edificio extends Imovel{
    private int portas;
    private int andares;

    
    public void adicionarAndar(){
        this.andares++;
    }
    
    public int totalDeAndares(){
        return this.andares;
    }
    
    
}
