package teste;

public class Apartamento extends Imovel{
	  private int andar;
	  private String bloco;

	  public Apartamento(String Novo_endereco, int Novo_numero, int Novo_tamanho, int Novo_andar, String Novo_bloco){
	    super(Novo_endereco, Novo_numero, Novo_tamanho);
	    this.andar = Novo_andar;
	    this.bloco = Novo_bloco;
	  }
	  
	  public int getAndar() {
	  	return this.andar;
	  }
	  public void setAndar(int andar) {
	  	this.andar = andar;
	  }
	  public String getBloco() {
	  	return bloco;
	  }
	  public void setBloco(String bloco) {
	  	this.bloco = bloco;
	  }

	  public String toString() {
	    String retorno = super.toString();
	    retorno += "\nAndar: " + andar + "\n";
	    if (!bloco.equals("")) {
	      retorno += "Bloco: " + bloco;}
	    return retorno;
	  }

	  public boolean equalsAp(Object obj) {
		  if (super.equals(obj)) {
			  if (obj instanceof Apartamento) {
	    		Apartamento A = (Apartamento) obj;
	    		return A.getAndar() == this.getAndar() && A.getBloco().equals(this.getBloco());
	    	}
	    }
	    return false;
	  }
	}