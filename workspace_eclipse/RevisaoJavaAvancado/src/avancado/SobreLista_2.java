package avancado;

import java.util.ArrayList;
import java.util.List;

public class SobreLista_2 {

	public static void main(String[] args) {
		List<Animal> listaAnimais = new ArrayList<>();

		listaAnimais.add(new Animal(1L, "Tartaruga"));
		listaAnimais.add(new Animal(1L, "Coelho"));
		listaAnimais.add(new Animal(1L, "Cachorro"));
		listaAnimais.add(new Animal(1L, "Gato"));
		listaAnimais.add(new Animal(1L, "Girafa"));
		listaAnimais.add(new Animal(1L, "Gato"));
		
		System.out.println(listaAnimais);
	}
	
	
}
