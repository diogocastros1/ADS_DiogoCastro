package esporte;

public class Pessoa extends Object{
	String nome;
	Integer idade;

	public Pessoa(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	void envelhecer() {
		this.idade++;
	}
}

/* 
 * Alguns atalhos:
 * CRTL+3 - acessa as listas de comandos, onde colocando as iniciais 
 * de cada comando ja acessamos o mesmo, por exemplo GCUF chamamos o construtor 
 */
