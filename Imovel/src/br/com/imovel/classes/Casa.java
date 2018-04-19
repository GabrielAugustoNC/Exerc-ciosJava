package br.com.imovel.classes;

public class Casa extends Imovel{
        private int [] totalPortas;
        private int [] abertas;

        public void setTotalPortas(int [] totalPortas){
            this.totalPortas = totalPortas;
        }
        public Int getTotalPortas(){
            return totalPortas;
        }

        public void setAbertas(int [] Abertas){
            this.abertas = Abertas;
        }
        public Int getAbertas(){
            return abertas;
        }
}
