package avancado;

import java.util.ArrayList;
import java.util.Collection;

public class SobreCollection_2 {

	public static void main(String[] args) {
//		1
		Collection<String> engenhariasAtuais = new ArrayList<String>();

		engenhariasAtuais.add("Telecomunicações");
		engenhariasAtuais.add("Biomédica");
		engenhariasAtuais.add("Computação");
		engenhariasAtuais.add("Software");
		engenhariasAtuais.add("Produção");

		System.out.println("Engenharias atuais: " + engenhariasAtuais);

//		2
		Collection<String> engenhariasFuturas = new ArrayList<String>();

		engenhariasFuturas.add("Mecatrônica");
		engenhariasFuturas.add("Mecânica");

		System.out.println("Engenharias Futuras: " + engenhariasFuturas);

//		3
		Collection<String> todas = new ArrayList<String>();

		todas.addAll(engenhariasAtuais);
		todas.addAll(engenhariasFuturas);

		System.out.println("Todas Engenharias" + todas);

		System.out.println("");
		System.out.println(">> Entendendo isEmpty() e size()");

//		construtor sobrecarregado que recebe outra coleção
		Collection<String> engenharias = new ArrayList<>(todas);

		System.out.println("Engenharias vazias? " + engenharias.isEmpty());
		System.out.println("Qtos elementos engenharias tem? " + engenharias.size());
		
		System.out.println("");
		System.out.println(">> Entendendo clear():");
		
		imprimirStatusdaColecao(engenharias);
		
		System.out.println("....Invocando clear()");
		engenharias.clear();
		
		imprimirStatusdaColecao(engenharias);
	
	}

	private static void imprimirStatusdaColecao(Collection<String> engenharias) {
		if (engenharias.isEmpty()) {
			System.out.println("Vazio");
		} else {
			System.out.println("Tem elementos");
		}
	}

}
