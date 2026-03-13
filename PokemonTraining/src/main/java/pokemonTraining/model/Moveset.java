package pokemonTraining.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="moveset")
public class Moveset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    private Pokemon pokemon;

    @ManyToOne(optional = false)
    private Attaque attaque;
    
    @Column(nullable = false)
    private Integer level;
    
    public Moveset() {}

	public Moveset(Integer id, Pokemon pokemon, Attaque attaque, Integer level) {
		this.id = id;
		this.pokemon = pokemon;
		this.attaque = attaque;
		this.level = level;
	}
	
	public Moveset(Pokemon pokemon, Attaque attaque, Integer level) {
		this.pokemon = pokemon;
		this.attaque = attaque;
		this.level = level;
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

	public Attaque getAttaque() {
		return attaque;
	}

	public void setAttaque(Attaque attaque) {
		this.attaque = attaque;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Moveset [id=" + id + ", pokemon=" + pokemon + ", attaque=" + attaque + ", level=" + level + "]";
	}
    
    
}
