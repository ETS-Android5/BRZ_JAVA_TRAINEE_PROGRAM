package at.gv.brz.daos;

import java.util.List;

import at.gv.brz.entitaeten.Lieferant;


/**
 * @author roeslerz
 * 
 * Data Object Access interface f�r {@Lieferant}
 */
public interface LieferantDAO{
       
	public Lieferant findById(int id);	
	
	public List<Lieferant> findAll(); 
	
	public boolean insert(Lieferant lieferant);
	
	public boolean update(Lieferant lieferant);
	
	public boolean delete(Lieferant lieferant);


}
