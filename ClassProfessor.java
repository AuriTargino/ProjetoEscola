
package com.mycompany.projetoescolatecnica;

public  class ClassProfessor extends ClassPessoa {
     
   private  String especialidade;
   private float salario;
   private float aumento;
   
   public void receberAumento(){
       this.salario = this.salario + this.aumento;
   }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getAumento() {
        return aumento;
    }

    public void setAumento(float aumento) {
        this.aumento = aumento;
    }

   
    
   
    
    
}
