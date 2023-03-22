package banco;

public class ContaCorrente extends Conta {

	@Override
	void rentanbilizar() {
		this.saldo *= 1.01;
	}
	
}
