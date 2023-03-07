package contabilidade;

public class EmpresaSimples implements Tributavel{
	static final Double TAXA_ISS_EMPRESA_SIMPLES = 0.08;
	static final Double TAXA_IR_EMPRESA_SIMPLES = 0.15;
	Double faturamentoMensal;

	public EmpresaSimples(Double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}

	@Override
	public Double getValorIR() {
		return faturamentoMensal * TAXA_IR_EMPRESA_SIMPLES;
	}

	@Override
	public Double getValorISS() {
		return faturamentoMensal * TAXA_ISS_EMPRESA_SIMPLES;
	}
	
}
