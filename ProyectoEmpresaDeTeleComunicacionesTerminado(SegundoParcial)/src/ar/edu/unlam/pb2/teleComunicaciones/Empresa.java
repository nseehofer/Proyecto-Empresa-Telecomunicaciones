package ar.edu.unlam.pb2.teleComunicaciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Empresa {

	private String nombre;
	private Set<Cliente> clientes=new HashSet<Cliente>();

	public Empresa(String nombre) {
		this.nombre=nombre;
	}

	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public Integer getCantidadAbonados() {
		
		return this.clientes.size();
	}

	public Boolean habilitarPremium(Premium pack, Cliente cliente) throws NoEsClienteConCableException {
		if (cliente.getClass().getSimpleName().equals("ClienteCable")) {
			return true;
		} else {
			throw new NoEsClienteConCableException("El cliente ingresado no contrato servicio de cable");
			
		} 
		
	}

	public void listarLosClientesDeTelefoniaOrdenadosPorNumeroDeTelefono() {
		List <Cliente> clientesTelefoniaOrdenados = new ArrayList<Cliente>();
		Iterator <Cliente> iteradorDeClientes = this.clientes.iterator();
		while(iteradorDeClientes.hasNext()) {
			Cliente clienteAEvaluar = iteradorDeClientes.next();
			if(clienteAEvaluar.getTelefono() != null) {
				clientesTelefoniaOrdenados.add(clienteAEvaluar);
			}
		}
		Collections.sort(clientesTelefoniaOrdenados);
	}

	public void listarLosClientesDeTelevisionOrdenadosPorNumeroDeDecodificador() {
		List <Cliente> clientesTelevisionOrdenados = new ArrayList<Cliente>();
		Iterator <Cliente> iteradorDeClientes = this.clientes.iterator();
		while(iteradorDeClientes.hasNext()) {
			Cliente clienteAEvaluar = iteradorDeClientes.next();
			if(clienteAEvaluar.getCodigoDecodificador() != null) {
				clientesTelevisionOrdenados.add(clienteAEvaluar);
			}
		}
		
		// ANTES DEBO PLANTEAR BIEN COMO TOMAR LOS DATOS, PORQUE HACE LOS METODOS ABSTRACTOS Y SOBREESCRIBIRLOS EN TODAS LA CLASES 
		// NO PARECE UNA BUENA PRACTICA
		//APRENDI A CREAR UN NUEVO COMPARADOR 
		// "new Comparator <tipoDeDato>() {
		// AQUI YA ES INTUITIVO};
		
		Collections.sort(clientesTelevisionOrdenados, new Comparator <Cliente>() {

			@Override
			public int compare(Cliente clienteConTelevision, Cliente clienteConTelevision2) {

				return clienteConTelevision.getCodigoDecodificador().compareTo(clienteConTelevision2.getCodigoDecodificador());
			}
			
		});
		clientesTelevisionOrdenados.toString();
	}

	public void listarLosClientesDeBandaAnchaOrdenadosPorEmail() {
		List <Cliente> clientesBandaAnchaOrdenados = new ArrayList<Cliente>();
		Iterator <Cliente> iteradorDeClientes = this.clientes.iterator();
		while(iteradorDeClientes.hasNext()) {
			Cliente clienteAEvaluar = iteradorDeClientes.next();
			if(clienteAEvaluar.getEmail() != null) {
				clientesBandaAnchaOrdenados.add(clienteAEvaluar);
			}
		}
		
		// ANTES DEBO PLANTEAR BIEN COMO TOMAR LOS DATOS, PORQUE HACE LOS METODOS ABSTRACTOS Y SOBREESCRIBIRLOS EN TODAS LA CLASES 
		// NO PARECE UNA BUENA PRACTICA
		//APRENDI A CREAR UN NUEVO COMPARADOR 
		// "new Comparator <tipoDeDato>() {
		// AQUI YA ES INTUITIVO};
		
		Collections.sort(clientesBandaAnchaOrdenados, new Comparator <Cliente>() {

			@Override
			public int compare(Cliente clienteConBandaAncha, Cliente clienteConBandaAncha2) {

				return clienteConBandaAncha.getEmail().compareTo(clienteConBandaAncha2.getEmail());
			}
			
		});
		clientesBandaAnchaOrdenados.toString();
		
	}

}
