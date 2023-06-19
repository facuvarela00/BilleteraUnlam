package ar.edu.unlam.pb2;

import java.util.Objects;

public class CuentaVirtual extends Cuenta {

	private String CVU_ESPERADO="";
	
	public CuentaVirtual(String CVU_ESPERADO, String eNTIDAD_ESPERADA, String tITULAR_ESPERADO) /*throws CVUInvalidoException*/{
		super(eNTIDAD_ESPERADA, tITULAR_ESPERADO);
		this.CVU_ESPERADO=CVU_ESPERADO;
		/*try {
			CVUValido(CVU_ESPERADO);
		}catch(CVUInvalidoException a){
			System.out.println(a.getMessage());
		}*/
		
	}
	

	@Override
	public void transferir() {
		// TODO Auto-generated method stub

	}
	
	public Boolean CVUValido(String CVU_ESPERADO) throws CVUInvalidoException {
		
		String xd=CVU_ESPERADO;
		if (CVU_ESPERADO.length()==23){
			return true;
		}
		else if(CVU_ESPERADO.length()!=23){
			setCVU_ESPERADO("");
			throw new CVUInvalidoException("El numero de CVU " + xd + " es invalido.");
			
		}
		return false;
	}

	public String getCVU_ESPERADO() {
		return CVU_ESPERADO;
	}

	public void setCVU_ESPERADO(String cVU_ESPERADO) {
		CVU_ESPERADO = cVU_ESPERADO;
	}


	@Override
	public int hashCode() {
		return Objects.hash(CVU_ESPERADO);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaVirtual other = (CuentaVirtual) obj;
		return Objects.equals(CVU_ESPERADO, other.CVU_ESPERADO);
	}
	
	

}
