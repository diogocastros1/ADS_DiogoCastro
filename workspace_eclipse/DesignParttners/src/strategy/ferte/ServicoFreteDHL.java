package strategy.ferte;

public class ServicoFreteDHL implements Fretavel {
	@Override
	public double calcularValor(String servico, double pesoEmKg) {

		if (pesoEmKg < 10.0) {
			return 50.00;
		} else if (pesoEmKg < 20){
			return 70.00;
		} else {
			return 90.00;
		}

	}
}
