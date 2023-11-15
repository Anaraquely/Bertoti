package entidades;

public class Cliente {
	private String nome_Cliente;
	private int id_Cliente;
	
	public Cliente(String nome_Cliente, int id_Cliente) {
		this.nome_Cliente = nome_Cliente;
		this.id_Cliente = id_Cliente;
	}
	public String getNome_Cliente() {
		return nome_Cliente;
	}
	public void setNome_Cliente(String nome_Cliente) {
		this.nome_Cliente = nome_Cliente;
	}
	public int getId_Cliente() {
		return id_Cliente;
	}
	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}
	

}
