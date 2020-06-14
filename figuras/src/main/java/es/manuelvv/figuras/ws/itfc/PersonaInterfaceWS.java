package es.manuelvv.figuras.ws.itfc;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;

import es.manuelvv.figuras.model.Usuario;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface PersonaInterfaceWS {

	@WebMethod
	public Usuario logging(String alias, String password);
	
}