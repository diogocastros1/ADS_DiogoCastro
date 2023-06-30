package builder.carro;

public class CarroBuilder {
	private Carro carro;
	
	public CarroBuilder() {
		this.carro = new Carro();
	}
	
	public void buildPortas(Porta[] portas) {
		carro.setPortas(portas);
	}
	
	public void buildMotor(Motor motor) {
		carro.setMotor(motor);
	}
	
	public void buildComputadorBordo(ComputadorBordo cb) {
		carro.setComputadorBordo(cb);
	}
	
	public void buildFreioABS(FreioABS f) {
		carro.setFreioABS(f);
	}
	
	public Carro getCarro() {
		return carro;
	}
}
