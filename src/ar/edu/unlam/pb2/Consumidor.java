package ar.edu.unlam.pb2;

import java.util.Objects;

public class Consumidor {

	private Integer dNI_ESPERADO=0;
	private String nOMBRE_ESPERADO="";
	
	public Consumidor(Integer dNI_ESPERADO, String nOMBRE_ESPERADO) {
		this.dNI_ESPERADO=dNI_ESPERADO;
		this.nOMBRE_ESPERADO=nOMBRE_ESPERADO;
	}

	public Integer getdNI_ESPERADO() {
		return dNI_ESPERADO;
	}

	public void setdNI_ESPERADO(Integer dNI_ESPERADO) {
		this.dNI_ESPERADO = dNI_ESPERADO;
	}

	public String getnOMBRE_ESPERADO() {
		return nOMBRE_ESPERADO;
	}

	public void setnOMBRE_ESPERADO(String nOMBRE_ESPERADO) {
		this.nOMBRE_ESPERADO = nOMBRE_ESPERADO;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dNI_ESPERADO);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consumidor other = (Consumidor) obj;
		return Objects.equals(dNI_ESPERADO, other.dNI_ESPERADO);
	}

	
	
}
