package teste;

public class Locacao {
	  private int ano_atual;
	  private int vencimento;
	  private Imovel imovel;
	  private int duracao_locacao;

	  public Locacao(int ano_atual, int vencimento, Imovel imovel){
	    this.ano_atual=ano_atual;
	    this.vencimento=vencimento;
	    this.imovel=imovel;
	    this.duracao_locacao = vencimento - ano_atual;
	  }

	  public int getAno_atual() {
	  	return ano_atual;
	  }
	  public void setAno_atual(int ano_atual) {
	  	this.ano_atual = ano_atual;
	  }
	  public int getVencimento() {
	  	return vencimento;
	  }
	  public void setVencimento(int vencimento) {
	  	this.vencimento = vencimento;
	  }
	  public Imovel getImovel() {
	  	return imovel;
	  }
	  public void setImovel(Imovel imovel) {
	  	this.imovel = imovel;
	  }
	  public int getDuracao_locacao() {
	  	return duracao_locacao;
	  }
	  public void setDuracao_locacao(int duracao_locacao) {
	  	this.duracao_locacao = duracao_locacao;
	  }

	  public String toString(){
	    String retorno = "";
	    retorno += "Imóvel: " + getImovel() + "\n";
	    retorno += "Duração da locação: " + getDuracao_locacao() + "\n";
	    retorno += "Vencimento da locação: " + getVencimento();
	    return retorno;
	  }	  
	}