package h1;

public abstract class Pessoa {
	String nome;
	String CPF;
	String telefone;
	
	public Pessoa(String nome, String CPF, String telefone) {
		this.nome = nome;
		this.CPF = CPF;
		this.telefone = telefone;
	}
}
