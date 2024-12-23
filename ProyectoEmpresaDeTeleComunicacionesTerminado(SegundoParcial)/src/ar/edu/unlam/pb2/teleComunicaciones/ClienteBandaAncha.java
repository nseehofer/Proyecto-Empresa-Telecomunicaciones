package ar.edu.unlam.pb2.teleComunicaciones;

public class ClienteBandaAncha extends Cliente {

	public ClienteBandaAncha(Integer codigo, String nombre, String email, String claveWiFI) {
		super (codigo,nombre);
		this.email=email;
		this.claveWiFi= claveWiFI;
	}

	public String getEmail() {
		return email;
	}

	public String getClaveWiFi() {
		return claveWiFi;
	}

	@Override
	protected String getTelefono() {
		return null;
	}

	@Override
	protected String getCodigoDecodificador() {
		return null;
	}

	

	

	
	
}
