package open_closed;

public class Estagio implements Remuneravel{

	private Double bolsaAuxilio;

	public Estagio(Double bolsaAuxilio) {
		super();
		this.bolsaAuxilio = bolsaAuxilio;
	}

	public Double getBolsaAuxilio() {
		return bolsaAuxilio;
	}

	@Override
	public Double getRemuneracao() {

		return this.getBolsaAuxilio();
	}
	
	
}
