package pokemonTraining.player;

import java.util.List;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import pokemonTraining.model.Pokemon;
import pokemonTraining.model.Stats;

@Entity
public class PokemonPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    private Pokemon pokemon;

    private String nom;
    
    @Column(nullable = false)
    private Integer niveau;

    @Column(nullable = false)
    private Integer xp;

    @Column(nullable = false)
    private Integer xpNextLevel;

    @OneToOne
    private Stats iv;

    @OneToOne
    private Stats ev;

    @OneToOne
    private Stats statsActuels;

    @OneToMany(mappedBy = "pokemonPlayer")
    private List<PokemonPlayerAttaque> attaques;
    
    public PokemonPlayer() {}

    

	public PokemonPlayer(Integer id, Pokemon pokemon, String nom, Integer niveau, Integer xp, Integer xpNextLevel,
			Stats iv, Stats ev, Stats statsActuels, List<PokemonPlayerAttaque> attaques) {
		super();
		this.id = id;
		this.pokemon = pokemon;
		this.nom = nom;
		this.niveau = niveau;
		this.xp = xp;
		this.xpNextLevel = xpNextLevel;
		this.iv = iv;
		this.ev = ev;
		this.statsActuels = statsActuels;
		this.attaques = attaques;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	public Integer getNiveau() {
		return niveau;
	}

	public void setNiveau(Integer niveau) {
		this.niveau = niveau;
	}

	public Integer getXp() {
		return xp;
	}

	public void setXp(Integer xp) {
		this.xp = xp;
	}

	public Integer getXpNextLevel() {
		return xpNextLevel;
	}

	public void setXpNextLevel(Integer xpNextLevel) {
		this.xpNextLevel = xpNextLevel;
	}

	public Stats getIv() {
		return iv;
	}

	public void setIv(Stats iv) {
		this.iv = iv;
	}

	public Stats getEv() {
		return ev;
	}

	public void setEv(Stats ev) {
		this.ev = ev;
	}

	public Stats getStatsActuels() {
		return statsActuels;
	}

	public void setStatsActuels(Stats statsActuels) {
		this.statsActuels = statsActuels;
	}

	public List<PokemonPlayerAttaque> getAttaques() {
		return attaques;
	}

	public void setAttaques(List<PokemonPlayerAttaque> attaques) {
		this.attaques = attaques;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	@Override
	public String toString() {
		return "PokemonPlayer [id=" + id + ", pokemon=" + pokemon + ", nom=" + nom + ", niveau=" + niveau + ", xp=" + xp
				+ ", xpNextLevel=" + xpNextLevel + ", iv=" + iv + ", ev=" + ev + ", statsActuels=" + statsActuels + "]";
	}

	
    
    
}