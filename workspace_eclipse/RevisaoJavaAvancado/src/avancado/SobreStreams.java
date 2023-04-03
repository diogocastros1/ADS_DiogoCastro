package avancado;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SobreStreams {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto(1L, "Cadeira", 100.00));
		produtos.add(new Produto(2L, "Cama", 400.00));
		produtos.add(new Produto(3L, "Mesa", 200.00));
		produtos.add(new Produto(4L, "Sofá", 500.00));
		produtos.add(new Produto(5L, "Cadeira", 150.00));
		
//		1. filter()
		List<Produto> produtosFiltrados = produtos.stream()
				.filter(p -> p.getPreco() > 300.00)
				.toList(); //toList() desta forma a partir do Java 17
		
		produtosFiltrados.forEach( System.out::println );

//		2. map()
		List<String> descricoes = produtos.stream()
				.map(p -> p.getDescricao())
				.toList();
		
		descricoes.forEach( System.out::println );
		
//		3. map() e reduce()
		Double precoTotal = produtos.stream()
				.filter(p -> p.getPreco() < 300.00)
				.map(p -> p.getPreco())
				.reduce(0.0, Double::sum ); //0.0 é o valor inicial da soma
		
		System.out.println(precoTotal);
	}
	
	
}
