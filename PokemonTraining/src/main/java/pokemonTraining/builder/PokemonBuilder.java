package pokemonTraining.builder;

import java.util.ArrayList;

import jakarta.persistence.EntityManager;
import pokemonTraining.context.Singleton;
import pokemonTraining.model.Attaque;
import pokemonTraining.model.Moveset;
import pokemonTraining.model.Pokemon;
import pokemonTraining.model.Stats;
import pokemonTraining.model.TYP;

public class PokemonBuilder {
    
	private Pokemon pokemon;

    public PokemonBuilder(Integer id, String nom, TYP type1) {
        this.pokemon = new Pokemon();
        this.pokemon.setId(id);
        this.pokemon.setPokemon(nom);
        this.pokemon.setType1(type1);
        this.pokemon.setMoveset(new ArrayList<>());
    }
    
    public PokemonBuilder types(TYP type1, TYP type2) {
        this.pokemon.setType1(type1);
        this.pokemon.setType2(type2);
        return this;
    }

    public PokemonBuilder stats(int hp, int att, int def, int attSpe, int defSpe, int speed) {
        Stats s = new Stats(hp, att, def, attSpe, defSpe, speed);
        this.pokemon.setBaseStats(s);
        return this;
    }

    public PokemonBuilder ev(int hp, int att, int def, int attSpe, int defSpe, int speed) {
        Stats s = new Stats(hp, att, def, attSpe, defSpe, speed);
        this.pokemon.setEv(s);
        return this;
    }

    public PokemonBuilder images(String front, String back) {
        this.pokemon.setImageFront(front);
        this.pokemon.setImageBack(back);
        return this;
    }

    public PokemonBuilder learn(int niveau, Attaque attaque) {
        Moveset m = new Moveset();
        m.setPokemon(this.pokemon);
        m.setAttaque(attaque);
        m.setLevel(niveau);

        this.pokemon.getMoveset().add(m);
        return this;
    }

    public PokemonBuilder evolution(Pokemon evolution, int niveau) {
        this.pokemon.setEvolution(evolution);
        return this;
    }

    public Pokemon build() {
    	EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
        em.getTransaction().begin();
        em.persist(this.pokemon);
        em.persist(this.pokemon.getBaseStats());
        em.persist(this.pokemon.getEv());
        for(Moveset m : this.pokemon.getMoveset()) {
            em.persist(m);
        }
        em.getTransaction().commit();
        em.close();
        return this.pokemon;
    }
}
