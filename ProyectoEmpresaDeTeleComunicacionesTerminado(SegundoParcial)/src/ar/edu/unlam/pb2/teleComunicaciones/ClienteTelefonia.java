package ar.edu.unlam.pb2.teleComunicaciones;

public class ClienteTelefonia extends Cliente  {


	public ClienteTelefonia(Integer codigo , String nombre, String codigoDeArea, String nroTelefono) {
		super (codigo,nombre);
		this.codigoDeArea = codigoDeArea;
		this.telefono = nroTelefono;
	}

	public String getCodigoDeArea() {
		return codigoDeArea;
	}
	
	@Override
	public String getTelefono() {
		return telefono;
	}

	@Override
	protected String getCodigoDecodificador() {
		return null;
	}

	@Override
	protected String getEmail() {
		return null;
	}

	


	
	
}
