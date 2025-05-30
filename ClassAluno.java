
package com.mycompany.projetoescolatecnica;

public class ClassAluno extends ClassPessoa{
    
    private int matricula;
    private String curso;
    
    
    public void pagarMensalidade(){
        System.out.println("Pagando Mensalidade Do Aluno =  " + this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

   
   
  
    
}
