package contabilidade;

public class EmpresaMEI implements Tributavel {
	static final double TAXA_ISS_EMPRESA_MEI = 0.0;
	static final double TAXA_IR_EMPRESA_MEI = 0.275;
	Double faturamentoMensal;

	public EmpresaMEI(Double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}

	@Override
	public Double getValorIR() {
		return faturamentoMensal * TAXA_IR_EMPRESA_MEI;
	}

	@Override
	public Double getValorISS() {
		return TAXA_ISS_EMPRESA_MEI;
	}

}
