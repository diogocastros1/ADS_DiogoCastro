package strategy.ferte;

public class ServicoFreteJadlog implements Fretavel{
	
	@Override
	public double calcularValor(String servico, double pesoEmKg) {

		if (pesoEmKg < 30.0) {
			return 0.00;
		} else {
			return 150.00;
		}

	}
}
