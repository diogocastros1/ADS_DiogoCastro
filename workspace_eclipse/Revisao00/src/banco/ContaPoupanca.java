package banco;

public class ContaPoupanca extends Conta{

	@Override
	void rentanbilizar() {
		this.saldo *= 1.02;
	}

}
