package br.com.imovel.classes;

public class Porta {
    private boolean aberta;
    private String cor;
    private float dimensaoA;
    private float dimensaoB;
    private float dimensaoC;

    public Porta() {
    }

    public Porta(boolean aberta, String cor, float dimensaoA, float dimensaoB, float dimensaoC) {
        this.aberta = aberta;
        this.cor = cor;
        this.dimensaoA = dimensaoA;
        this.dimensaoB = dimensaoB;
        this.dimensaoC = dimensaoC;
    }
    
    
    public void abre(){
        this.aberta = true;
    }
    
    public void fecha(){
        this.aberta = false;
    }
    
    public void pintaPorta(String cor){
        this.cor = cor;
    }
    
    public boolean status(){
        return this.aberta;
    }
    
    public boolean statusAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getdimensaoA() {
        return dimensaoA;
    }

    public void setdimensaoA(float dimensaoA) {
        this.dimensaoA = dimensaoA;
    }

    public float getdimensaoB() {
        return dimensaoB;
    }

    public void setdimensaoB(float dimensaoB) {
        this.dimensaoB = dimensaoB;
    }

    public float getdimensaoC() {
        return dimensaoC;
    }

    public void setdimensaoC(float dimensaoC) {
        this.dimensaoC = dimensaoC;
    }
    
}
