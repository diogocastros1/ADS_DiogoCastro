package strategy.ferte;

public class ServicoFreteFedex implements Fretavel {

	@Override
	public double calcularValor(String servico, double pesoEmKg) {

		if (pesoEmKg < 20.0) {
			return 0.00;
		} else if(pesoEmKg <= 39.9) {
			return 45.00;
		} else {
			return 75.00;
		}

	}
}
