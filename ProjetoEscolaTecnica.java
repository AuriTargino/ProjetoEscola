 
package com.mycompany.projetoescolatecnica;

public class ProjetoEscolaTecnica {

    public static void main(String[] args) {
          
        
        
         System.out.println("Dados do Aluno!!!");
         ClassAluno a1 = new ClassAluno();
         a1.setNome("Roberta");
         a1.setCurso("Programação");
         a1.setMatricula(2222);
         a1.setIdade(45);
         a1.setSexo("F");
         a1.pagarMensalidade();
         System.out.println("Dados Aluno -> " + a1.toString());
         
         
         
    }
}
