package Classes;

public class Produto {
	private String nome_Produto; 
	private int qntd_Produto;
	private Detalhe detalhe;
	
	
	public Produto(String nome_Produto, int qntd_Produto, Detalhe detalhe) {
		this.nome_Produto = nome_Produto;
		this.qntd_Produto = qntd_Produto;
		this.detalhe = detalhe;
	}
	public String getNome_Produto() {
		return nome_Produto;
	}
	public void setNome_Produto(String nome_Produto) {
		this.nome_Produto = nome_Produto;
	}
	public int getQntd_Produto() {
		return qntd_Produto;
	}
	public void setQntd_Produto(int qntd_Produto) {
		this.qntd_Produto = qntd_Produto;
	}
	public Detalhe getDetalhe() {
		return detalhe;
	}
	public void setDetalhe(Detalhe detalhe) {
		this.detalhe = detalhe;
	}
	
	


}
