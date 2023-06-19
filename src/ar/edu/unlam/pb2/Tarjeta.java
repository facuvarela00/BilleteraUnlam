package ar.edu.unlam.pb2;

import java.util.Objects;

//import static org.junit.Assert.assertTrue;

import ar.edu.unlam.pb2.NumeroDeTarjetaInvalidoException;

public abstract class Tarjeta implements Pagadora {
	private Long nUMERO_ESPERADO=0L;
	private String tITULAR_ESPERADO="";
	private String fECHA_DE_VENCIMIENTO_ESPERADO="";
	private Integer cODIGO_DE_SEGURIDAD_ESPERADO=0;
	
	public Tarjeta (Long nUMERO_ESPERADO, String tITULAR_ESPERADO, String fECHA_DE_VENCIMIENTO_ESPERADO,
	Integer cODIGO_DE_SEGURIDAD_ESPERADO) throws NumeroDeTarjetaInvalidoException {
		
		this.nUMERO_ESPERADO=nUMERO_ESPERADO;
		this.tITULAR_ESPERADO=tITULAR_ESPERADO;
		this.fECHA_DE_VENCIMIENTO_ESPERADO=fECHA_DE_VENCIMIENTO_ESPERADO;
		this.cODIGO_DE_SEGURIDAD_ESPERADO=cODIGO_DE_SEGURIDAD_ESPERADO;
		
		try {
			numeroValido(nUMERO_ESPERADO);
		} catch (NumeroDeTarjetaInvalidoException e) {
			throw new NumeroDeTarjetaInvalidoException(e.getMessage());
		}
	}

	
	public Boolean numeroValido(Long nUMERO_ESPERADO) throws NumeroDeTarjetaInvalidoException {
		
		Boolean a=false;
		Long xd=nUMERO_ESPERADO;
		String numero=String.valueOf(nUMERO_ESPERADO);
		if (numero.length()==16) {
			return true;
		}
		else if(numero.length()!=16){
			throw new NumeroDeTarjetaInvalidoException("El numero de tarjeta " + xd + " es invalido.");
			
		}
		return false;
	}

	
	public Long getnUMERO_ESPERADO() {
		return nUMERO_ESPERADO;
	}

	public void setnUMERO_ESPERADO(Long nUMERO_ESPERADO) {
		this.nUMERO_ESPERADO = nUMERO_ESPERADO;
	}

	public String gettITULAR_ESPERADO() {
		return tITULAR_ESPERADO;
	}

	public void settITULAR_ESPERADO(String tITULAR_ESPERADO) {
		this.tITULAR_ESPERADO = tITULAR_ESPERADO;
	}

	public String getfECHA_DE_VENCIMIENTO_ESPERADO() {
		return fECHA_DE_VENCIMIENTO_ESPERADO;
	}

	public void setfECHA_DE_VENCIMIENTO_ESPERADO(String fECHA_DE_VENCIMIENTO_ESPERADO) {
		this.fECHA_DE_VENCIMIENTO_ESPERADO = fECHA_DE_VENCIMIENTO_ESPERADO;
	}

	public Integer getcODIGO_DE_SEGURIDAD_ESPERADO() {
		return cODIGO_DE_SEGURIDAD_ESPERADO;
	}

	public void setcODIGO_DE_SEGURIDAD_ESPERADO(Integer cODIGO_DE_SEGURIDAD_ESPERADO) {
		this.cODIGO_DE_SEGURIDAD_ESPERADO = cODIGO_DE_SEGURIDAD_ESPERADO;
	}


	@Override
	public int hashCode() {
		return Objects.hash(nUMERO_ESPERADO);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarjeta other = (Tarjeta) obj;
		return Objects.equals(nUMERO_ESPERADO, other.nUMERO_ESPERADO);
	}
	
	
	
}
