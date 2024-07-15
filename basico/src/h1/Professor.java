package h1;

public class Professor extends Pessoa{
	public double salario;
	public String disciplinas;
	
	public Professor(String nome, String CPF, String telefone, double salario, String disciplinas){
		super(nome, CPF, telefone);
		this.salario = salario;
		this.disciplinas = disciplinas;
	}
}
