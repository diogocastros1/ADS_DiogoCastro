package avancado;

public class Animal {

	private Long id;
	private String nome;
	
	public Animal(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

//	Polimorfismo
	@Override
	public String toString() {
		return "Animal [id=" + id + ", nome=" + nome + "]";
	}
	
}
