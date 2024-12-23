package ar.edu.unlam.pb2.teleComunicaciones;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpresaTeleComunicacionesTest {

	@Test
	public void queSePuedaCrearUnClienteDeTelefonia() {
		ClienteTelefonia nuevo = new ClienteTelefonia(1000, "Camila", "11", "63598237");

		assertEquals(nuevo.getCodigoDeArea(), "11");
		assertEquals(nuevo.getTelefono(), "63598237");
	}

	
	@Test
	public void queSePuedaCrearUnClienteDeCable() {
		ClienteCable nuevo = new ClienteCable(1000, "Camila", "46546546504637");
		
		assertEquals(nuevo.getCodigoDecodificador(), "46546546504637");
		
	}
	
	
	@Test
	public void  queSePuedaCrearUnClienteDeBandaAncha() {
		ClienteBandaAncha nuevo = new ClienteBandaAncha(1000, "Camila", "camila@telecomunications.com", "meGustaLaVecina");

		
		assertEquals(nuevo.getEmail(), "camila@telecomunications.com");
    assertEquals(nuevo.getClaveWiFi(), "meGustaLaVecina");
	}
	
	@Test
	public void  queSePuedaCrearUnClienteTri() {
		ClienteTri nuevo = new ClienteTri(1000, "Camila", "11", "63598237", "46546546504637", "camila@telecomunications.com", "meGustaLaVecina");
		
		assertEquals(nuevo.getCodigoDeArea(), "11");
		assertEquals(nuevo.getCodigoDecodificador(), "46546546504637");
		assertEquals(nuevo.getEmail(), "camila@telecomunications.com");
    assertEquals(nuevo.getClaveWiFi(), "meGustaLaVecina");
		
	}
	
	
	@Test
	public void  queSePuedanIncorporarDistintosClientes() {		
		Empresa actual = new Empresa("Telecomunications");
		
		actual.agregarCliente(new ClienteTelefonia(1000, "Camila", "11", "63544437"));
		actual.agregarCliente(new ClienteTelefonia(1001, "Natalia", "11", "7777237"));
		actual.agregarCliente(new ClienteCable(1002, "Jorge", "46546546777788"));
		actual.agregarCliente(new ClienteTelefonia(1003, "Lucrecia", "23", "63888837"));
		actual.agregarCliente(new ClienteTri(1004, "Tamara", "11", "63598967", "46540099804637", "tamara@telecomunications.com", "meGustaLaVecina"));
		actual.agregarCliente(new ClienteTelefonia(1005, "Alberto", "11", "63598887"));
		actual.agregarCliente(new ClienteTelefonia(1006, "Domingo", "11", "6300007"));
		actual.agregarCliente(new ClienteBandaAncha(1007, "Luciana", "luciana@telecomunications.com", "queMiras?"));
		actual.agregarCliente(new ClienteBandaAncha(1008, "Luna", "luna@telecomunications.com", "poneteInternetRata"));
		actual.agregarCliente(new ClienteTri(1009, "Victor", "11", "63588887", "46543333324637", "victor@telecomunications.com", "noTeCuelguesGil"));
		actual.agregarCliente(new ClienteTelefonia(1010, "Tamara", "11", "63598967"));
		
		assertEquals((Integer) 11, actual.getCantidadAbonados());		
	}
	
	@Test
	public void  queUnClienteDeCablePuedaHabilitarElCodificado() throws NoEsClienteConCableException{		
		Cliente celeste = new ClienteCable(999, "Celeste", "4666666777788");
		Empresa actual = new Empresa("Telecomunications");
		
		actual.agregarCliente(new ClienteTelefonia(1000, "Camila", "11", "63544437"));
		actual.agregarCliente(new ClienteTelefonia(1001, "Natalia", "11", "7777237"));
		actual.agregarCliente(new ClienteCable(1002, "Jorge", "46546546777788"));
		actual.agregarCliente(new ClienteTelefonia(1003, "Lucrecia", "23", "63888837"));
		actual.agregarCliente(new ClienteTri(1004, "Tamara", "11", "63598967", "46540099804637", "tamara@telecomunications.com","laClave"));
		actual.agregarCliente(new ClienteTelefonia(1005, "Alberto", "11", "63598887"));
		actual.agregarCliente(new ClienteTelefonia(1006, "Domingo", "11", "6300007"));
		actual.agregarCliente(new ClienteBandaAncha(1007, "Luciana", "luciana@telecomunications.com","laClaveEsta"));
		actual.agregarCliente(new ClienteBandaAncha(1008, "Luna", "luna@telecomunications.com","laClaveAca"));
		actual.agregarCliente(new ClienteTri(1009, "Victor", "11", "63588887", "46543333324637", "victor@telecomunications.com","laClaveSeRealizo"));
		actual.agregarCliente(new ClienteTelefonia(1004, "Tamara", "11", "63598967"));
		
		assertTrue(actual.habilitarPremium(Premium.FUTBOL, celeste));		
	}
	
	@Test (expected = NoEsClienteConCableException.class)
	public void  queUnClienteDeTelefoniaNoPuedaHabilitarElCodificado () throws NoEsClienteConCableException{		
		Cliente celeste = new ClienteTelefonia(1000, "Camila", "11", "63544437");
		Empresa actual = new Empresa("Telecomunications");
		
		assertFalse(actual.habilitarPremium(Premium.FUTBOL, celeste));		
	}


  @Test 
	public void obtenerListadoDeClientesDeTelefoniaOrdenadosPorNumeroDeTelefono (){
	  Empresa actual = new Empresa("Telecomunications");
		
		actual.agregarCliente(new ClienteTelefonia(1000, "Camila", "11", "63544437"));
		actual.agregarCliente(new ClienteTelefonia(1001, "Natalia", "11", "7777237"));
		actual.agregarCliente(new ClienteTelefonia(1003, "Lucrecia", "23", "63888837"));
		actual.agregarCliente(new ClienteTelefonia(1005, "Alberto", "11", "63598887"));
		actual.agregarCliente(new ClienteTelefonia(1006, "Domingo", "11", "6300007"));
		actual.agregarCliente(new ClienteTelefonia(1004, "Tamara", "11", "63598967"));
		actual.agregarCliente(new ClienteTri(1008, "Tamara", "11", "63598967", "46540099804637", "tamara@telecomunications.com", "meGustaLaVecina"));
		actual.agregarCliente(new ClienteTri(1009, "Victor", "11", "63588887", "46543333324637", "victor@telecomunications.com", "noTeCuelguesGil"));
	
		
		actual.listarLosClientesDeTelefoniaOrdenadosPorNumeroDeTelefono();
  }
  
  @Test 
	public void  obtenerListadoDeclientesDeTelevisionOrdenadosPorNumeroDeDecodificador (){
	  Empresa actual = new Empresa("Telecomunications");
		
		actual.agregarCliente(new ClienteTelefonia(1000, "Camila", "11", "63544437"));
		actual.agregarCliente(new ClienteTelefonia(1001, "Natalia", "11", "7777237"));
		actual.agregarCliente(new ClienteCable(1002, "Jorge", "46546546777788"));
		actual.agregarCliente(new ClienteTelefonia(1003, "Lucrecia", "23", "63888837"));
		actual.agregarCliente(new ClienteTri(1004, "Tamara", "11", "63598967", "46540099804637", "tamara@telecomunications.com", "meGustaLaVecina"));
		actual.agregarCliente(new ClienteTelefonia(1005, "Alberto", "11", "63598887"));
		actual.agregarCliente(new ClienteTelefonia(1006, "Domingo", "11", "6300007"));
		actual.agregarCliente(new ClienteBandaAncha(1007, "Luciana", "luciana@telecomunications.com", "queMiras?"));
		actual.agregarCliente(new ClienteBandaAncha(1008, "Luna", "luna@telecomunications.com", "poneteInternetRata"));
		actual.agregarCliente(new ClienteTri(1009, "Victor", "11", "63588887", "46543333324637", "victor@telecomunications.com", "noTeCuelguesGil"));
		actual.agregarCliente(new ClienteTelefonia(1010, "Tamara", "11", "63598967"));
		
		actual.listarLosClientesDeTelevisionOrdenadosPorNumeroDeDecodificador();
	  
  }

  @Test 
	public void  obtenerListadoDeClientesDeBandaAnchaOrdenadosPorEmail (){
	  Empresa actual = new Empresa("Telecomunications");
		
		actual.agregarCliente(new ClienteTelefonia(1000, "Camila", "11", "63544437"));
		actual.agregarCliente(new ClienteTelefonia(1001, "Natalia", "11", "7777237"));
		actual.agregarCliente(new ClienteCable(1002, "Jorge", "46546546777788"));
		actual.agregarCliente(new ClienteTelefonia(1003, "Lucrecia", "23", "63888837"));
		actual.agregarCliente(new ClienteTri(1004, "Tamara", "11", "63598967", "46540099804637", "tamara@telecomunications.com", "meGustaLaVecina"));
		actual.agregarCliente(new ClienteTelefonia(1005, "Alberto", "11", "63598887"));
		actual.agregarCliente(new ClienteTelefonia(1006, "Domingo", "11", "6300007"));
		actual.agregarCliente(new ClienteBandaAncha(1007, "Luciana", "luciana@telecomunications.com", "queMiras?"));
		actual.agregarCliente(new ClienteBandaAncha(1008, "Luna", "luna@telecomunications.com", "poneteInternetRata"));
		actual.agregarCliente(new ClienteTri(1009, "Victor", "11", "63588887", "46543333324637", "victor@telecomunications.com", "noTeCuelguesGil"));
		actual.agregarCliente(new ClienteTelefonia(1010, "Tamara", "11", "63598967"));
		
		actual.listarLosClientesDeBandaAnchaOrdenadosPorEmail();
  }


}