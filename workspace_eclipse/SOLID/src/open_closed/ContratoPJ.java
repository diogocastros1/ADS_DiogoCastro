package open_closed;

public class ContratoPJ implements Remuneravel {

	private Double valorMensal;

	public ContratoPJ(Double i) {
		super();
		this.valorMensal = i;
	}

	public Double getValorMensal() {
		return valorMensal;
	}

	@Override
	public Double getRemuneracao() {

		return this.getValorMensal();
	};

}
