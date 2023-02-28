package esporte;

public class Atleta extends Pessoa {
	Integer peso;
	Boolean aposentado;
	
	public Atleta(String nome, Integer idade, Integer peso, Boolean aposentado) {
		super(nome, idade);
		this.peso = peso;
		this.aposentado = aposentado;
	}
	
	void aquecer() {
		System.out.println("Atleta aquecido");
	}
	
	void aposentar() {
		this.aposentado = true;
	}
}
