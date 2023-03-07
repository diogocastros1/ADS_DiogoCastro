package banco;

public class ContaCorrente extends Conta {

	@Override
	void retanbilizar() {
		this.saldo *= 1.01;
	}
	
}
