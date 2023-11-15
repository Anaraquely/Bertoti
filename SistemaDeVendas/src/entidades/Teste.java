package entidades;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.annotation.Target;
import java.util.List;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class Teste {

	@Target
	public void test() {
		Pedido pedido = new Pedido();
		assertEquals(pedido.getProdutos().size());

		pedido.addProduto(new Produto("Jaqueta", 5, new Detalhe("Preta", "M", "Nike")));
		pedido.addProduto(new Produto("Blusa", 2, new Detalhe("Rosa", "P", "Adidas")));
		pedido.addProduto(new Produto("Calça moletom", 1, new Detalhe("Preta", "GG", "Hering")));
		assertEquals(pedido.getProdutos().size(),3);
		
		List<Produto> produtosEncontrados = pedido.verificarProduto(new Detalhe("Preta", "M", "Nike"));
		assertEquals(produtosEncontrados.get(0).getDetalhe().getTamanho(), "M");
		
		List<Produtos> produtosEnList = pedido.cancelarProduto(new Detalhe("Rosa", "P", "Adidas"));
		assertEquals(0, pedido.getProdutos().size());
	}

}
