package avancado;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	// para explicarmos o que queremos distinguir em uma classe quando utilizamos o Set 
	// neste caso estamos utilizando o id
	@Override 
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(id, other.id);
	}
	
}
