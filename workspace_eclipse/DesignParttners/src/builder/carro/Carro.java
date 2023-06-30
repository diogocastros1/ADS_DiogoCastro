package builder.carro;

public class Carro {

	private Porta portas[];
	private Motor motor;
	private ComputadorBordo cb;
	private FreioABS f;
	public Porta[] getPortas() {
		return portas;
	}
	public void setPortas(Porta[] portas) {
		this.portas = portas;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public ComputadorBordo getCb() {
		return cb;
	}
	public void setComputadorBordo(ComputadorBordo cb) {
		this.cb = cb;
	}
	public FreioABS getF() {
		return f;
	}
	public void setFreioABS(FreioABS f) {
		this.f = f;
	}
	
	

}
