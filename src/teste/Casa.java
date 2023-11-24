package teste;

public class Casa extends Imovel{
	  private int comodos;

	  public Casa(String Novo_endereco, int Novo_numero, int Novo_tamanho, int Novo_comodos){
	    super(Novo_endereco, Novo_numero, Novo_tamanho);
	    this.comodos = Novo_comodos;
	  }
	  
	  public int getComodos() {
	  	return comodos;
	  }
	  public void setComodos(int comodos) {
	  	this.comodos = comodos;
	  }

	  public String toString() {
	    String retorno = super.toString();
	    retorno += "\nCômodos: " + comodos;
	    return retorno;
	  }

	  public boolean equalsCasa(Object Cas) {
	    if (Cas instanceof Casa) {
	      Casa C = (Casa) Cas;
	      if ( (C.getNumero()==super.numero) && (C.getTamanho()==super.tamanho) &&(C.getEndereco().equals(super.endereco)) && (C.comodos==this.comodos) ) {
	        return true;
	      }
	    }
	    return false;
	  }
	  
	}
