package banco;

public abstract class Conta {
	Double saldo = 0.0;
	
	void depositar(Double valor) {
		this.saldo += valor;
	}
	
	void sacar(Double valor) {
		this.saldo -= valor;
	}
	
	abstract void retanbilizar();

}
