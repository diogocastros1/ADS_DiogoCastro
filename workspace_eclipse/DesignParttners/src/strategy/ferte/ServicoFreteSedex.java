package strategy.ferte;

public class ServicoFreteSedex implements Fretavel {

	@Override
	public double calcularValor(String servico, double pesoEmKg) {

		if (pesoEmKg < 20.0) {
			return 100.00;
		} else {
			return 120.00;
		}

	}
}
