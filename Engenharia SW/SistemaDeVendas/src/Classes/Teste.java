package Classes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;


class Teste {
	
	@Test
	public void test() {
		Pedido pedido = new Pedido();
		assertEquals(pedido.getProdutos().size(), 0);

		pedido.addProduto(new Produto("Jaqueta", 5, new Detalhe("Preta", "M", "Nike")));
		assertEquals("Jaqueta", pedido.getProdutos().get(0).getNome_Produto());
		assertEquals("Preta", pedido.getProdutos().get(0).getDetalhe().getCorPeca());
		assertEquals("M", pedido.getProdutos().get(0).getDetalhe().getTamanho());
		assertEquals("Nike", pedido.getProdutos().get(0).getDetalhe().getMarca());
		
		pedido.addProduto(new Produto("Blusa", 2, new Detalhe("Rosa", "P", "Adidas")));
		assertEquals("Blusa", pedido.getProdutos().get(1).getNome_Produto());
		assertEquals("Rosa", pedido.getProdutos().get(1).getDetalhe().getCorPeca());
		assertEquals("P", pedido.getProdutos().get(1).getDetalhe().getTamanho());
		assertEquals("Adidas", pedido.getProdutos().get(1).getDetalhe().getMarca());
		
		pedido.addProduto(new Produto("Calça moletom", 1, new Detalhe("Preta", "GG", "Hering")));
		assertEquals("Calça moletom", pedido.getProdutos().get(2).getNome_Produto());
		assertEquals("Preta", pedido.getProdutos().get(2).getDetalhe().getCorPeca());
		assertEquals("GG", pedido.getProdutos().get(2).getDetalhe().getTamanho());
		assertEquals("Hering", pedido.getProdutos().get(2).getDetalhe().getMarca());
		
		assertEquals(pedido.getProdutos().size(),3);
		
		List<Produto> produtosEncontrados = pedido.verificarProduto(new Detalhe("Preta", "M", "Nike"));
		assertEquals(produtosEncontrados.get(0).getDetalhe().getTamanho(), "M");
		assertEquals("Nike", pedido.getProdutos().get(0).getDetalhe().getMarca());
		assertEquals("Preta", pedido.getProdutos().get(0).getDetalhe().getCorPeca());
		
		
		assertEquals(3, pedido.getProdutos().size());
	}

}
