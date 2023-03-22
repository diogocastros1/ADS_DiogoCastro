package estoque;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

public class TestProduto {

	@Test
	void testeProdJavaBean() {
		Produto p = new Produto();
		p.setDescricao("Cerveja");
		p.setValorCompra(10.99);
		p.setDataValidade(LocalDate.of(2022, Month.DECEMBER, 30));
		
		System.out.println("Dados");
		System.out.println(p.getDescricao());
		System.out.println(p.getValorCompra());
		System.out.println(p.getDataValidade());
	}

}
