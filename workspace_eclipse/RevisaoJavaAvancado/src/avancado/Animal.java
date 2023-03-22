package avancado;

// o Comparable utiliza a logica do Desgin Partners Strategy, portanto
// ao implementarmos o Comparable, estaos utilizando o Design Partners
public class Animal implements Comparable<Animal> {

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

	@Override
	public int compareTo(Animal that) {
		return this.nome.compareTo(that.nome);
	}

}
