package model;

public abstract class  Loguin {
	private String Nome;
	private String senha;
	
	public Loguin(String nome, String senha) {
		super();
		Nome = nome;
		this.senha = senha;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
	
	
	

}
