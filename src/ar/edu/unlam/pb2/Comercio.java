package ar.edu.unlam.pb2;

import java.util.Objects;

public class Comercio {

	private Long cUIT_ESPERADO=0L;
	private String nOMBRE_ESPERADO="";
	
	public Comercio(Long cUIT_ESPERADO, String nOMBRE_ESPERADO) {
		this.cUIT_ESPERADO=cUIT_ESPERADO;
		this.nOMBRE_ESPERADO=nOMBRE_ESPERADO;
	}

	public Boolean CUITValido(Long cUIT_ESPERADO) throws CuitInvalidoException {
		String cuit=String.valueOf(cUIT_ESPERADO);
		if (cuit.length()==11 && cuit.charAt(0)=='3' && cuit.charAt(1)=='0'){
			return true;
		}
		else if(cuit.length()!=11 || cuit.charAt(0)!='3' || cuit.charAt(1)!='0'){
			setcUIT_ESPERADO(0L);
			throw new CuitInvalidoException("El numero de cuit " + cuit + " es invalido.");
			
		}
		return false;
	}
	
	public Long getcUIT_ESPERADO() {
		return cUIT_ESPERADO;
	}

	public void setcUIT_ESPERADO(Long cUIT_ESPERADO) {
		this.cUIT_ESPERADO = cUIT_ESPERADO;
	}

	public String getnOMBRE_ESPERADO() {
		return nOMBRE_ESPERADO;
	}

	public void setnOMBRE_ESPERADO(String nOMBRE_ESPERADO) {
		this.nOMBRE_ESPERADO = nOMBRE_ESPERADO;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cUIT_ESPERADO);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comercio other = (Comercio) obj;
		return Objects.equals(cUIT_ESPERADO, other.cUIT_ESPERADO);
	}

	
	
}
