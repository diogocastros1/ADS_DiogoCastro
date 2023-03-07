package esporte;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AtletaTest {

	@Test
	void testarConstrutor() {
		
		Pessoa pessoa = new Pessoa("Edson", 40);
		
		System.out.println(pessoa.nome);
		System.out.println(pessoa.idade);
		
		Atleta atletaEdson = new Atleta("Edson", 40, 90, false);
		
		System.out.println(atletaEdson.nome);
		System.out.println(atletaEdson.idade);
		System.out.println(atletaEdson.peso);
		System.out.println(atletaEdson.aposentado);
	}
	
	@Test
	void testarNadador() {
		Nadador nadador = new Nadador("Gustavo", 30, 90, false);
		nadador.nadar();
		
		assertEquals(nadador.idade, 30);
		nadador.envelhecer();
		assertEquals(nadador.idade, 31);
		
		System.out.println(nadador.idade);
		
		nadador.aposentar();
		System.out.println(nadador.aposentado);
		
	}
	
	@Test
	void testarCiclista() {
		Ciclista ciclista = new Ciclista("Tiago", 44, 85, false);
		assertFalse(ciclista.aposentado); // se for falso retorna ok
		
		System.out.println("Está Aposentado?");
		if(ciclista.aposentado) {
			System.out.println("Sim");
		}else {
			System.out.println("Não");
		}
		
		ciclista.pedalar();
		
		ciclista.envelhecer();

		assertEquals(ciclista.idade, 45);
		
		ciclista.aposentar();
		System.out.println("Agora já está aposentado?");
		System.out.println(ciclista.aposentado ? "Sim" : "Não");
		assertTrue(ciclista.aposentado);
	}
}






