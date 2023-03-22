package avancado;

import java.util.Iterator;

public class SobreArrays {

	public static void main(String[] args) {
		Animal[] arrayDeAnimais = new Animal[4];
		
		arrayDeAnimais[0] = new Animal(1L,"Tartaruga");
		arrayDeAnimais[1] = new Animal(2L,"Coelho");
		arrayDeAnimais[2] = new Animal(3L,"Cachorro");
		arrayDeAnimais[3] = new Animal(4L,"Gato");
		
		System.out.println("Array de Animais");
//		for (int i = 0; i< arrayDeAnimais.length; i++) {
//			System.out.println(arrayDeAnimais[i].getNome());
//		}
		
		for (Animal animal : arrayDeAnimais) {
			System.out.println(animal.getNome());
		}
		 
	}
}
