package ar.edu.unlam.pb2;

public class CuentaBancaria extends Cuenta {

	private String cBU_ESPERADO="";
	
	public CuentaBancaria(String cBU_ESPERADO, String eNTIDAD_ESPERADA, String tITULAR_ESPERADO) {
		super(eNTIDAD_ESPERADA,tITULAR_ESPERADO);
		this.cBU_ESPERADO=cBU_ESPERADO;
	}

	@Override
	public void transferir() {
		// TODO Auto-generated method stub
		
	}
	
	public Boolean CBUValido(String cBU_ESPERADO) throws NumeroDeCBUInvalidoException {
		
		String xd=cBU_ESPERADO;
		if (cBU_ESPERADO.length()==20){
			return true;
		}
		else if(cBU_ESPERADO.length()!=20){
			setcBU_ESPERADO("");
			throw new NumeroDeCBUInvalidoException("El numero de CBU " + xd + " es invalido.");
			
		}
		return false;
	}
	
	public String getcBU_ESPERADO() {
		return cBU_ESPERADO;
	}

	public void setcBU_ESPERADO(String cBU_ESPERADO) {
		this.cBU_ESPERADO = cBU_ESPERADO;
	}

}
