package modelo;

import java.util.ArrayList;


import visao.PrimeiraTela;


public class Pessoa {
	
        
    
        private String nome;
	private String idade;
	private String sexo;
	
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getIdade() {
		return idade;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
        
        
        
       
           
            
           
           
 }
        
      
   

        
        


            
            
       
        
        
        
        
        
