package pokemonTraining.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import pokemonTraining.model.Attaque;

@Entity
public class PokemonPlayerAttaque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    private PokemonPlayer pokemonPlayer;

    @ManyToOne(optional = false)
    private Attaque attaque;

    @Column(nullable = false)
    private int slot;

    @Column(nullable = false)
    private int ppActuel;
    
    public PokemonPlayerAttaque() {}

	public PokemonPlayerAttaque(Integer id, PokemonPlayer pokemonPlayer, Attaque attaque, int slot, int ppActuel) {
		super();
		this.id = id;
		this.pokemonPlayer = pokemonPlayer;
		this.attaque = attaque;
		this.slot = slot;
		this.ppActuel = ppActuel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PokemonPlayer getPokemonPlayer() {
		return pokemonPlayer;
	}

	public void setPokemonPlayer(PokemonPlayer pokemonPlayer) {
		this.pokemonPlayer = pokemonPlayer;
	}

	public Attaque getAttaque() {
		return attaque;
	}

	public void setAttaque(Attaque attaque) {
		this.attaque = attaque;
	}

	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

	public int getPpActuel() {
		return ppActuel;
	}

	public void setPpActuel(int ppActuel) {
		this.ppActuel = ppActuel;
	}

	@Override
	public String toString() {
		return "PokemonPlayerAttaque [id=" + id + ", pokemonPlayer=" + pokemonPlayer + ", attaque=" + attaque
				+ ", slot=" + slot + ", ppActuel=" + ppActuel + "]";
	}
    
    
}

