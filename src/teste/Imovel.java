package teste;

public abstract class Imovel {
	  protected String endereco;
	  protected int numero;
	  protected int tamanho;
	  
	  public Imovel(String endereco, int numero, int tamanho){
	    this.endereco = endereco;
	    this.numero = numero;
	    this.tamanho = tamanho;
	  }
	  
	  public String getEndereco() {
	  	return endereco;
	  }
	  public void setEndereco(String endereco) {
	  	this.endereco = endereco;
	  }
	  public int getNumero() {
	  	return numero;
	  }
	  public void setNumero(int numero) {
	  	this.numero = numero;
	  }
	  public int getTamanho() {
	  	return tamanho;
	  }
	  public void setTamanho(int tamanho) {
	  	this.tamanho = tamanho;
	  }

	  public String toString() {
	    String retorno = "";
	    if (!getEndereco().equals(""))
	      retorno += "Endereço: " + getEndereco() + "\n";
	    retorno += "Número: " + getNumero() + "\n";
	    retorno += "Tamanho: " + getTamanho();
	    return retorno;
	  }

	  public boolean equals(Object obj) {
	    if (obj instanceof Imovel) {
	      Imovel I = (Imovel) obj;
	      if ( (I.getNumero()==this.getNumero()) && (I.getTamanho()==this.getTamanho()) &&(I.getEndereco().equals(this.getEndereco())) ) {
	        return true;
	      }
	    }
	    return false;
	  }  
	}