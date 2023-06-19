package ar.edu.unlam.pb2;

public class TarjetaDeDebito extends Tarjeta {
	
	private Double saldo;

	public TarjetaDeDebito(Long nUMERO_ESPERADO, String tITULAR_ESPERADO, String fECHA_DE_VENCIMIENTO_ESPERADO,
			Integer cODIGO_DE_SEGURIDAD_ESPERADO) throws NumeroDeTarjetaInvalidoException {
			super(nUMERO_ESPERADO,tITULAR_ESPERADO,fECHA_DE_VENCIMIENTO_ESPERADO,cODIGO_DE_SEGURIDAD_ESPERADO);
			this.saldo=0.0;
	}

	
	public Double getSaldo() {
		return saldo;
	}
	
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void pagar() {
		// TODO Auto-generated method stub
		
	}
	
	
	 
	
	
	
}
