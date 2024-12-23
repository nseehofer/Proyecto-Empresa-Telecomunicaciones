package ar.edu.unlam.pb2.teleComunicaciones;

public class ClienteCable extends Cliente {


	public ClienteCable(Integer codigo, String nombre, String codigoDecodificador) {
		super (codigo,nombre);
		this.codigoDecodificador = codigoDecodificador;
	}
	
	@Override
	public String getCodigoDecodificador() {
		return codigoDecodificador;
	}

	@Override
	protected String getTelefono() {
		return null;
	}

	@Override
	protected String getEmail() {
		return null;
	}

	

	

	
	
}
