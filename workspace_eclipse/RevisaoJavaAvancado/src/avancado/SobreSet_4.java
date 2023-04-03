package avancado;

import java.util.HashSet;
import java.util.Set;

public class SobreSet_4 {

	public static void main(String[] args) {
		Set<Animal> setDeAnimal = new HashSet<>();
		setDeAnimal.add(new Animal(1L, "Tartaruga")); //utilizamos o L no final do id para referenciar o Long
		setDeAnimal.add(new Animal(2L, "Coelho"));
		setDeAnimal.add(new Animal(3L, "Cachorro"));
		setDeAnimal.add(new Animal(4L, "Gato"));
		setDeAnimal.add(new Animal(2L, "Coelho"));
		
		setDeAnimal.forEach(System.out::println);
	}

}
