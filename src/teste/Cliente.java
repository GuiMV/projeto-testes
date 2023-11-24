package teste;

public class Cliente{
	  private String nome;
	  private String cpf;
	  private String telefone;
	  private String endereco;
	  
	  public Cliente(String nome, String cpf){
	    this.nome = nome;
	    this.cpf = cpf;
	    this.telefone = "";
	    this.endereco = "";
	  }
	  
	  public String getNome() {
	  	return nome;
	  }
	  public void setNome(String nome) {
	  	this.nome = nome;
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
	  public String getEndereco(){
	    return endereco;
	  }
	  public void setEndereco(String endereco){
	    this.endereco = endereco;
	  }

	  public String toString() {
	    String retorno = "";
	    if (!getNome().equals(""))
	      retorno += "Nome: " + getNome() + "\n";
	    if (!getCpf().equals(""))
	      retorno += "Cpf: " + getCpf() + "\n";
	    if (!getTelefone().equals(""))
	      retorno += "Telefone: " + getTelefone() + "\n";
	    if (!getEndereco().equals(""))
	      retorno += "Endereço: " + getEndereco();
	    return retorno;
	  }

	  public boolean equals(Object obj) {
	    if (obj instanceof Cliente) {
	      final Cliente C = (Cliente) obj;
	      if (C.getCpf().equals(this.getCpf())){
	        return true;
	      }
	    }
	    return false;
	  }
	    
	}