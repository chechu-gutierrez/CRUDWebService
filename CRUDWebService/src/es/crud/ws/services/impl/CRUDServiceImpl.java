package es.crud.ws.services.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import es.crud.ws.model.Usuario;
import es.crud.ws.services.CRUDService;

@Path("/Usuario")
public class CRUDServiceImpl implements CRUDService {

	@Override
	@GET
	@Produces({MediaType.APPLICATION_XML})
	public Usuario get() {
		return new Usuario("12345678Z", "Nombre", "Apellido 1", "Apellido2");
	}

	@Override
	@POST
	@Consumes({MediaType.APPLICATION_XML})
	public void set(Usuario usu) {
		System.out.println(usu.getNif());
		System.out.println(usu.getNombre());
		System.out.println(usu.getApellidoUno());
		System.out.println(usu.getApellidoDos());	
		System.out.println("========================CREADO=========================");			
	}

	@Override
	@PUT
	@Consumes({MediaType.APPLICATION_XML})
	public void update(Usuario usu) {
		System.out.println(usu.getNif());
		System.out.println(usu.getNombre());
		System.out.println(usu.getApellidoUno());
		System.out.println(usu.getApellidoDos());	
		System.out.println("========================ACTUALIZADO=========================");	
		
	}

	@Override
	@DELETE
	@Path("/{id}")
	@Consumes({MediaType.APPLICATION_XML})
	public void delete(@PathParam("id") Integer id) {
		System.out.println(id);
		System.out.println("========================BORRADO=========================");	
		
	}


}
