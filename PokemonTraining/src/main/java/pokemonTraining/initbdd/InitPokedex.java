package pokemonTraining.initbdd;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import pokemonTraining.builder.PokemonBuilder;
import pokemonTraining.context.Singleton;
import pokemonTraining.model.ATTCAT;
import pokemonTraining.model.Attaque;
import pokemonTraining.model.Pokemon;
import pokemonTraining.model.TYP;

public class InitPokedex {
	
	public static void Init()
	{
		List<Attaque> allAttaques = new ArrayList();
		
		// CREATION DE CHAQUE ATTAQUE
		Attaque eclair = new Attaque("Eclair",TYP.electrique, 40, 100, 30, ATTCAT.special);		
			allAttaques.add(eclair);
		
		// AJOUTER TOUTES LES ATTAQUES
	    EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
	    em.getTransaction().begin();
		for (Attaque a : allAttaques) {
			em.persist(a);
		}
		em.getTransaction().commit();
	    em.close();
	    
	    // CREATION ET AJOUT DE CHAQUE POKEMON
		Pokemon pikachu = new PokemonBuilder(1,"Pikachu", TYP.electrique)
		        .stats(35,55,40,50,50,90)
		        .ev(0,0,0,0,0,2)
		        .images("pikachu_front.png", "pikachu_back.png")
		        .learn(1, eclair)
		        .build();
		
	}
	
	public static void main(String[] args) {
		Init();	
	}
}
