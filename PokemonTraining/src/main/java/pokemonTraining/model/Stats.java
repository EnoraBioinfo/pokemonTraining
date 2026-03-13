package pokemonTraining.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stats {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private int hp;
	private int att;
	private int def;
	private int attspe;
	private int defspe;
	private int speed;
	
	public Stats() {}
	
	
	
	public Stats(Integer id, int hp, int att, int def, int attspe, int defspe, int speed) {
		super();
		this.id = id;
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.attspe = attspe;
		this.defspe = defspe;
		this.speed = speed;
	}



	public Stats(int hp, int att, int def, int attspe, int defspe, int speed) {
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.attspe = attspe;
		this.defspe = defspe;
		this.speed = speed;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtt() {
		return att;
	}

	public void setAtt(int att) {
		this.att = att;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getAttspe() {
		return attspe;
	}

	public void setAttspe(int attspe) {
		this.attspe = attspe;
	}

	public int getDefspe() {
		return defspe;
	}

	public void setDefspe(int defspe) {
		this.defspe = defspe;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Stats [id=" + id + ", hp=" + hp + ", att=" + att + ", def=" + def + ", attspe=" + attspe + ", defspe="
				+ defspe + ", speed=" + speed + "]";
	}

	
	
}
