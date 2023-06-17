package ar.edu.unlam.pb2;

public abstract class Cuenta implements Transferible{

	private String eNTIDAD_ESPERADA="";
	private String tITULAR_ESPERADO="";
	
	public Cuenta(String eNTIDAD_ESPERADA, String tITULAR_ESPERADO) {
		this.eNTIDAD_ESPERADA=eNTIDAD_ESPERADA;
		this.tITULAR_ESPERADO=tITULAR_ESPERADO;
	}

	public String geteNTIDAD_ESPERADA() {
		return eNTIDAD_ESPERADA;
	}

	public void seteNTIDAD_ESPERADA(String eNTIDAD_ESPERADA) {
		this.eNTIDAD_ESPERADA = eNTIDAD_ESPERADA;
	}

	public String gettITULAR_ESPERADO() {
		return tITULAR_ESPERADO;
	}

	public void settITULAR_ESPERADO(String tITULAR_ESPERADO) {
		this.tITULAR_ESPERADO = tITULAR_ESPERADO;
	}
	
}
