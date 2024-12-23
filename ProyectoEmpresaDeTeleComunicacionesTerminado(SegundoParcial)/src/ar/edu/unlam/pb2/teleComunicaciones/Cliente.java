package ar.edu.unlam.pb2.teleComunicaciones;

public abstract class Cliente implements Comparable <Cliente>{
	protected Integer codigo;
	protected String nombre;
	protected String codigoDeArea;
	protected String telefono;
	protected String codigoDecodificador;
	protected String email;
	protected String claveWiFi;

	public Cliente (Integer codigo, String nombre) {
		this.codigo=codigo;
		this.nombre=nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	protected abstract String getTelefono();
	
	protected abstract String getCodigoDecodificador();
	
	protected abstract String getEmail();
	
	@Override
	public int compareTo(Cliente clienteTelefonia) {
		return this.getTelefono().compareTo(clienteTelefonia.getTelefono());
	}
}

