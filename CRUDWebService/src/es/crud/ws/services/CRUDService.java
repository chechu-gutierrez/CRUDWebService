package es.crud.ws.services;

import javax.ws.rs.PathParam;

import es.crud.ws.model.Usuario;

public interface CRUDService {

	public Usuario get();
	
	public void set(Usuario usu);
	
	public void update(Usuario usu);
	
	public void delete(@PathParam("id") Integer id);
	
}
