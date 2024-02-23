package Classes;

public class Fornecedor {
	private String nome_Fornecedor;
	private String oq_Fornece;
	
	public Fornecedor(String nome_Fornecedor, String oq_Fornece) {
		this.nome_Fornecedor = nome_Fornecedor;
		this.oq_Fornece = oq_Fornece;
	}
	public String getNome_Fornecedor() {
		return nome_Fornecedor;
	}
	public void setNome_Fornecedor(String nome_Fornecedor) {
		this.nome_Fornecedor = nome_Fornecedor;
	}
	public String getOq_Fornece() {
		return oq_Fornece;
	}
	public void setOq_Fornece(String oq_Fornece) {
		this.oq_Fornece = oq_Fornece;
	}
	

}
