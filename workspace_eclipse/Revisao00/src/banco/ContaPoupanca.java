package banco;

public class ContaPoupanca extends Conta{

	@Override
	void retanbilizar() {
		this.saldo *= 1.02;
	}

}
