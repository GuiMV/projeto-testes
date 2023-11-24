package teste;

public class PontoComercial extends Imovel{
	  private String nome;
	  private String cnpj;

	  public PontoComercial(String Novo_endereco, int Novo_numero, int Novo_tamanho, String Novo_nome, String Novo_cnpj){
	    super(Novo_endereco, Novo_numero, Novo_tamanho);
	    this.nome = Novo_nome;
	    this.cnpj = Novo_cnpj;
	  }
	  
	  public String getNome() {
	  	return nome;
	  }
	  public void setNome(String nome) {
	  	this.nome = nome;
	  }
	  public String getCnpj() {
	  	return cnpj;
	  }
	  public void setCnpj(String cnpj) {
	  	this.cnpj = cnpj;
	  }

	  public String toString() {
	    String retorno = "";
	    if (!super.endereco.equals(""))
	      retorno += "Endereço: " + super.endereco + "\n";
	    retorno += "Número: " + super.numero + "\n";
	    retorno += "Tamanho: " + super.tamanho + "\n";
	    if (!nome.equals(""))
	      retorno += "Nome: " + nome + "\n";
	    if (!cnpj.equals(""))
	      retorno += "Cnpj: " + cnpj;
	    return retorno;
	  }

	  public boolean equals(Object Pc) {
	    if (Pc instanceof PontoComercial) {
	      PontoComercial PC = (PontoComercial) Pc;
	      if (PC.cnpj.equals(this.cnpj)) {
	        return true;
	      }
	    }
	    return false;
	  }
	  
	}