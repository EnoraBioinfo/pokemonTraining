package pokemonTraining.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="pokemon")
public class Pokemon {
	@Id
	private Integer id;
	@Column(unique = true, nullable = false)
	private String pokemon;
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TYP type1;
	@Enumerated(EnumType.STRING)
	@Column(nullable = true)
	private TYP type2;

	@OneToOne
	private Stats baseStats;
	@OneToOne
	private Stats ev;

	@Column(nullable = false)
	private String imageFront;
	@Column(nullable = false)
	private String imageBack;

	@OneToOne
	@JoinColumn(nullable = true)
	private Pokemon evolution;
	@OneToMany(mappedBy = "pokemon")
	private List<Moveset> moveset;
	
	public Pokemon() {}

	public Pokemon(Integer id, String pokemon, TYP type1, TYP type2, Stats baseStats, Stats ev, String imageFront,
			String imageBack, Pokemon evolution, List<Moveset> moveset) {
		this.id = id;
		this.pokemon = pokemon;
		this.type1 = type1;
		this.type2 = type2;
		this.baseStats = baseStats;
		this.ev = ev;
		this.imageFront = imageFront;
		this.imageBack = imageBack;
		this.evolution = evolution;
		this.moveset = moveset;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPokemon() {
		return pokemon;
	}

	public void setPokemon(String pokemon) {
		this.pokemon = pokemon;
	}

	public TYP getType1() {
		return type1;
	}

	public void setType1(TYP type1) {
		this.type1 = type1;
	}

	public TYP getType2() {
		return type2;
	}

	public void setType2(TYP type2) {
		this.type2 = type2;
	}

	public Stats getBaseStats() {
		return baseStats;
	}

	public void setBaseStats(Stats baseStats) {
		this.baseStats = baseStats;
	}

	public Stats getEv() {
		return ev;
	}

	public void setEv(Stats ev) {
		this.ev = ev;
	}

	public String getImageFront() {
		return imageFront;
	}

	public void setImageFront(String imageFront) {
		this.imageFront = imageFront;
	}

	public String getImageBack() {
		return imageBack;
	}

	public void setImageBack(String imageBack) {
		this.imageBack = imageBack;
	}

	public Pokemon getEvolution() {
		return evolution;
	}

	public void setEvolution(Pokemon evolution) {
		this.evolution = evolution;
	}

	public List<Moveset> getMoveset() {
		return moveset;
	}

	public void setMoveset(List<Moveset> moveset) {
		this.moveset = moveset;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", pokemon=" + pokemon + ", type1=" + type1 + ", type2=" + type2 + ", baseStats="
				+ baseStats + ", ev=" + ev + ", imageFront=" + imageFront + ", imageBack=" + imageBack + ", evolution="
				+ evolution + "]";
	}
	
	
}
