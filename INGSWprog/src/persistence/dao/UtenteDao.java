package persistence.dao;

import java.util.List;
import model.Utente;

public interface UtenteDao {
	
	public void save(Utente utente);  // Create
	public Utente findByPrimaryKey(Long id);     // Retrieve
	public List<Utente> findAll();       
	public void update(Utente utente); //Update
	public void delete(Utente utente); //Delete	

}
