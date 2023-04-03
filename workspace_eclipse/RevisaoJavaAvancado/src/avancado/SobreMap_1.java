package avancado;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SobreMap_1 {

	public static void main(String[] args) {
		
		Animal a1 = new Animal(1L, "Tartaruga");
		Animal a2 = new Animal(2L, "Coelho");
		Animal a3 = new Animal(3L, "Cachorro");
		Animal a4 = new Animal(4L, "Gato");
		Animal a5 = new Animal(5L, "Girafa");
		
		Map<String, Animal> mapaAnimais = new HashMap<>();
		
		mapaAnimais.put("TAR", a1);
		mapaAnimais.put("COE", a2);
		mapaAnimais.put("CAC", a3);
		mapaAnimais.put("GAT", a4);
		mapaAnimais.put("GIT", a5);
		
		System.out.println(mapaAnimais);
		
		//expressão lambda
		mapaAnimais.forEach((k, v) -> System.out.println(k + ": " + v));
		
		// pegando somente as chaves
		Set<String> setDasChaves = mapaAnimais.keySet();
		System.out.println(setDasChaves);

		Collection<Animal> valores = mapaAnimais.values();
		System.out.println(valores);
		
		Set<Entry<String, Animal>> entrySet = mapaAnimais.entrySet();
		for(Entry<String, Animal> entry: entrySet) {
			System.out.println("Chave: "+entry.getKey());
			System.out.println("Valor: "+entry.getValue());
		}
		
	}
	
}
