package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Billetera {
	
	private String nombre="";
	private Set <Comercio> comercios;
	private Set <Consumidor> consumidores;
	private Map <Integer, Object> mediosDePago;

	public Billetera(String nombre) {
		this.nombre=nombre;
		comercios= new HashSet<Comercio>();
		consumidores = new HashSet<Consumidor>();
		mediosDePago = new TreeMap<Integer, Object>();
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

	public void agregarMedioDePago(int key, Tarjeta tarjeta) {

		if(tarjeta instanceof TarjetaDeCredito) {
			mediosDePago.put(key, ((TarjetaDeCredito)tarjeta));
		}else if(tarjeta instanceof TarjetaDeDebito) {
			mediosDePago.put(key, ((TarjetaDeDebito)tarjeta));
		}
		
	}

	public void agregarMedioDePago(int key, Cuenta cuenta) {

		if(cuenta instanceof CuentaVirtual) {
			mediosDePago.put(key, ((CuentaVirtual)cuenta));
		}else if(cuenta instanceof CuentaBancaria){
			mediosDePago.put(key, ((CuentaBancaria)cuenta));
		}
		
	}
	
	public void agregarMedioDePago1(Integer key, Object a) {
		Consumidor nuevo = null;
		if(a instanceof CuentaVirtual) {
			mediosDePago.put(key, ((CuentaVirtual)a));
		}else if(a instanceof CuentaBancaria){
			mediosDePago.put(key, ((CuentaBancaria)a));
		}else if(a instanceof TarjetaDeCredito) {
			mediosDePago.put(key, ((TarjetaDeCredito)a));
		}else if(a instanceof TarjetaDeDebito) {
			mediosDePago.put(key, ((TarjetaDeDebito)a));
		}
		
	}
	
	public Integer getCantidadDeMediosDePago() {
		return mediosDePago.size();
	}

	public Integer getCantidadDeMediosDePago(Integer i) {
		Integer a=0;
		for (Map.Entry<Integer, Object> entry : mediosDePago.entrySet()) {
			if(entry.getKey()==i) {
				a++;
			}
		}
		return a;
	}

}
