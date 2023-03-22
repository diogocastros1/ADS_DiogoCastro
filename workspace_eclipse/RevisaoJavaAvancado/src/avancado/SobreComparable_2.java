package avancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SobreComparable_2 {

	public static void main(String[] args) {
		
		List<Animal> listaAnimais = new ArrayList<>();
		
		listaAnimais.add(new Animal(1L, "Tartaruga"));
		listaAnimais.add(new Animal(2L, "Coelho"));
		listaAnimais.add(new Animal(3L, "Cachorro"));
		listaAnimais.add(new Animal(4L, "Gato"));
		listaAnimais.add(new Animal(5L, "Girafa"));
		listaAnimais.add(new Animal(6L, "Gato"));

		System.out.println("> Pela ordem de inserção");
		System.out.println(listaAnimais);
		
		System.out.println("> Pela ordem alfabética do nome animal:");
		Collections.sort(listaAnimais);
		System.out.println(listaAnimais);
	
	}

}
