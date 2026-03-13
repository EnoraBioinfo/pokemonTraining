package pokemonTraining.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="attaque")
public class Attaque {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    @Column(nullable = false)
	private String nom;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TYP typ;

	private int puissance;
	private int precis;
	@Column(nullable = false)
	private int pp;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private ATTCAT attcat;
	
	/*
	@OneToMany(mappedBy = "attaque")
	private List<Moveset> moveset;
	*/
	
	public Attaque() {}

	public Attaque(Integer id, String nom, TYP typ, int puissance, int precis, int pp, ATTCAT attcat) {
		this.id = id;
		this.nom = nom;
		this.typ = typ;
		this.puissance = puissance;
		this.precis = precis;
		this.pp = pp;
		this.attcat = attcat;
	}
	
	public Attaque(String nom, TYP typ, int puissance, int precis, int pp, ATTCAT attcat) {
		this.nom = nom;
		this.typ = typ;
		this.puissance = puissance;
		this.precis = precis;
		this.pp = pp;
		this.attcat = attcat;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public TYP gettyp() {
		return typ;
	}

	public void settyp(TYP typ) {
		this.typ = typ;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public int getprecis() {
		return precis;
	}

	public void setprecis(int precis) {
		this.precis = precis;
	}

	public int getPp() {
		return pp;
	}

	public void setPp(int pp) {
		this.pp = pp;
	}

	public ATTCAT getAttcat() {
		return attcat;
	}

	public void setAttcat(ATTCAT attcat) {
		this.attcat = attcat;
	}

	@Override
	public String toString() {
		return "Attaque [id=" + id + ", nom=" + nom + ", typ=" + typ + ", puissance=" + puissance + ", precis="
				+ precis + ", pp=" + pp + ", attcat=" + attcat + "]";
	}
	
	
}
