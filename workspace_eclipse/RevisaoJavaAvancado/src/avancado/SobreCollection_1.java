package avancado;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class SobreCollection_1 {

	
	public static void main(String[] args) {
		
		Collection<String> colecao = buildCollectionImplemetation();
		colecao.add("Gato");
		colecao.add("Cachorro");
		colecao.add("Leão");
		colecao.add("Pantera");
		colecao.add("Avestruz");
		
		System.out.println(colecao); 
		
//		[Inserção]
//		for (String c : colecao) {
//			System.out.println(c); 
//		}
		
	}

//	O HashSet retorna a collection de forma aleatorio [Aleatório] 
//	private static Collection<String> buildCollectionImplemetation() {
//		return new HashSet<String>();
//	}
	
//	Já o TreeSet ordena em ordem alfabetica [Natural]
	private static Collection<String> buildCollectionImplemetation() {
		return new TreeSet<String>();
	}
	
}
