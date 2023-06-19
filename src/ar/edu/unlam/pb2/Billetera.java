package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Billetera {
	
	private String nombre="";
	private Set <Comercio> comercios;
	private Set <Consumidor> consumidores;
	private Map <Integer, HashSet<Object>> mediosDePago;


	public Billetera(String nombre) {
		this.nombre=nombre;
		comercios= new HashSet<Comercio>();
		consumidores = new HashSet<Consumidor>();
		mediosDePago = new TreeMap<Integer, HashSet<Object>>();
	}

	public void agregarComercio(Comercio comercio) throws CuitInvalidoException {

			if(comercio.CUITValido(comercio.getcUIT_ESPERADO())) {
				comercios.add(comercio);
			}

	}

	public Integer getCantidadDeComercios() {
		return comercios.size();
	}

	public void agregarConsumidor(Consumidor consumidor) {
			consumidores.add(consumidor);
	}

	public Object getCantidadDeConsumidores() {
		return consumidores.size();
	}


	
	public Map<Integer, HashSet<Object>> getMediosDePago() {
		return mediosDePago;
	}

	public void setMediosDePago(Map<Integer, HashSet<Object>> mediosDePago) {
		this.mediosDePago = mediosDePago;
	}

	public Consumidor buscarConsumidor(Integer dni) {
		Consumidor consumidorNuevo=null;
		
		for (Consumidor consumidor : consumidores) {
			if(consumidor.getdNI_ESPERADO().equals(dni)) {
				consumidorNuevo=consumidor;
			}	
		}
		
		return consumidorNuevo;
	}
	
	public Boolean queCoincidanTitulares(Consumidor consumidor, Object medioDePago) {
	
		String nombre=consumidor.getnOMBRE_ESPERADO();

		if (medioDePago instanceof Cuenta) {
			if(((Cuenta)medioDePago).gettITULAR_ESPERADO().equals(nombre)) {
				return true;
			}
		}else if (medioDePago instanceof Tarjeta) {
			if(((Tarjeta)medioDePago).gettITULAR_ESPERADO().equals(nombre)) { //ENTRA ACA
				return true;
			}
		}
		System.out.println(nombre);
		return false;	
	}
	
	public void agregarMedioDePago(Integer key, Object medioDePago) {

		Consumidor nuevo=buscarConsumidor(key); //DEVUELVE USUARIO

		Object mp=null;
				
		if(medioDePago instanceof CuentaVirtual) {
			mp=((CuentaVirtual)medioDePago);
		}
		else if(medioDePago instanceof CuentaBancaria){
			mp=((CuentaBancaria)medioDePago);
		}
		else if(medioDePago instanceof TarjetaDeCredito) {
			mp=((TarjetaDeCredito)medioDePago);
		}
		else if(medioDePago instanceof TarjetaDeDebito) {
			mp=((TarjetaDeDebito)medioDePago);
		}
		
		
		if(nuevo!=null&&queCoincidanTitulares(nuevo,mp)&&getMediosDePago().containsKey(key)==true) {
			mediosDePago.get(key).add(mp);
		}
		else if(nuevo!=null&&queCoincidanTitulares(nuevo,mp)&&getMediosDePago().containsKey(key)==false) {
			HashSet mediosDePagoLocales= new HashSet<Object>();
			mediosDePagoLocales.add(mp);
			mediosDePago.put(key, mediosDePagoLocales);
		}
		
	}
	
	public Integer getCantidadDeMediosDePago() {
		return mediosDePago.size();
	}

	public Integer getCantidadDeMediosDePago(Integer i) {
		if(mediosDePago.containsKey(i)) {
			return mediosDePago.get(i).size();	
			}
		
		return 0;
	}
	
	

}
