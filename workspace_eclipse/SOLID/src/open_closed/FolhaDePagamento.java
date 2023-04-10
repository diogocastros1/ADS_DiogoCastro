package open_closed;

public class FolhaDePagamento {

	Double totalFolha = 0.0;

//	public void calcular(Object obj) {
//		if(obj instanceof ContratoCLT) {
//			ContratoCLT contratoCLT = (ContratoCLT) obj;
//			totalFolha += contratoCLT.getSalario();
//		} else if (obj instanceof Estagio) {
//			Estagio estagio = (Estagio) obj;
//			totalFolha += estagio.getBolsaAuxilio();
//		}
//	}

	public void calcular(Remuneravel r) {
		this.totalFolha += r.getRemuneracao();
	}

	public Double getTotalFolha() {
		return totalFolha;
	}

}
