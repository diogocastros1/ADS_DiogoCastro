package banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTest {
	@Test
	void testarContaConrrente (){
		Double saldoEsperado = 101.0;
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(100.00);
		contaCorrente.retanbilizar();
		
		assertEquals(saldoEsperado, contaCorrente.saldo);
	}
	
	@Test
	void testarContaPoupanca () {
		Double saldoEsperado = 102.00;
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.depositar(100.0);
		contaPoupanca.retanbilizar();
		
		assertEquals(saldoEsperado, contaPoupanca.saldo);
		
				
	}
}
