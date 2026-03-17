package pokemonTraining.dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import pokemonTraining.context.Singleton;
import pokemonTraining.model.Stats;

public class DAOStats implements IDAOStats{

	@Override
	public Stats findById(Integer id) {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
		Stats stats = em.find(Stats.class, id); 
		em.close();
		return stats;
	}

	@Override
	public List<Stats> findAll() {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
		List<Stats> statss = em.createQuery("from Stats").getResultList();
		em.close();
		return statss;
	}

	@Override
	public Stats save(Stats stats) {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
		em.getTransaction().begin();
			stats=em.merge(stats);
		em.getTransaction().commit();
		em.close();
		return stats;
	}

	@Override
	public void deleteById(Integer id) {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
		Stats stats = em.find(Stats.class, id);
		em.getTransaction().begin();
			em.remove(stats);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public void delete(Stats stats) {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
	
		em.getTransaction().begin();
			stats=em.merge(stats);
			em.remove(stats);
		em.getTransaction().commit();
		em.close();
	}
}
