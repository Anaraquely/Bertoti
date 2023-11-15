package entidades;

import java.util.LinkedList;
import java.util.List;

public class Pedido {
	private List<Produto> produtos = new LinkedList<Produto>();
	
	public void addProduto (Produto produto) {
		produtos.add(produto);
	}
	public List<Produto> verificarProduto (Detalhe det){
		List<Produto> produtosEncontrados = new LinkedList<Produto>();
		for (Produto produto:produtos) {
			if (produto.getDetalhe().compara(det)) produtosEncontrados.add(produto);
		}
		return produtosEncontrados;
	}
	public void cancelarProduto(Produto produto) {
		int indice = produtos.indexOf(produto);
		produtos.remove(indice);
		
	}
	public List<Produto> getProdutos(){
		return this.produtos;
	}
}
