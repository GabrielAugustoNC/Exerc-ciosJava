
package br.com.imovel.main;

import br.com.imovel.classes.Casa;
import br.com.imovel.classes.Edificio;
import br.com.imovel.classes.Porta;


public class Main {

    
    public static void main(String[] args) {
        Porta porta = new Porta();
        porta.setAberta(false);
        porta.setCor("azul");
        porta.getDimensaoA(1);
        porta.getDimensaoB(2);
        porta.getDimensaoC(3);
        
        System.out.println("Porta:");
        System.out.println("Status : "+ porta.status());
        System.out.println("Cor: "+ porta.getCor());
        System.out.println("Dimensão A   : "+ porta.getDimensaoA());
        System.out.println("Dimensão B   : "+ porta.getDimensaoB());
        System.out.println("Dimensão C   : "+ porta.getDimensaoC());
        
        porta.abre();
        porta.pintaPorta("Vermelho");
        porta.getDimensaoA(4);
        porta.getDimensaoB(5);
        porta.getDimensaoC(6);
        
        System.out.println("\n\n\nDados da porta depois das modificações:");
        System.out.println("Status : "+ porta.status());
        System.out.println("Cor: "+ porta.getCor());
        System.out.println("Dimensão A   : "+porta.getDimensaoA());
        System.out.println("Dimensão B   : "+porta.getDimensaoB());
        System.out.println("Dimensão C   : "+porta.getDimensaoC());
        
        
   
        Casa casa = new Casa();
        casa.pintaPorta("roxo");
        
        Porta porta1 = new Porta();
        porta1.setAberta(false);
        porta1.setCor("marrom");
        porta1.getDimensaoA(7);
        porta1.getDimensaoB(8);
        porta1.getDimensaoC(9);
        
        casa.setPorta(porta1);
        
        Porta porta2 = new Porta();
        porta2.setAberta(true);
        porta2.setCor("rosa");
        porta2.getDimensaoA(10);
        porta2.getDimensaoB(11);
        porta2.getDimensaoC(12);
        
        casa.setPorta(porta2);
        
        Porta porta3 = new Porta();
        porta3.setAberta(false);
        porta3.setCor("branco");
        porta3.getDimensaoA(13);
        porta3.getDimensaoB(14);
        porta3.getDimensaoC(15);
        
        casa.setPorta(porta3);
        
        Porta porta4 = new Porta();
        porta4.setAberta(true);
        porta4.setCor("verde");
        porta4.getDimensaoA(16);
        porta4.getDimensaoB(17);
        porta4.getDimensaoC(18);
        
        casa.setPorta(porta4);
        
        System.out.println("Números de portas: " + casa.getTotalPortas());
        System.out.println("Número de portas abertas: " + casa.getAbertas());
        
    }
    
}
