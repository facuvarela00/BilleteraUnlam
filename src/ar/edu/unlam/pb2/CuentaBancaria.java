package ar.edu.unlam.pb2;

import java.util.Objects;

public class CuentaBancaria extends Cuenta {

	private String cBU_ESPERADO="";
	
	public CuentaBancaria(String cBU_ESPERADO, String eNTIDAD_ESPERADA, String tITULAR_ESPERADO) throws NumeroDeCBUInvalidoException {
		super(eNTIDAD_ESPERADA,tITULAR_ESPERADO);
		
		this.cBU_ESPERADO=cBU_ESPERADO;
		
		try {
			CBUValido(cBU_ESPERADO);
		} catch (NumeroDeCBUInvalidoException e) {
			// TODO Auto-generated catch block
			throw new NumeroDeCBUInvalidoException (e.getMessage());
		}
		
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
			//setcBU_ESPERADO("");
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

	@Override
	public int hashCode() {
		return Objects.hash(cBU_ESPERADO);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		return Objects.equals(cBU_ESPERADO, other.cBU_ESPERADO);
	}

	
}
