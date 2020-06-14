package es.manuelvv.figuras.ws;

import javax.jws.WebService;

import es.manuelvv.figuras.model.Usuario;
import es.manuelvv.figuras.ws.itfc.PersonaInterfaceWS;

@WebService(endpointInterface="es.manuelvv.figuras.ws.itfc.PersonaInterfaceWS")
public class PersonaImplWS implements PersonaInterfaceWS{

	@Override
	public Usuario logging(String alias, String password) {
		return new Usuario().logging(alias, password);
	}

}
