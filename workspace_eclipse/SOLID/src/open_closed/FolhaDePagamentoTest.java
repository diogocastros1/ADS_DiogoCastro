package open_closed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FolhaDePagamentoTest {

	@Test
	void testCalcular() {
		ContratoCLT contratoCLT = new ContratoCLT(1000.0);
		Estagio estagio = new Estagio(500.0);
		ContratoPJ contratoPJ = new ContratoPJ(2000.0);
		
		FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
		folhaDePagamento.calcular(contratoCLT);
		folhaDePagamento.calcular(estagio);
		folhaDePagamento.calcular(contratoPJ);
		
		Double valorEsperado = 3500.0;
		Double valorAtual = folhaDePagamento.getTotalFolha();
		assertEquals(valorEsperado, valorAtual);
		
	}

}
