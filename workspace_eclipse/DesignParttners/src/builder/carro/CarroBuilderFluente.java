package builder.carro;

public class CarroBuilderFluente {
	
	private Carro carro;
	
	public CarroBuilderFluente() {
		this.carro = new Carro();
	}
	
	public CarroBuilderFluente buildPortas(Porta[] portas) {
		carro.setPortas(portas);
		return this;
	}
	
	public CarroBuilderFluente buildMotor(Motor motor) {
		carro.setMotor(motor);
		return this;
	}
	
	public CarroBuilderFluente buildComputadorBordo(ComputadorBordo cb) {
		carro.setComputadorBordo(cb);
		return this;
	}
	
	public CarroBuilderFluente buildFreioABS(FreioABS f) {
		carro.setFreioABS(f);
		return this;
	}
	
	public Carro getCarro() {
		return carro;
	}


	
}
