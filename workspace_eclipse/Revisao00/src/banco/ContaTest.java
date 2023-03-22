package banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTest {
	@Test
	void testarContaConrrente (){
		Double saldoEsperado = 101.0;
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(100.00);
		contaCorrente.rentanbilizar();
		
		assertEquals(saldoEsperado, contaCorrente.saldo);
	}
	
	@Test
	void testarContaPoupanca () {
		Double saldoEsperado = 102.00;
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.depositar(100.0);
		contaPoupanca.rentanbilizar();
		
		assertEquals(saldoEsperado, contaPoupanca.saldo);
	}
	
	@Test
	void testPolimorfismo( ) {
		boolean flagContaCorrente = false;
		
		Conta conta = null;
		if(flagContaCorrente) {
			conta = new ContaCorrente();
		} else {
			conta = new ContaPoupanca();
		}
		
		conta.depositar(1000.00);
		
		conta.rentanbilizar();
		
		System.out.println(conta.getClass().getName());
		System.out.println(conta.saldo);
	}
	
	@Test
	void testConta_toString() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(100.00);
		cc.sacar(10.00);
		
		String str = cc.toString();
		
		System.out.println(str);
	}
}
