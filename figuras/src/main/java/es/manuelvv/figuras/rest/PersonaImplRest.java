package es.manuelvv.figuras.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import es.manuelvv.figuras.model.Usuario;

@Path("/logging")
public class PersonaImplRest {

	@GET
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Response logging(@QueryParam("alias") String alias, @QueryParam("password") String password) {
		
		Usuario usu;
		try {
			 usu = new Usuario().logging(alias, password);
		}catch (Exception ex){
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
		
		return Response.status(201).entity(usu).build();

	}
}
