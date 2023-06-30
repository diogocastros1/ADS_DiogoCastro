package strategy.ferte;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraFreteTest {

	@Test
	void deveCalcularFreteParaDHL() {
		double peso = 9;
		String servico = "dhl";
		CalculadoraFrete calcula = new CalculadoraFrete();
		double valor = calcula.calcularValor(servico, peso);
		assertEquals(100.0, valor);
	}

	@Test
	void deveCalcularFreteParaSedex() {
		double peso = 9;
		String servico = "sedex";
		CalculadoraFrete calcula = new CalculadoraFrete();
		double valor = calcula.calcularValor(servico, peso);
		assertEquals(50.0, valor);
	}

	@Test
	void deveCalcularFreteParaJadlog() {
		double peso = 9;
		String servico = "jadlog";
		CalculadoraFrete calcula = new CalculadoraFrete();
		double valor = calcula.calcularValor(servico, peso);
		assertEquals(0.0, valor);
	}
}
