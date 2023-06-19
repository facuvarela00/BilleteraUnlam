package ar.edu.unlam.pb2;

public class NoCoincideTitularException extends Exception {
//	Cuando se intenta asociar un medio de pago a un consumidor y no coincide el 
//	nombre del titular del medio con el nombre del consumidor.
	
	public NoCoincideTitularException (String mensaje) {
		super(mensaje);
	}
	
}
