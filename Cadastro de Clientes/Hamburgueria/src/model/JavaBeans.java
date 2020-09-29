package model;

public class JavaBeans {
	private String idcliente;
	private String nomecliente;
	private String cpf;
	private String telefone;
	private String email;
	
	public JavaBeans(){
		
	}
	
	public JavaBeans(String idcliente, String nomecliente, String cpf, String telefone, String email) {
	 this.idcliente = idcliente;
	 this.nomecliente = nomecliente;
	 this.cpf = cpf;
	 this.telefone = telefone;
	 this.email = email;
	}
	
	public String getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(String idcliente) {
		this.idcliente = idcliente;
	}
	public String getNomecliente() {
		return nomecliente;
	}
	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		
	}

	
}	
