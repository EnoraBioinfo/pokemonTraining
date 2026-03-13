package pokemonTraining.context;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Singleton {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("contextJPA");

	// private IDAOPokemon daoFiliere=new DAOPokemon();
	
	private static Singleton instance=null;
	
	
	private Singleton() {}
	
	public static Singleton getInstance() 
	{
		if(instance==null) {instance=new Singleton();}
		
		return instance;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}


	
	
	
	
	
}
