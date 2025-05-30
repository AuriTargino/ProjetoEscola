
package com.mycompany.projetoescolatecnica;


public class  ClassBolsista extends ClassAluno{
    
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando Bolsa de " + this.getNome());
        
    }
    
    @Override
    public void pagarMensalidade(){
        
        System.out.println(this.getNome() + " E bolsista Pagamento facilitado!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

   
    
}
