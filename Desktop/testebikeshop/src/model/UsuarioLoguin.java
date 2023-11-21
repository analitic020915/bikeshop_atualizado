package model;

public class UsuarioLoguin {
	private  String nome;
	private String senha;
	private int matricula;
	
	//Metodo contrutor da classe
	public UsuarioLoguin(String nome, String senha, int matricula) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.matricula = matricula;
		
	}
	
	public String getNome() {
		return nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
