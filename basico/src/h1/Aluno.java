package h1;

public class Aluno extends Pessoa{
	public String matricula;
	
		public Aluno(String nome, String CPF, String telefone, String matricula){
			super(nome, CPF, telefone);
			this.matricula = matricula;
		}
	
	}
