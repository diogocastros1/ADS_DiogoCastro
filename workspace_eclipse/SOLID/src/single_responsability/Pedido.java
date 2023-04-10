package single_responsability;

// Exemplo de como não efetuar o single responsability
//public class Pedido {
//	public void calcularTotal() {}
//	public void getItens() {}
//	public void adicionarItem() {}
//	public void deletarItem() {}
//	
//	public void imprimirPedido() {}
//	public void mostrarPedido() {}
//	
//	public void search() {}
//	public void insert() {}
//	public void update() {}
//	public void deletes() {}
//}

class PedidoModel {
	public void calcularTotal() {}
	public void getItems() {}
	public void adicionarItem() {}
	public void deletarItem() {}
	
}

class PedidoViewer {
	public void imprimirPedido() {}
	public void mostrarPedido() {}
}

class PedidoRepository {
	public void search() {}
	public void insert() {}
	public void update() {}
	public void deletes() {}
}
