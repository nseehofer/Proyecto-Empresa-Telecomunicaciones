package ar.edu.unlam.pb2.teleComunicaciones;

public class ClienteTri extends Cliente  {

	

	public ClienteTri(Integer codigo, String nombre, String codigoDeArea, String telefono, String codigoDecodificador, String email,
			String claveWiFi) {
		super(codigo,nombre);
		this.codigoDeArea = codigoDeArea;
		this.telefono=telefono;
		this.codigoDecodificador=codigoDecodificador;
		this.email=email;
		this.claveWiFi= claveWiFi;
		
	}

	public String getCodigoDeArea() {
		return codigoDeArea;
	}
	
	@Override
	public String getCodigoDecodificador() {
		return codigoDecodificador;
	}

	public String getEmail() {
		return email;
	}

	public String getClaveWiFi() {
		return claveWiFi;
	}
	
	@Override
	public String getTelefono() {
		return telefono;
	}
	


	
	
	

}
