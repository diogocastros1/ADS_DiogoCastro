package state.artigo;

public class EstadoRevisando implements Estado{
	private Artigo artigo;

	public EstadoRevisando(Artigo artigo) {
		this.artigo = artigo;
	}
	
	@Override
	public void publicar() {
		
	}
	
	@Override
	public void reprovar() {
		
	}

}
