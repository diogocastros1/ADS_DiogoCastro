package contabilidade;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ContabilidadeTest {

	@Test
	void testeEmpresaMEI() {
		EmpresaMEI emp = new EmpresaMEI(100.0);
		
		Double valorIREsperado = 27.5;
		assertEquals(valorIREsperado, emp.getValorIR(), 2);
		
		Double valorISSesperado = 0.0;
		assertEquals(valorISSesperado, emp.getValorISS(), 2);
	}
	
	@Test
	void testeEmpresaSimples() {
	EmpresaSimples emp = new EmpresaSimples(100.0);
		
		Double valorIREsperado = 15.0;
		assertEquals(valorIREsperado, emp.getValorIR(), 2);
		
		Double valorISSesperado = 8.0;
		assertEquals(valorISSesperado, emp.getValorISS(), 2);
	}
}
