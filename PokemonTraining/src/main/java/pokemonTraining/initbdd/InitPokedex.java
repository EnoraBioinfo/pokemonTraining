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
			
		// ---- ELECTRIQUE ----
		Attaque eclair = new Attaque("Eclair", TYP.electrique, 40, 100, 30, ATTCAT.special);
		allAttaques.add(eclair);
		Attaque tonnerre = new Attaque("Tonnerre", TYP.electrique, 90, 100, 15, ATTCAT.special);
		allAttaques.add(tonnerre);
		Attaque laser_glace_elec = new Attaque("Cage-Eclair", TYP.electrique, 0, 100, 20, ATTCAT.status);
		allAttaques.add(laser_glace_elec);
		Attaque fatal_foudre = new Attaque("Fatal-Foudre", TYP.electrique, 120, 70, 10, ATTCAT.special);
		allAttaques.add(fatal_foudre);
		Attaque ball_elec = new Attaque("Electacle", TYP.electrique, 0, 100, 20, ATTCAT.status);
		allAttaques.add(ball_elec);
		Attaque onde_choc = new Attaque("Onde de Choc", TYP.electrique, 60, 0, 20, ATTCAT.special);
		allAttaques.add(onde_choc);
		Attaque tonnerre_grele = new Attaque("Tonnerre-Grêle", TYP.electrique, 65, 100, 10, ATTCAT.special);
		allAttaques.add(tonnerre_grele);
		Attaque poing_eclair = new Attaque("Poing-Eclair", TYP.electrique, 75, 100, 15, ATTCAT.physical);
		allAttaques.add(poing_eclair);
		Attaque charge = new Attaque("Charge", TYP.electrique, 0, 0, 20, ATTCAT.status);
		allAttaques.add(charge);

		// ---- FEU ----
		Attaque flammèche = new Attaque("Flammèche", TYP.feu, 40, 100, 25, ATTCAT.special);
		allAttaques.add(flammèche);
		Attaque lance_flamme = new Attaque("Lance-Flamme", TYP.feu, 90, 100, 15, ATTCAT.special);
		allAttaques.add(lance_flamme);
		Attaque deflagration = new Attaque("Déflagration", TYP.feu, 110, 85, 5, ATTCAT.special);
		allAttaques.add(deflagration);
		Attaque danse_flamme = new Attaque("Danse-Flamme", TYP.feu, 35, 85, 15, ATTCAT.special);
		allAttaques.add(danse_flamme);
		Attaque roue_feu = new Attaque("Roue de Feu", TYP.feu, 60, 100, 25, ATTCAT.physical);
		allAttaques.add(roue_feu);
		Attaque abrasion = new Attaque("Abrasion", TYP.feu, 80, 100, 15, ATTCAT.special);
		allAttaques.add(abrasion);
		Attaque poing_feu = new Attaque("Poing de Feu", TYP.feu, 75, 100, 15, ATTCAT.physical);
		allAttaques.add(poing_feu);
		Attaque cremation = new Attaque("Crémation", TYP.feu, 120, 85, 5, ATTCAT.special);
		allAttaques.add(cremation);
		Attaque eruption = new Attaque("Éruption", TYP.feu, 150, 100, 5, ATTCAT.special);
		allAttaques.add(eruption);

		// ---- EAU ----
		Attaque pistolet_eau = new Attaque("Pistolet à O", TYP.eau, 40, 100, 25, ATTCAT.special);
		allAttaques.add(pistolet_eau);
		Attaque surf = new Attaque("Surf", TYP.eau, 90, 100, 15, ATTCAT.special);
		allAttaques.add(surf);
		Attaque hydrocanon = new Attaque("Hydrocanon", TYP.eau, 110, 80, 5, ATTCAT.special);
		allAttaques.add(hydrocanon);
		Attaque cascabrelo = new Attaque("Cascade", TYP.eau, 80, 100, 15, ATTCAT.physical);
		allAttaques.add(cascabrelo);
		Attaque bulles_eau = new Attaque("Bulles d'O", TYP.eau, 65, 100, 20, ATTCAT.special);
		allAttaques.add(bulles_eau);
		Attaque aqua_queue = new Attaque("Aqua-Queue", TYP.eau, 90, 90, 10, ATTCAT.physical);
		allAttaques.add(aqua_queue);
		Attaque aqua_jet = new Attaque("Aqua-Jet", TYP.eau, 40, 100, 20, ATTCAT.physical);
		allAttaques.add(aqua_jet);
		Attaque pluie = new Attaque("Danse-Pluie", TYP.eau, 0, 0, 5, ATTCAT.status);
		allAttaques.add(pluie);
		Attaque blizzard_eau = new Attaque("Blizzard d'O", TYP.eau, 80, 100, 10, ATTCAT.special);
		allAttaques.add(blizzard_eau);

		// ---- PLANTE ----
		Attaque tranch_herbe = new Attaque("Tranche-Herbe", TYP.plante, 55, 95, 25, ATTCAT.physical);
		allAttaques.add(tranch_herbe);
		Attaque lance_soleil = new Attaque("Lance-Soleil", TYP.plante, 120, 100, 10, ATTCAT.special);
		allAttaques.add(lance_soleil);
		Attaque fouet_liane = new Attaque("Fouet Lianes", TYP.plante, 45, 100, 25, ATTCAT.physical);
		allAttaques.add(fouet_liane);
		Attaque tranch_feuille = new Attaque("Lame-Feuille", TYP.plante, 90, 90, 15, ATTCAT.physical);
		allAttaques.add(tranch_feuille);
		Attaque poudre_toxik = new Attaque("Poudre Toxik", TYP.plante, 0, 75, 35, ATTCAT.status);
		allAttaques.add(poudre_toxik);
		Attaque poudre_dodo = new Attaque("Poudre Dodo", TYP.plante, 0, 75, 15, ATTCAT.status);
		allAttaques.add(poudre_dodo);
		Attaque croissance = new Attaque("Croissance", TYP.plante, 0, 0, 40, ATTCAT.status);
		allAttaques.add(croissance);
		Attaque ball_graine = new Attaque("Ball-Graine", TYP.plante, 0, 90, 10, ATTCAT.status);
		allAttaques.add(ball_graine);
		Attaque rayon_soleil = new Attaque("Rayon-Soleil", TYP.plante, 60, 100, 15, ATTCAT.special);
		allAttaques.add(rayon_soleil);
		Attaque synthesis = new Attaque("Synthèse", TYP.plante, 0, 0, 5, ATTCAT.status);
		allAttaques.add(synthesis);

		// ---- PSY ----
		Attaque choc_mental = new Attaque("Choc Mental", TYP.psy, 50, 100, 25, ATTCAT.special);
		allAttaques.add(choc_mental);
		Attaque psyko = new Attaque("Psyko", TYP.psy, 90, 100, 10, ATTCAT.special);
		allAttaques.add(psyko);
		Attaque psykoud = new Attaque("Psykoud'Boul", TYP.psy, 80, 90, 15, ATTCAT.special);
		allAttaques.add(psykoud);
		Attaque psy_vague = new Attaque("Psy-Vague", TYP.psy, 65, 100, 20, ATTCAT.special);
		allAttaques.add(psy_vague);
		Attaque amnesie = new Attaque("Amnésie", TYP.psy, 0, 0, 20, ATTCAT.status);
		allAttaques.add(amnesie);
		Attaque barrierelight = new Attaque("Mur Lumière", TYP.psy, 0, 0, 30, ATTCAT.status);
		allAttaques.add(barrierelight);
		Attaque reflexion = new Attaque("Réflexion", TYP.psy, 0, 0, 20, ATTCAT.status);
		allAttaques.add(reflexion);
		Attaque teleport = new Attaque("Téléport", TYP.psy, 0, 0, 20, ATTCAT.status);
		allAttaques.add(teleport);
		Attaque laser_psy = new Attaque("Laser Psy", TYP.psy, 100, 100, 5, ATTCAT.special);
		allAttaques.add(laser_psy);
		Attaque soin = new Attaque("Soin", TYP.psy, 0, 0, 10, ATTCAT.status);
		allAttaques.add(soin);
		Attaque barriere = new Attaque("Barrière", TYP.psy, 0, 0, 30, ATTCAT.status);
		allAttaques.add(barriere);
		Attaque aura_psy = new Attaque("Aura Psy", TYP.psy, 70, 100, 20, ATTCAT.special);
		allAttaques.add(aura_psy);
		Attaque confusion = new Attaque("Confusion", TYP.psy, 50, 100, 25, ATTCAT.special);
		allAttaques.add(confusion);
		Attaque boost_psy = new Attaque("Boost Psy", TYP.psy, 0, 0, 10, ATTCAT.status);
		allAttaques.add(boost_psy);

		// ---- NORMAL ----
		Attaque tackle = new Attaque("Charge", TYP.normal, 40, 100, 35, ATTCAT.physical);
		allAttaques.add(tackle);
		Attaque griffe = new Attaque("Griffe", TYP.normal, 40, 100, 35, ATTCAT.physical);
		allAttaques.add(griffe);
		Attaque tranche = new Attaque("Tranche", TYP.normal, 70, 100, 20, ATTCAT.physical);
		allAttaques.add(tranche);
		Attaque hyper_beam = new Attaque("Ultralaser", TYP.normal, 150, 90, 5, ATTCAT.special);
		allAttaques.add(hyper_beam);
		Attaque coup_rapide = new Attaque("Coup Rapide", TYP.normal, 40, 100, 30, ATTCAT.physical);
		allAttaques.add(coup_rapide);
		Attaque jackpot = new Attaque("Jackpot", TYP.normal, 0, 100, 20, ATTCAT.status);
		allAttaques.add(jackpot);
		Attaque damocles = new Attaque("Damoclès", TYP.normal, 0, 30, 5, ATTCAT.physical);
		allAttaques.add(damocles);
		Attaque berceuse = new Attaque("Berceuse", TYP.normal, 0, 55, 15, ATTCAT.status);
		allAttaques.add(berceuse);
		Attaque rugissement = new Attaque("Rugissement", TYP.normal, 0, 100, 40, ATTCAT.status);
		allAttaques.add(rugissement);
		Attaque double_equipe = new Attaque("Double-Équipe", TYP.normal, 0, 0, 15, ATTCAT.status);
		allAttaques.add(double_equipe);

		// ---- SOL ----
		Attaque seisme = new Attaque("Séisme", TYP.sol, 100, 100, 10, ATTCAT.physical);
		allAttaques.add(seisme);
		Attaque tremblement = new Attaque("Tremblement", TYP.sol, 60, 100, 20, ATTCAT.physical);
		allAttaques.add(tremblement);
		Attaque tomberoche = new Attaque("Tombe-Roche", TYP.sol, 60, 95, 15, ATTCAT.physical);
		allAttaques.add(tomberoche);
		Attaque fissure = new Attaque("Fissure", TYP.sol, 0, 30, 5, ATTCAT.physical);
		allAttaques.add(fissure);
		Attaque jet_sable = new Attaque("Jet de Sable", TYP.sol, 0, 100, 15, ATTCAT.status);
		allAttaques.add(jet_sable);
		Attaque tempete_sable = new Attaque("Tempête de Sable", TYP.sol, 0, 0, 10, ATTCAT.status);
		allAttaques.add(tempete_sable);
		Attaque excavation = new Attaque("Excavation", TYP.sol, 80, 100, 10, ATTCAT.physical);
		allAttaques.add(excavation);

		// ---- COMBAT ----
		Attaque poing_karate = new Attaque("Poing-Karaté", TYP.combat, 50, 100, 25, ATTCAT.physical);
		allAttaques.add(poing_karate);
		Attaque pied_pied = new Attaque("Pied-Sauté", TYP.combat, 70, 100, 20, ATTCAT.physical);
		allAttaques.add(pied_pied);
		Attaque close_combat = new Attaque("Close Combat", TYP.combat, 120, 100, 5, ATTCAT.physical);
		allAttaques.add(close_combat);
		Attaque seisme_poing = new Attaque("Mach Punch", TYP.combat, 40, 100, 30, ATTCAT.physical);
		allAttaques.add(seisme_poing);
		Attaque coup_bas = new Attaque("Coup-Bas", TYP.combat, 60, 100, 20, ATTCAT.physical);
		allAttaques.add(coup_bas);
		Attaque contre = new Attaque("Contre", TYP.combat, 0, 100, 20, ATTCAT.physical);
		allAttaques.add(contre);
		Attaque souplesse = new Attaque("Souplesse", TYP.combat, 80, 75, 20, ATTCAT.physical);
		allAttaques.add(souplesse);

		// ---- VOL ----
		Attaque tornade = new Attaque("Tornade", TYP.vol, 40, 100, 35, ATTCAT.special);
		allAttaques.add(tornade);
		Attaque aeropique = new Attaque("Aéropique", TYP.vol, 60, 100, 20, ATTCAT.physical);
		allAttaques.add(aeropique);
		Attaque tranche_air = new Attaque("Tranche-Air", TYP.vol, 75, 95, 15, ATTCAT.special);
		allAttaques.add(tranche_air);
		Attaque ouragan = new Attaque("Ouragan", TYP.vol, 110, 70, 10, ATTCAT.special);
		allAttaques.add(ouragan);
		Attaque danse_plume = new Attaque("Danse-Plume", TYP.vol, 0, 100, 15, ATTCAT.status);
		allAttaques.add(danse_plume);
		Attaque vol = new Attaque("Vol", TYP.vol, 90, 95, 15, ATTCAT.physical);
		allAttaques.add(vol);

		// ---- INSECTE ----
		Attaque piqure = new Attaque("Piqûre", TYP.insect, 30, 100, 30, ATTCAT.physical);
		allAttaques.add(piqure);
		Attaque dard_venin = new Attaque("Dard-Venin", TYP.insect, 15, 100, 35, ATTCAT.physical);
		allAttaques.add(dard_venin);
		Attaque coupe_vent = new Attaque("Coupe-Vent", TYP.insect, 60, 100, 25, ATTCAT.physical);
		allAttaques.add(coupe_vent);
		Attaque signal_beam = new Attaque("Signal Beam", TYP.insect, 75, 100, 15, ATTCAT.special);
		allAttaques.add(signal_beam);
		Attaque megacorne = new Attaque("Mégacorne", TYP.insect, 120, 85, 10, ATTCAT.physical);
		allAttaques.add(megacorne);
		Attaque tourbillon = new Attaque("Tourbillon", TYP.insect, 0, 100, 20, ATTCAT.status);
		allAttaques.add(tourbillon);

		// ---- GLACE ----
		Attaque glaçon = new Attaque("Glaçon", TYP.glace, 40, 100, 30, ATTCAT.special);
		allAttaques.add(glaçon);
		Attaque laser_glace = new Attaque("Laser Glace", TYP.glace, 90, 100, 10, ATTCAT.special);
		allAttaques.add(laser_glace);
		Attaque blizzard = new Attaque("Blizzard", TYP.glace, 110, 70, 5, ATTCAT.special);
		allAttaques.add(blizzard);
		Attaque poing_glace = new Attaque("Poing-Glace", TYP.glace, 75, 100, 15, ATTCAT.physical);
		allAttaques.add(poing_glace);
		Attaque grele = new Attaque("Grêle", TYP.glace, 0, 0, 10, ATTCAT.status);
		allAttaques.add(grele);
		Attaque avalanche = new Attaque("Avalanche", TYP.glace, 60, 100, 10, ATTCAT.physical);
		allAttaques.add(avalanche);

		// ---- TENEBRE ----
		Attaque tranche_nuit = new Attaque("Tranche-Nuit", TYP.tenebre, 70, 100, 15, ATTCAT.physical);
		allAttaques.add(tranche_nuit);
		Attaque croc_fatal = new Attaque("Croc Fatal", TYP.tenebre, 80, 100, 15, ATTCAT.physical);
		allAttaques.add(croc_fatal);
		Attaque jackpot_noir = new Attaque("Ball-Ombre", TYP.tenebre, 80, 100, 15, ATTCAT.special);
		allAttaques.add(jackpot_noir);
		Attaque rondombres = new Attaque("Ronde des Ombres", TYP.tenebre, 40, 100, 15, ATTCAT.physical);
		allAttaques.add(rondombres);
		Attaque nuit_noire = new Attaque("Nuit Noire", TYP.tenebre, 0, 100, 15, ATTCAT.status);
		allAttaques.add(nuit_noire);
		Attaque machination = new Attaque("Machination", TYP.tenebre, 0, 0, 20, ATTCAT.status);
		allAttaques.add(machination);

		// ---- SPECTRE ----
		Attaque ball_ombre = new Attaque("Boule Ombre", TYP.spectre, 80, 100, 15, ATTCAT.special);
		allAttaques.add(ball_ombre);
		Attaque griffe_ombre = new Attaque("Griffe Ombre", TYP.spectre, 70, 100, 15, ATTCAT.physical);
		allAttaques.add(griffe_ombre);
		Attaque frayeur = new Attaque("Frayeur", TYP.spectre, 0, 100, 10, ATTCAT.status);
		allAttaques.add(frayeur);
		Attaque malediction = new Attaque("Malédiction", TYP.spectre, 0, 0, 10, ATTCAT.status);
		allAttaques.add(malediction);
		Attaque leche_cadavre = new Attaque("Lèche-Cadavre", TYP.spectre, 65, 100, 10, ATTCAT.physical);
		allAttaques.add(leche_cadavre);
		Attaque envoi = new Attaque("Envoi", TYP.spectre, 0, 100, 5, ATTCAT.status);
		allAttaques.add(envoi);

		// ---- DRAGON ----
		Attaque draco_meteor = new Attaque("Draco-Météore", TYP.dragon, 130, 90, 5, ATTCAT.special);
		allAttaques.add(draco_meteor);
		Attaque dracogriffe = new Attaque("Dracogriffe", TYP.dragon, 80, 100, 15, ATTCAT.physical);
		allAttaques.add(dracogriffe);
		Attaque dragonnade = new Attaque("Dragonnade", TYP.dragon, 60, 100, 20, ATTCAT.physical);
		allAttaques.add(dragonnade);
		Attaque souffle_dragon = new Attaque("Souffle Dragon", TYP.dragon, 60, 100, 20, ATTCAT.special);
		allAttaques.add(souffle_dragon);
		Attaque danse_dragon = new Attaque("Danse Dragon", TYP.dragon, 0, 0, 20, ATTCAT.status);
		allAttaques.add(danse_dragon);
		Attaque outrage = new Attaque("Outrage", TYP.dragon, 120, 100, 10, ATTCAT.physical);
		allAttaques.add(outrage);
		
		// ---- POISON ----
		Attaque acide = new Attaque("Acide", TYP.poison, 40, 100, 30, ATTCAT.special);
		allAttaques.add(acide);
		Attaque dard_venin_poison = new Attaque("Dard-Venin", TYP.poison, 15, 100, 35, ATTCAT.physical);
		allAttaques.add(dard_venin_poison);
		Attaque toxic = new Attaque("Toxik", TYP.poison, 0, 90, 10, ATTCAT.status);
		allAttaques.add(toxic);
		Attaque smog = new Attaque("Smog", TYP.poison, 30, 70, 20, ATTCAT.special);
		allAttaques.add(smog);
		Attaque bomb_boeuf = new Attaque("Bomb-Bœuf", TYP.poison, 65, 100, 20, ATTCAT.physical);
		allAttaques.add(bomb_boeuf);
		Attaque nuage_toxik = new Attaque("Nuage Toxik", TYP.poison, 0, 100, 20, ATTCAT.status);
		allAttaques.add(nuage_toxik);
		Attaque pique = new Attaque("Piqué", TYP.poison, 80, 100, 20, ATTCAT.physical);
		allAttaques.add(pique);
		Attaque croc_poison = new Attaque("Croc Poison", TYP.poison, 50, 100, 35, ATTCAT.physical);
		allAttaques.add(croc_poison);
		Attaque acid_armor = new Attaque("Armure Acide", TYP.poison, 0, 0, 20, ATTCAT.status);
		allAttaques.add(acid_armor);
		Attaque ball_poison = new Attaque("Ball-Poison", TYP.poison, 80, 100, 15, ATTCAT.special);
		allAttaques.add(ball_poison);

		// ---- ROCHE ----
		Attaque jet_pierres = new Attaque("Jet-Pierres", TYP.roche, 25, 90, 30, ATTCAT.physical);
		allAttaques.add(jet_pierres);
		Attaque eboulement = new Attaque("Éboulement", TYP.roche, 75, 90, 10, ATTCAT.physical);
		allAttaques.add(eboulement);
		Attaque lancer_rocher = new Attaque("Lance-Rocher", TYP.roche, 50, 90, 15, ATTCAT.physical);
		allAttaques.add(lancer_rocher);
		Attaque tete_pierre = new Attaque("Tête de Pierre", TYP.roche, 100, 80, 10, ATTCAT.physical);
		allAttaques.add(tete_pierre);
		Attaque tranche_roc = new Attaque("Tranche-Roc", TYP.roche, 40, 100, 15, ATTCAT.physical);
		allAttaques.add(tranche_roc);
		Attaque defense_roc = new Attaque("Défense Roc", TYP.roche, 0, 0, 20, ATTCAT.status);
		allAttaques.add(defense_roc);
		Attaque tempete_sable_roc = new Attaque("Piège de Roc", TYP.roche, 0, 0, 20, ATTCAT.status);
		allAttaques.add(tempete_sable_roc);
		Attaque explosion_roc = new Attaque("Explosion Roc", TYP.roche, 150, 90, 5, ATTCAT.physical);
		allAttaques.add(explosion_roc);
		Attaque poing_roc = new Attaque("Poing-Roc", TYP.roche, 40, 100, 20, ATTCAT.physical);
		allAttaques.add(poing_roc);
		Attaque avalanche_roc = new Attaque("Avalanche Roc", TYP.roche, 60, 95, 15, ATTCAT.physical);
		allAttaques.add(avalanche_roc);

		// ---- ACIER ----
		Attaque griffe_acier = new Attaque("Griffe Acier", TYP.acier, 50, 95, 35, ATTCAT.physical);
		allAttaques.add(griffe_acier);
		Attaque poing_meteore = new Attaque("Poing Météore", TYP.acier, 100, 85, 10, ATTCAT.physical);
		allAttaques.add(poing_meteore);
		Attaque eclat_metal = new Attaque("Éclat Métal", TYP.acier, 80, 90, 10, ATTCAT.special);
		allAttaques.add(eclat_metal);
		Attaque pression_metal = new Attaque("Pression Métal", TYP.acier, 50, 85, 35, ATTCAT.physical);
		allAttaques.add(pression_metal);
		Attaque mur_acier = new Attaque("Mur Acier", TYP.acier, 0, 0, 40, ATTCAT.status);
		allAttaques.add(mur_acier);
		Attaque pique_acier = new Attaque("Piqué Acier", TYP.acier, 80, 100, 15, ATTCAT.physical);
		allAttaques.add(pique_acier);
		Attaque canon_acier = new Attaque("Canon Acier", TYP.acier, 100, 70, 5, ATTCAT.special);
		allAttaques.add(canon_acier);
		Attaque tranche_acier = new Attaque("Tranche Acier", TYP.acier, 70, 100, 25, ATTCAT.physical);
		allAttaques.add(tranche_acier);
		Attaque queue_acier = new Attaque("Queue Acier", TYP.acier, 100, 75, 25, ATTCAT.physical);
		allAttaques.add(queue_acier);
		Attaque defense_acier = new Attaque("Défense Acier", TYP.acier, 0, 0, 25, ATTCAT.status);
		allAttaques.add(defense_acier);
		
		// AJOUTER TOUTES LES ATTAQUES
	    EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
	    em.getTransaction().begin();
		for (Attaque a : allAttaques) {
			em.persist(a);
		}
		em.getTransaction().commit();
	    em.close();
	    
	    // CREATION ET AJOUT DE CHAQUE POKEMON
	 // LEGENDAIRES
	    Pokemon deoxys = new PokemonBuilder(386, "Deoxys")
	            .stats(50,150,50,150,50,150)
	            .ev(0,0,0,3,0,0)
	            .types(TYP.psy, null)
	            .learn(1, confusion)
	            .learn(9, choc_mental)
	            .learn(20, psyko)
	            .learn(30, laser_psy)
	            .learn(50, boost_psy)
	            .build();

	    Pokemon jirachi = new PokemonBuilder(385, "Jirachi")
	            .stats(100,100,100,100,100,100)
	            .ev(3,0,0,0,0,0)
	            .types(TYP.acier, TYP.psy)
	            .learn(1, confusion)
	            .learn(10, eclat_metal)
	            .learn(20, psyko)
	            .learn(30, poing_meteore)
	            .learn(40, tranche_acier)
	            .build();

	    Pokemon rayquaza = new PokemonBuilder(384, "Rayquaza")
	            .stats(105,150,90,150,90,95)
	            .ev(0,3,0,0,0,0)
	            .types(TYP.dragon, TYP.vol)
	            .learn(1, dracogriffe)
	            .learn(15, tranche_air)
	            .learn(30, danse_dragon)
	            .learn(45, draco_meteor)
	            .learn(60, outrage)
	            .build();

	    Pokemon groudon = new PokemonBuilder(383, "Groudon")
	            .stats(100,150,140,100,90,90)
	            .ev(0,3,0,0,0,0)
	            .types(TYP.sol, null)
	            .learn(1, seisme)
	            .learn(15, jet_sable)
	            .learn(30, excavation)
	            .learn(45, tete_pierre)
	            .learn(60, fissure)
	            .build();

	    Pokemon kyogre = new PokemonBuilder(382, "Kyogre")
	            .stats(100,100,90,150,140,90)
	            .ev(0,0,0,3,0,0)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(15, surf)
	            .learn(30, hydrocanon)
	            .learn(45, blizzard)
	            .learn(60, pluie)
	            .build();

	    Pokemon latios = new PokemonBuilder(381, "Latios")
	            .stats(80,90,80,130,110,110)
	            .ev(0,0,0,3,0,0)
	            .types(TYP.dragon, TYP.psy)
	            .learn(1, confusion)
	            .learn(10, psyko)
	            .learn(20, dragonnade)
	            .learn(35, laser_psy)
	            .learn(50, draco_meteor)
	            .build();

	    Pokemon latias = new PokemonBuilder(380, "Latias")
	            .stats(80,80,90,110,130,110)
	            .ev(0,0,0,0,3,0)
	            .types(TYP.dragon, TYP.psy)
	            .learn(1, confusion)
	            .learn(10, psyko)
	            .learn(20, dragonnade)
	            .learn(35, aura_psy)
	            .learn(50, soin)
	            .build();

	    Pokemon registeel = new PokemonBuilder(379, "Registeel")
	            .stats(80,75,150,75,150,50)
	            .ev(0,0,1,0,1,0)
	            .types(TYP.acier, null)
	            .learn(1, pression_metal)
	            .learn(10, mur_acier)
	            .learn(20, eclat_metal)
	            .learn(40, poing_meteore)
	            .learn(60, canon_acier)
	            .build();

	    Pokemon regice = new PokemonBuilder(378, "Regice")
	            .stats(80,50,100,100,200,50)
	            .ev(0,0,0,0,3,0)
	            .types(TYP.glace, null)
	            .learn(1, glaçon)
	            .learn(10, grele)
	            .learn(20, laser_glace)
	            .learn(40, blizzard)
	            .learn(60, poing_glace)
	            .build();

	    Pokemon regirock = new PokemonBuilder(377, "Regirock")
	            .stats(80,100,200,50,100,50)
	            .ev(0,0,3,0,0,0)
	            .types(TYP.roche, null)
	            .learn(1, jet_pierres)
	            .learn(10, defense_roc)
	            .learn(20, eboulement)
	            .learn(40, tete_pierre)
	            .learn(60, explosion_roc)
	            .build();

	    Pokemon metaloss = new PokemonBuilder(376, "Métalosse")
	            .stats(80,135,130,95,90,70)
	            .ev(0,3,0,0,0,0)
	            .types(TYP.acier, TYP.psy)
	            .learn(1, griffe_acier)
	            .learn(10, confusion)
	            .learn(20, poing_meteore)
	            .learn(35, eclat_metal)
	            .learn(50, poing_meteore)
	            .build();

	    Pokemon metang = new PokemonBuilder(375, "Métang")
	            .stats(60,75,100,55,80,50)
	            .ev(0,0,2,0,0,0)
	            .types(TYP.acier, TYP.psy)
	            .learn(1, griffe_acier)
	            .learn(10, confusion)
	            .learn(20, eclat_metal)
	            .learn(35, pression_metal)
	            .evol(45, metaloss)
	            .build();

	    Pokemon terhal = new PokemonBuilder(374, "Terhal")
	            .stats(40,55,80,35,60,30)
	            .ev(0,0,1,0,0,0)
	            .types(TYP.acier, TYP.psy)
	            .learn(1, griffe_acier)
	            .learn(10, confusion)
	            .learn(20, pression_metal)
	            .evol(20, metang)
	            .build();

	    Pokemon drattak = new PokemonBuilder(373, "Drattak")
	            .stats(95,135,80,110,80,100)
	            .ev(0,3,0,0,0,0)
	            .types(TYP.dragon, TYP.vol)
	            .learn(1, dracogriffe)
	            .learn(15, tranche_air)
	            .learn(30, danse_dragon)
	            .learn(50, draco_meteor)
	            .learn(60, outrage)
	            .build();

	    Pokemon drackhaus = new PokemonBuilder(372, "Drackhaus")
	            .stats(65,95,100,60,50,50)
	            .ev(0,0,2,0,0,0)
	            .types(TYP.dragon, null)
	            .learn(1, dracogriffe)
	            .learn(20, dragonnade)
	            .learn(35, souffle_dragon)
	            .evol(50, drattak)
	            .build();

	    Pokemon draby = new PokemonBuilder(371, "Draby")
	            .stats(45,75,60,40,30,50)
	            .ev(0,1,0,0,0,0)
	            .types(TYP.dragon, null)
	            .learn(1, dracogriffe)
	            .learn(15, rugissement)
	            .learn(25, dragonnade)
	            .evol(30, drackhaus)
	            .build();

	    Pokemon hyporoi = new PokemonBuilder(230, "Hyporoi")
	            .stats(75,95,95,95,95,85)
	            .ev(0,0,0,0,0,3)
	            .types(TYP.eau, TYP.dragon)
	            .learn(1, pistolet_eau)
	            .learn(15, bulles_eau)
	            .learn(25, dragonnade)
	            .learn(40, hydrocanon)
	            .learn(55, souffle_dragon)
	            .build();

	    Pokemon hypocean = new PokemonBuilder(117, "Hypocéan")
	            .stats(55,65,95,95,45,85)
	            .ev(0,0,0,2,0,0)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(15, bulles_eau)
	            .learn(25, surf)
	            .learn(35, hydrocanon)
	            .evol(48, hyporoi) //EVOLCUSTOM
	            .build();

	    Pokemon hypotrempe = new PokemonBuilder(116, "Hypotrempe")
	            .stats(30,40,70,70,25,60)
	            .ev(0,0,0,1,0,0)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(10, bulles_eau)
	            .learn(20, surf)
	            .evol(32, hypocean)
	            .build();

	    Pokemon lovdisc = new PokemonBuilder(370, "Lovdisc")
	            .stats(43,30,55,40,65,97)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(10, bulles_eau)
	            .learn(20, aqua_jet)
	            .learn(35, surf)
	            .build();

	    Pokemon rosabyss = new PokemonBuilder(368, "Rosabyss")
	            .stats(55,84,105,114,75,52)
	            .ev(0,0,0,2,0,0)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(15, surf)
	            .learn(25, hydrocanon)
	            .learn(40, aqua_queue)
	            .build();

	    Pokemon serpang = new PokemonBuilder(367, "Serpang")
	            .stats(55,104,105,94,75,52)
	            .ev(0,0,2,0,0,0)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(15, aqua_jet)
	            .learn(25, aqua_queue)
	            .learn(40, cascabrelo)
	            .build();

	    Pokemon coquiperl = new PokemonBuilder(366, "Coquiperl")
	            .stats(35,64,85,74,55,32)
	            .ev(0,0,1,0,0,0)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(15, bulles_eau)
	            .learn(25, surf)
	            .evol(24, serpang) //EVOLCUSTOM
	            .build();

	    Pokemon kaimorse = new PokemonBuilder(365, "Kaimorse")
	            .stats(110,80,90,95,90,65)
	            .ev(3,0,0,0,0,0)
	            .types(TYP.glace, TYP.eau)
	            .learn(1, glaçon)
	            .learn(15, surf)
	            .learn(25, blizzard)
	            .learn(40, laser_glace)
	            .learn(55, poing_glace)
	            .build();

	    Pokemon phogleur = new PokemonBuilder(364, "Phogleur")
	            .stats(90,60,70,75,70,45)
	            .ev(2,0,0,0,0,0)
	            .types(TYP.glace, TYP.eau)
	            .learn(1, glaçon)
	            .learn(15, surf)
	            .learn(25, laser_glace)
	            .learn(35, blizzard)
	            .evol(44, kaimorse)
	            .build();

	    Pokemon obalie = new PokemonBuilder(363, "Obalie")
	            .stats(70,40,50,55,50,25)
	            .ev(1,0,0,0,0,0)
	            .types(TYP.glace, TYP.eau)
	            .learn(1, glaçon)
	            .learn(10, pistolet_eau)
	            .learn(20, surf)
	            .evol(32, phogleur)
	            .build();

	    Pokemon oniglali = new PokemonBuilder(362, "Oniglali")
	            .stats(80,80,80,80,80,80)
	            .ev(0,0,0,0,0,2)
	            .types(TYP.glace, null)
	            .learn(1, glaçon)
	            .learn(15, grele)
	            .learn(25, blizzard)
	            .learn(40, poing_glace)
	            .build();

	    Pokemon stalgamin = new PokemonBuilder(361, "Stalgamin")
	            .stats(50,50,50,50,50,50)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.glace, null)
	            .learn(1, glaçon)
	            .learn(10, grele)
	            .learn(20, laser_glace)
	            .evol(42, oniglali)
	            .build();

	    Pokemon qulbutoke = new PokemonBuilder(202, "Qulbutoké")
	            .stats(190,33,58,33,58,33)
	            .ev(2,0,0,0,0,0)
	            .types(TYP.psy, null)
	            .learn(1, choc_mental)
	            .learn(15, reflexion)
	            .learn(30, barrierelight)
	            .build();

	    Pokemon okeoké = new PokemonBuilder(360, "Okéoké")
	            .stats(95,23,48,23,48,23)
	            .ev(2,0,0,0,0,0)
	            .types(TYP.psy, null)
	            .learn(1, choc_mental)
	            .learn(10, reflexion)
	            .evol(15, qulbutoke)
	            .build();

	    Pokemon absol = new PokemonBuilder(359, "Absol")
	            .stats(65,130,60,75,60,75)
	            .ev(0,2,0,0,0,0)
	            .types(TYP.tenebre, null)
	            .learn(1, tranche_nuit)
	            .learn(10, croc_fatal)
	            .learn(20, tranche)
	            .learn(35, machination)
	            .learn(48, nuit_noire)
	            .build();

	    Pokemon eoko = new PokemonBuilder(358, "Éoko")
	            .stats(65,50,70,95,80,65)
	            .ev(0,0,0,1,0,0)
	            .types(TYP.psy, null)
	            .learn(1, confusion)
	            .learn(10, choc_mental)
	            .learn(20, psyko)
	            .learn(35, aura_psy)
	            .build();

	    Pokemon tropius = new PokemonBuilder(357, "Tropius")
	            .stats(99,68,83,72,87,51)
	            .ev(0,0,0,0,1,0)
	            .types(TYP.plante, TYP.vol)
	            .learn(1, fouet_liane)
	            .learn(10, tranche_air)
	            .learn(20, lance_soleil)
	            .learn(35, tranch_feuille)
	            .learn(45, ouragan)
	            .build();

	    Pokemon teraclope = new PokemonBuilder(356, "Téraclope")
	            .stats(40,70,130,60,130,25)
	            .ev(0,0,2,0,0,0)
	            .types(TYP.spectre, null)
	            .learn(1, griffe_ombre)
	            .learn(15, ball_ombre)
	            .learn(25, frayeur)
	            .learn(40, malediction)
	            .build();

	    Pokemon skelenox = new PokemonBuilder(355, "Squelénox")
	            .stats(20,40,90,30,90,25)
	            .ev(0,0,0,0,1,0)
	            .types(TYP.spectre, null)
	            .learn(1, griffe_ombre)
	            .learn(10, frayeur)
	            .learn(20, ball_ombre)
	            .evol(37, teraclope)
	            .build();

	    Pokemon branette = new PokemonBuilder(354, "Branette")
	            .stats(64,115,65,83,63,65)
	            .ev(0,2,0,0,0,0)
	            .types(TYP.spectre, null)
	            .learn(1, griffe_ombre)
	            .learn(15, ball_ombre)
	            .learn(25, malediction)
	            .learn(38, envoi)
	            .build();

	    Pokemon polichombr = new PokemonBuilder(353, "Polichombr")
	            .stats(44,75,35,63,33,45)
	            .ev(0,1,0,0,0,0)
	            .types(TYP.spectre, null)
	            .learn(1, griffe_ombre)
	            .learn(10, frayeur)
	            .learn(18, ball_ombre)
	            .evol(37, branette)
	            .build();

	    Pokemon kecleon = new PokemonBuilder(352, "Kecleon")
	            .stats(60,90,70,60,120,40)
	            .ev(0,0,0,0,1,0)
	            .types(TYP.normal, null)
	            .learn(1, griffe)
	            .learn(10, tranche)
	            .learn(20, coup_rapide)
	            .learn(35, hyper_beam)
	            .build();

	    Pokemon staross = new PokemonBuilder(121, "Staross")
	            .stats(60,75,85,100,85,115)
	            .ev(0,0,0,0,0,2)
	            .types(TYP.eau, TYP.psy)
	            .learn(1, pistolet_eau)
	            .learn(15, surf)
	            .learn(25, psyko)
	            .learn(40, hydrocanon)
	            .learn(50, laser_psy)
	            .build();

	    Pokemon stari = new PokemonBuilder(120, "Stari")
	            .stats(30,45,55,70,55,85)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(10, surf)
	            .learn(20, confusion)
	            .evol(23, staross) //EVOLCUSTOM
	            .build();

	    Pokemon morpheo = new PokemonBuilder(351, "Morphéo")
	            .stats(70,70,70,70,70,70)
	            .ev(1,0,0,0,0,0)
	            .types(TYP.normal, null)
	            .learn(1, tackle)
	            .learn(10, rugissement)
	            .learn(20, coup_rapide)
	            .learn(30, hyper_beam)
	            .build();

	    Pokemon milobellus = new PokemonBuilder(350, "Milobellus")
	            .stats(95,60,79,100,125,81)
	            .ev(0,0,0,0,2,0)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(15, surf)
	            .learn(25, hydrocanon)
	            .learn(40, aqua_queue)
	            .learn(52, laser_glace)
	            .build();

	    Pokemon barpau = new PokemonBuilder(349, "Barpau")
	            .stats(20,15,20,10,55,80)
	            .ev(0,0,0,0,1,0)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(10, surf)
	            .evol(16, milobellus) //EVOLCUSTOM
	            .build();

	    Pokemon armaldo = new PokemonBuilder(348, "Armaldo")
	            .stats(75,125,100,70,80,45)
	            .ev(0,2,0,0,0,0)
	            .types(TYP.roche, TYP.insect)
	            .learn(1, piqure)
	            .learn(15, eboulement)
	            .learn(25, coupe_vent)
	            .learn(40, megacorne)
	            .learn(50, tete_pierre)
	            .build();

	    Pokemon anorith = new PokemonBuilder(347, "Anorith")
	            .stats(45,95,50,40,50,75)
	            .ev(0,2,0,0,0,0)
	            .types(TYP.roche, TYP.insect)
	            .learn(1, piqure)
	            .learn(10, jet_pierres)
	            .learn(20, coupe_vent)
	            .evol(40, armaldo)
	            .build();

	    Pokemon vacilys = new PokemonBuilder(346, "Vacilys")
	            .stats(86,81,97,81,107,43)
	            .ev(0,0,0,0,2,0)
	            .types(TYP.roche, TYP.plante)
	            .learn(1, fouet_liane)
	            .learn(15, eboulement)
	            .learn(25, synthesis)
	            .learn(40, lance_soleil)
	            .learn(50, avalanche_roc)
	            .build();

	    Pokemon lilia = new PokemonBuilder(345, "Lilia")
	            .stats(66,41,77,61,87,23)
	            .ev(0,0,0,0,2,0)
	            .types(TYP.roche, TYP.plante)
	            .learn(1, fouet_liane)
	            .learn(10, jet_pierres)
	            .learn(20, synthesis)
	            .learn(30, lance_soleil)
	            .evol(40, vacilys)
	            .build();

	    Pokemon kaorine = new PokemonBuilder(344, "Kaorine")
	            .stats(60,70,105,70,120,75)
	            .ev(0,0,2,0,0,0)
	            .types(TYP.sol, TYP.psy)
	            .learn(1, jet_sable)
	            .learn(10, confusion)
	            .learn(20, seisme)
	            .learn(35, psyko)
	            .learn(45, excavation)
	            .build();

	    Pokemon balbuto = new PokemonBuilder(343, "Balbuto")
	            .stats(40,40,55,40,70,55)
	            .ev(0,0,0,0,1,0)
	            .types(TYP.sol, TYP.psy)
	            .learn(1, jet_sable)
	            .learn(10, confusion)
	            .learn(20, seisme)
	            .evol(36, kaorine)
	            .build();

	    Pokemon colhomard = new PokemonBuilder(342, "Colhomard")
	            .stats(63,120,85,90,55,55)
	            .ev(0,2,0,0,0,0)
	            .types(TYP.eau, TYP.tenebre)
	            .learn(1, pistolet_eau)
	            .learn(15, croc_fatal)
	            .learn(25, aqua_queue)
	            .learn(38, tranche_nuit)
	            .learn(50, cascabrelo)
	            .build();

	    Pokemon ecrapince = new PokemonBuilder(341, "Écrapince")
	            .stats(43,80,65,50,35,35)
	            .ev(0,1,0,0,0,0)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(10, aqua_jet)
	            .learn(20, croc_fatal)
	            .evol(30, colhomard)
	            .build();

	    Pokemon barflosion = new PokemonBuilder(340, "Barflosion")
	            .stats(110,78,73,76,71,60)
	            .ev(2,0,0,0,0,0)
	            .types(TYP.eau, TYP.sol)
	            .learn(1, pistolet_eau)
	            .learn(15, surf)
	            .learn(25, seisme)
	            .learn(40, hydrocanon)
	            .learn(55, excavation)
	            .build();

	    Pokemon barloche = new PokemonBuilder(339, "Barloche")
	            .stats(50,48,43,46,41,60)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.eau, TYP.sol)
	            .learn(1, pistolet_eau)
	            .learn(10, jet_sable)
	            .learn(20, surf)
	            .evol(30, barflosion)
	            .build();

	    Pokemon solaroc = new PokemonBuilder(338, "Solaroc")
	            .stats(70,95,85,55,65,70)
	            .ev(0,2,0,0,0,0)
	            .types(TYP.roche, TYP.psy)
	            .learn(1, jet_pierres)
	            .learn(15, confusion)
	            .learn(25, eboulement)
	            .learn(40, psyko)
	            .learn(50, tete_pierre)
	            .build();

	    Pokemon seleroc = new PokemonBuilder(337, "Séléroc")
	            .stats(70,55,65,95,85,70)
	            .ev(0,0,0,2,0,0)
	            .types(TYP.roche, TYP.psy)
	            .learn(1, jet_pierres)
	            .learn(15, confusion)
	            .learn(25, psyko)
	            .learn(40, aura_psy)
	            .learn(50, laser_psy)
	            .build();

	    Pokemon seviper = new PokemonBuilder(336, "Séviper")
	            .stats(73,100,60,100,60,65)
	            .ev(0,1,0,1,0,0)
	            .types(TYP.poison, null)
	            .learn(1, croc_poison)
	            .learn(10, acide)
	            .learn(20, ball_poison)
	            .learn(35, toxic)
	            .learn(48, pique)
	            .build();

	    Pokemon mangriff = new PokemonBuilder(335, "Mangriff")
	            .stats(73,115,60,60,60,90)
	            .ev(0,2,0,0,0,0)
	            .types(TYP.normal, null)
	            .learn(1, griffe)
	            .learn(10, tranche)
	            .learn(20, coup_rapide)
	            .learn(35, tranche_nuit)
	            .learn(48, hyper_beam)
	            .build();

	    Pokemon altaria = new PokemonBuilder(334, "Altaria")
	            .stats(75,70,90,70,105,80)
	            .ev(0,0,0,0,2,0)
	            .types(TYP.dragon, TYP.vol)
	            .learn(1, dracogriffe)
	            .learn(15, tranche_air)
	            .learn(25, danse_dragon)
	            .learn(40, dragonnade)
	            .learn(55, outrage)
	            .build();

	    Pokemon tylton = new PokemonBuilder(333, "Tylton")
	            .stats(45,40,60,40,75,50)
	            .ev(0,0,0,0,1,0)
	            .types(TYP.normal, TYP.vol)
	            .learn(1, tornade)
	            .learn(10, tranche_air)
	            .learn(20, rugissement)
	            .evol(35, altaria)
	            .build();

	    Pokemon cacturne = new PokemonBuilder(332, "Cacturne")
	            .stats(70,115,60,115,60,55)
	            .ev(0,1,0,1,0,0)
	            .types(TYP.plante, TYP.tenebre)
	            .learn(1, fouet_liane)
	            .learn(15, tranche_nuit)
	            .learn(25, lance_soleil)
	            .learn(40, machination)
	            .learn(52, tranch_feuille)
	            .build();

	    Pokemon cacnea = new PokemonBuilder(331, "Cacnea")
	            .stats(50,85,40,85,40,35)
	            .ev(0,0,0,1,0,0)
	            .types(TYP.plante, null)
	            .learn(1, fouet_liane)
	            .learn(10, croissance)
	            .learn(20, tranch_herbe)
	            .evol(32, cacturne)
	            .build();

	    Pokemon libegon = new PokemonBuilder(330, "Libégon")
	            .stats(80,100,80,80,80,100)
	            .ev(0,0,0,0,0,3)
	            .types(TYP.sol, TYP.dragon)
	            .learn(1, jet_sable)
	            .learn(15, dracogriffe)
	            .learn(25, seisme)
	            .learn(40, dragonnade)
	            .learn(55, outrage)
	            .build();

	    Pokemon vibraninf = new PokemonBuilder(329, "Vibraninf")
	            .stats(50,70,50,50,50,70)
	            .ev(0,0,0,0,0,2)
	            .types(TYP.sol, TYP.dragon)
	            .learn(1, jet_sable)
	            .learn(15, dracogriffe)
	            .learn(25, seisme)
	            .evol(45, libegon)
	            .build();

	    Pokemon krakoss = new PokemonBuilder(328, "Krakoss")
	            .stats(45,100,45,45,45,10)
	            .ev(0,1,0,0,0,0)
	            .types(TYP.sol, null)
	            .learn(1, jet_sable)
	            .learn(10, tremblement)
	            .learn(20, excavation)
	            .evol(35, vibraninf)
	            .build();

	    Pokemon pandir = new PokemonBuilder(327, "Pandir")
	            .stats(60,60,60,60,60,60)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.normal, null)
	            .learn(1, tackle)
	            .learn(10, rugissement)
	            .learn(20, coup_rapide)
	            .learn(35, double_equipe)
	            .build();

	    Pokemon groret = new PokemonBuilder(326, "Groret")
	            .stats(80,45,65,90,110,80)
	            .ev(0,0,0,0,2,0)
	            .types(TYP.psy, null)
	            .learn(1, confusion)
	            .learn(15, psyko)
	            .learn(25, aura_psy)
	            .learn(40, amnesie)
	            .learn(52, laser_psy)
	            .build();

	    Pokemon spoink = new PokemonBuilder(325, "Spoink")
	            .stats(60,25,35,70,80,60)
	            .ev(0,0,0,0,1,0)
	            .types(TYP.psy, null)
	            .learn(1, confusion)
	            .learn(10, choc_mental)
	            .learn(20, psyko)
	            .evol(32, groret)
	            .build();

	    Pokemon chartor = new PokemonBuilder(324, "Chartor")
	            .stats(70,85,140,85,70,20)
	            .ev(0,0,2,0,0,0)
	            .types(TYP.feu, null)
	            .learn(1, flammèche)
	            .learn(15, abrasion)
	            .learn(25, lance_flamme)
	            .learn(40, deflagration)
	            .learn(55, cremation)
	            .build();

	    Pokemon camerupt = new PokemonBuilder(323, "Camérupt")
	            .stats(70,100,70,105,75,40)
	            .ev(0,0,0,2,0,0)
	            .types(TYP.feu, TYP.sol)
	            .learn(1, flammèche)
	            .learn(15, seisme)
	            .learn(25, lance_flamme)
	            .learn(40, deflagration)
	            .learn(52, eruption)
	            .build();

	    Pokemon chamallot = new PokemonBuilder(322, "Chamallot")
	            .stats(60,60,40,65,45,35)
	            .ev(0,0,0,1,0,0)
	            .types(TYP.feu, TYP.sol)
	            .learn(1, flammèche)
	            .learn(10, jet_sable)
	            .learn(20, lance_flamme)
	            .evol(33, camerupt)
	            .build();

	    Pokemon wailord = new PokemonBuilder(321, "Wailord")
	            .stats(170,90,45,90,45,60)
	            .ev(2,0,0,0,0,0)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(15, surf)
	            .learn(30, hydrocanon)
	            .learn(45, blizzard)
	            .learn(60, pluie)
	            .build();

	    Pokemon wailmer = new PokemonBuilder(320, "Wailmer")
	            .stats(130,70,35,70,35,60)
	            .ev(1,0,0,0,0,0)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(10, surf)
	            .learn(20, bulles_eau)
	            .evol(40, wailord)
	            .build();

	    Pokemon sharpedo = new PokemonBuilder(319, "Sharpedo")
	            .stats(70,120,40,95,40,95)
	            .ev(0,2,0,0,0,0)
	            .types(TYP.eau, TYP.tenebre)
	            .learn(1, pistolet_eau)
	            .learn(15, croc_fatal)
	            .learn(25, aqua_jet)
	            .learn(40, tranche_nuit)
	            .learn(52, hydrocanon)
	            .build();

	    Pokemon carvanha = new PokemonBuilder(318, "Carvanha")
	            .stats(45,90,20,65,20,65)
	            .ev(0,1,0,0,0,0)
	            .types(TYP.eau, TYP.tenebre)
	            .learn(1, pistolet_eau)
	            .learn(10, croc_fatal)
	            .learn(18, aqua_jet)
	            .evol(30, sharpedo)
	            .build();

	    Pokemon avaltout = new PokemonBuilder(317, "Avaltout")
	            .stats(100,73,83,73,83,55)
	            .ev(2,0,0,0,0,0)
	            .types(TYP.poison, null)
	            .learn(1, acide)
	            .learn(15, ball_poison)
	            .learn(25, toxic)
	            .learn(40, smog)
	            .learn(52, pique)
	            .build();

	    Pokemon gloupti = new PokemonBuilder(316, "Gloupti")
	            .stats(70,43,53,43,53,40)
	            .ev(1,0,0,0,0,0)
	            .types(TYP.poison, null)
	            .learn(1, acide)
	            .learn(10, smog)
	            .learn(20, ball_poison)
	            .evol(26, avaltout)
	            .build();

	    Pokemon roselia = new PokemonBuilder(315, "Rosélia")
	            .stats(50,60,45,100,80,65)
	            .ev(0,0,0,2,0,0)
	            .types(TYP.plante, TYP.poison)
	            .learn(1, fouet_liane)
	            .learn(10, acide)
	            .learn(20, poudre_toxik)
	            .learn(30, rayon_soleil)
	            .learn(45, lance_soleil)
	            .build();

	    Pokemon lumivole = new PokemonBuilder(314, "Lumivole")
	            .stats(65,47,55,73,75,85)
	            .ev(0,0,0,0,1,0)
	            .types(TYP.insect, null)
	            .learn(1, piqure)
	            .learn(10, tourbillon)
	            .learn(20, signal_beam)
	            .learn(35, coupe_vent)
	            .build();

	    Pokemon luciole = new PokemonBuilder(313, "Luciole")
	            .stats(65,73,55,47,75,85)
	            .ev(0,0,0,0,1,0)
	            .types(TYP.insect, null)
	            .learn(1, piqure)
	            .learn(10, tourbillon)
	            .learn(20, coupe_vent)
	            .learn(35, signal_beam)
	            .build();

	    Pokemon electrode = new PokemonBuilder(101, "Électrode")
	            .stats(60,50,70,80,80,150)
	            .ev(0,0,0,0,0,2)
	            .types(TYP.electrique, null)
	            .learn(1, onde_choc)
	            .learn(15, tonnerre)
	            .learn(25, fatal_foudre)
	            .learn(40, charge)
	            .build();

	    Pokemon voltorbe = new PokemonBuilder(100, "Voltorbe")
	            .stats(40,30,50,55,55,100)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.electrique, null)
	            .learn(1, onde_choc)
	            .learn(10, eclair)
	            .learn(20, tonnerre)
	            .evol(30, electrode)
	            .build();

	    Pokemon magneton = new PokemonBuilder(82, "Magnéton")
	            .stats(50,60,95,120,70,70)
	            .ev(0,0,0,2,0,0)
	            .types(TYP.electrique, TYP.acier)
	            .learn(1, onde_choc)
	            .learn(15, eclair)
	            .learn(25, eclat_metal)
	            .learn(40, tonnerre)
	            .learn(52, fatal_foudre)
	            .build();

	    Pokemon magneti = new PokemonBuilder(81, "Magnéti")
	            .stats(25,35,70,95,55,45)
	            .ev(0,0,0,1,0,0)
	            .types(TYP.electrique, TYP.acier)
	            .learn(1, onde_choc)
	            .learn(10, eclair)
	            .learn(20, eclat_metal)
	            .evol(30, magneton)
	            .build();

	    Pokemon negapi = new PokemonBuilder(312, "Négapi")
	            .stats(60,40,50,75,85,95)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.electrique, null)
	            .learn(1, onde_choc)
	            .learn(10, eclair)
	            .learn(20, tonnerre)
	            .learn(35, charge)
	            .build();

	    Pokemon posipi = new PokemonBuilder(311, "Posipi")
	            .stats(60,50,40,85,75,95)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.electrique, null)
	            .learn(1, onde_choc)
	            .learn(10, eclair)
	            .learn(20, tonnerre)
	            .learn(35, charge)
	            .build();

	    Pokemon elecsprint = new PokemonBuilder(310, "Élecsprint")
	            .stats(70,75,60,105,60,105)
	            .ev(0,0,0,0,0,2)
	            .types(TYP.electrique, null)
	            .learn(1, onde_choc)
	            .learn(15, eclair)
	            .learn(25, tonnerre)
	            .learn(40, fatal_foudre)
	            .learn(52, poing_eclair)
	            .build();

	    Pokemon dynavolt = new PokemonBuilder(309, "Dynavolt")
	            .stats(40,45,40,65,40,65)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.electrique, null)
	            .learn(1, onde_choc)
	            .learn(10, eclair)
	            .learn(18, tonnerre)
	            .evol(26, elecsprint)
	            .build();

	    Pokemon charmina = new PokemonBuilder(308, "Charmina")
	            .stats(60,60,75,60,75,80)
	            .ev(0,0,0,0,0,2)
	            .types(TYP.combat, TYP.psy)
	            .learn(1, poing_karate)
	            .learn(15, confusion)
	            .learn(25, close_combat)
	            .learn(40, psyko)
	            .learn(52, pied_pied)
	            .build();

	    Pokemon meditikka = new PokemonBuilder(307, "Méditikka")
	            .stats(30,40,55,40,55,60)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.combat, TYP.psy)
	            .learn(1, poing_karate)
	            .learn(10, confusion)
	            .learn(20, pied_pied)
	            .evol(37, charmina)
	            .build();

	    Pokemon mackogneur = new PokemonBuilder(68, "Mackogneur")
	            .stats(90,130,80,65,85,55)
	            .ev(0,3,0,0,0,0)
	            .types(TYP.combat, null)
	            .learn(1, poing_karate)
	            .learn(15, close_combat)
	            .learn(25, seisme_poing)
	            .learn(40, souplesse)
	            .learn(52, coup_bas)
	            .build();

	    Pokemon machopeur = new PokemonBuilder(67, "Machopeur")
	            .stats(80,100,70,50,60,45)
	            .ev(0,2,0,0,0,0)
	            .types(TYP.combat, null)
	            .learn(1, poing_karate)
	            .learn(15, pied_pied)
	            .learn(25, seisme_poing)
	            .evol(46, mackogneur) //EVOLCUSTOM
	            .build();

	    Pokemon machoc = new PokemonBuilder(66, "Machoc")
	            .stats(70,80,50,35,35,35)
	            .ev(0,1,0,0,0,0)
	            .types(TYP.combat, null)
	            .learn(1, poing_karate)
	            .learn(10, pied_pied)
	            .learn(20, coup_bas)
	            .evol(28, machopeur)
	            .build();

	    Pokemon galeking = new PokemonBuilder(306, "Galéking")
	            .stats(70,110,180,60,60,50)
	            .ev(0,0,3,0,0,0)
	            .types(TYP.acier, TYP.roche)
	            .learn(1, poing_roc)
	            .learn(15, tete_pierre)
	            .learn(25, poing_meteore)
	            .learn(40, eboulement)
	            .learn(52, explosion_roc)
	            .build();

	    Pokemon maxitoupie = new PokemonBuilder(305, "Maxitoupie")
	            .stats(60,90,140,50,50,40)
	            .ev(0,0,2,0,0,0)
	            .types(TYP.acier, TYP.roche)
	            .learn(1, poing_roc)
	            .learn(15, jet_pierres)
	            .learn(25, tete_pierre)
	            .evol(42, galeking)
	            .build();

	    Pokemon miniepine = new PokemonBuilder(304, "Miniépine")
	            .stats(50,70,100,40,40,30)
	            .ev(0,0,1,0,0,0)
	            .types(TYP.acier, TYP.roche)
	            .learn(1, tackle)
	            .learn(10, jet_pierres)
	            .learn(20, poing_roc)
	            .evol(32, maxitoupie)
	            .build();

	    Pokemon mysdibule = new PokemonBuilder(303, "Mysdibule")
	            .stats(50,85,85,55,55,50)
	            .ev(0,1,1,0,0,0)
	            .types(TYP.acier, null)
	            .learn(1, griffe_acier)
	            .learn(10, mur_acier)
	            .learn(20, tranche_acier)
	            .learn(35, queue_acier)
	            .build();

	    Pokemon tenefix = new PokemonBuilder(302, "Ténéfix")
	            .stats(50,75,75,65,65,50)
	            .ev(0,1,1,0,0,0)
	            .types(TYP.tenebre, TYP.spectre)
	            .learn(1, griffe_ombre)
	            .learn(10, tranche_nuit)
	            .learn(20, ball_ombre)
	            .learn(35, machination)
	            .learn(48, frayeur)
	            .build();

	    Pokemon delcatty = new PokemonBuilder(301, "Delcatty")
	            .stats(70,65,65,55,55,70)
	            .ev(0,0,0,0,0,2)
	            .types(TYP.normal, null)
	            .learn(1, tackle)
	            .learn(15, rugissement)
	            .learn(25, coup_rapide)
	            .learn(40, double_equipe)
	            .build();

	    Pokemon skitty = new PokemonBuilder(300, "Skitty")
	            .stats(50,45,45,35,35,50)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.normal, null)
	            .learn(1, tackle)
	            .learn(10, rugissement)
	            .learn(18, coup_rapide)
	            .evol(27, delcatty) //EVOLCUSTOM
	            .build();

	    Pokemon tarinor = new PokemonBuilder(299, "Tarinor")
	            .stats(30,45,135,45,90,30)
	            .ev(0,0,2,0,0,0)
	            .types(TYP.roche, null)
	            .learn(1, tackle)
	            .learn(10, jet_pierres)
	            .learn(20, defense_roc)
	            .learn(35, eboulement)
	            .build();

	    Pokemon azumarill = new PokemonBuilder(184, "Azumarill")
	            .stats(100,50,80,60,80,50)
	            .ev(2,0,0,0,0,0)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(15, bulles_eau)
	            .learn(25, aqua_queue)
	            .learn(40, surf)
	            .learn(52, hydrocanon)
	            .build();

	    Pokemon marill = new PokemonBuilder(183, "Marill")
	            .stats(70,20,50,20,50,40)
	            .ev(2,0,0,0,0,0)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(10, bulles_eau)
	            .learn(20, aqua_jet)
	            .evol(18, azumarill)
	            .build();

	    Pokemon azurill = new PokemonBuilder(298, "Azurill")
	            .stats(50,20,40,20,40,20)
	            .ev(2,0,0,0,0,0)
	            .types(TYP.normal, null)
	            .learn(1, pistolet_eau)
	            .learn(10, bulles_eau)
	            .evol(11, marill) //EVOLCUSTOM
	            .build();

	    Pokemon leviator = new PokemonBuilder(130, "Léviator")
	            .stats(95,125,79,60,100,81)
	            .ev(0,2,0,0,0,0)
	            .types(TYP.eau, TYP.vol)
	            .learn(1, pistolet_eau)
	            .learn(15, surf)
	            .learn(25, aqua_queue)
	            .learn(40, hydrocanon)
	            .learn(55, cascabrelo)
	            .build();

	    Pokemon magicarpe = new PokemonBuilder(129, "Magicarpe")
	            .stats(20,10,55,15,20,80)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(15, aqua_jet)
	            .evol(20, leviator)
	            .build();

	    Pokemon poissoroy = new PokemonBuilder(119, "Poissoroy")
	            .stats(80,92,65,65,80,68)
	            .ev(0,2,0,0,0,0)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(15, surf)
	            .learn(25, aqua_queue)
	            .learn(40, cascabrelo)
	            .learn(52, hydrocanon)
	            .build();

	    Pokemon poissirene = new PokemonBuilder(118, "Poissirène")
	            .stats(45,67,60,35,50,63)
	            .ev(0,1,0,0,0,0)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(10, bulles_eau)
	            .learn(20, surf)
	            .evol(33, poissoroy)
	            .build();

	    Pokemon hariyama = new PokemonBuilder(297, "Hariyama")
	            .stats(144,120,60,40,60,50)
	            .ev(2,0,0,0,0,0)
	            .types(TYP.combat, null)
	            .learn(1, poing_karate)
	            .learn(15, seisme_poing)
	            .learn(25, close_combat)
	            .learn(40, souplesse)
	            .learn(52, coup_bas)
	            .build();

	    Pokemon makuhita = new PokemonBuilder(296, "Makuhita")
	            .stats(72,60,30,20,30,25)
	            .ev(2,0,0,0,0,0)
	            .types(TYP.combat, null)
	            .learn(1, poing_karate)
	            .learn(10, pied_pied)
	            .learn(18, seisme_poing)
	            .evol(24, hariyama)
	            .build();

	    Pokemon brouhabam = new PokemonBuilder(295, "Brouhabam")
	            .stats(104,91,63,91,63,68)
	            .ev(3,0,0,0,0,0)
	            .types(TYP.normal, null)
	            .learn(1, tackle)
	            .learn(15, rugissement)
	            .learn(25, hyper_beam)
	            .learn(40, double_equipe)
	            .build();

	    Pokemon ramboum = new PokemonBuilder(294, "Ramboum")
	            .stats(84,71,43,71,43,48)
	            .ev(2,0,0,0,0,0)
	            .types(TYP.normal, null)
	            .learn(1, tackle)
	            .learn(10, rugissement)
	            .learn(20, coup_rapide)
	            .evol(40, brouhabam)
	            .build();

	    Pokemon chuchmur = new PokemonBuilder(293, "Chuchmur")
	            .stats(64,51,23,51,23,28)
	            .ev(1,0,0,0,0,0)
	            .types(TYP.normal, null)
	            .learn(1, tackle)
	            .learn(8, rugissement)
	            .learn(15, coup_rapide)
	            .evol(20, ramboum)
	            .build();

	    Pokemon munja = new PokemonBuilder(292, "Munja")
	            .stats(1,90,45,30,30,40)
	            .ev(0,2,0,0,0,0)
	            .types(TYP.insect, TYP.spectre)
	            .learn(1, piqure)
	            .learn(10, griffe_ombre)
	            .learn(20, ball_ombre)
	            .build();

	    Pokemon ninjask = new PokemonBuilder(291, "Ninjask")
	            .stats(61,90,45,50,50,160)
	            .ev(0,0,0,0,0,2)
	            .types(TYP.insect, TYP.vol)
	            .learn(1, piqure)
	            .learn(15, coupe_vent)
	            .learn(25, aeropique)
	            .learn(40, megacorne)
	            .build();

	    Pokemon nincada = new PokemonBuilder(290, "Nincada")
	            .stats(31,45,90,30,30,40)
	            .ev(0,0,1,0,0,0)
	            .types(TYP.insect, TYP.sol)
	            .learn(1, piqure)
	            .learn(10, jet_sable)
	            .learn(18, coupe_vent)
	            .evol(20, ninjask)
	            .build();

	    Pokemon alakazam = new PokemonBuilder(65, "Alakazam")
	            .stats(55,50,45,135,95,120)
	            .ev(0,0,0,3,0,0)
	            .types(TYP.psy, null)
	            .learn(1, confusion)
	            .learn(15, psyko)
	            .learn(25, laser_psy)
	            .learn(40, amnesie)
	            .learn(52, boost_psy)
	            .build();

	    Pokemon kadabra = new PokemonBuilder(64, "Kadabra")
	            .stats(40,35,30,120,70,105)
	            .ev(0,0,0,2,0,0)
	            .types(TYP.psy, null)
	            .learn(1, confusion)
	            .learn(15, psyko)
	            .learn(25, aura_psy)
	            .evol(29, alakazam) //EVOLCUSTOM
	            .build();

	    Pokemon abra = new PokemonBuilder(63, "Abra")
	            .stats(25,20,15,105,55,90)
	            .ev(0,0,0,1,0,0)
	            .types(TYP.psy, null)
	            .learn(1, confusion)
	            .learn(10, teleport)
	            .evol(16, kadabra)
	            .build();

	    Pokemon monaflémit = new PokemonBuilder(289, "Monaflémit")
	            .stats(150,160,100,95,65,100)
	            .ev(0,3,0,0,0,0)
	            .types(TYP.normal, null)
	            .learn(1, griffe)
	            .learn(15, tranche)
	            .learn(25, hyper_beam)
	            .learn(40, rugissement)
	            .build();

	    Pokemon vigoroth = new PokemonBuilder(288, "Vigoroth")
	            .stats(80,80,80,55,55,90)
	            .ev(0,0,0,0,0,2)
	            .types(TYP.normal, null)
	            .learn(1, griffe)
	            .learn(10, coup_rapide)
	            .learn(20, tranche)
	            .evol(36, monaflémit)
	            .build();

	    Pokemon parecool = new PokemonBuilder(287, "Parecool")
	            .stats(60,60,60,35,35,30)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.normal, null)
	            .learn(1, griffe)
	            .learn(8, rugissement)
	            .learn(15, coup_rapide)
	            .evol(18, vigoroth)
	            .build();

	    Pokemon chapignon = new PokemonBuilder(286, "Chapignon")
	            .stats(60,130,80,60,60,70)
	            .ev(0,3,0,0,0,0)
	            .types(TYP.plante, TYP.combat)
	            .learn(1, fouet_liane)
	            .learn(15, poing_karate)
	            .learn(25, close_combat)
	            .learn(40, tranch_feuille)
	            .learn(52, seisme_poing)
	            .build();

	    Pokemon balignon = new PokemonBuilder(285, "Balignon")
	            .stats(60,40,60,40,60,35)
	            .ev(0,0,1,0,0,0)
	            .types(TYP.plante, null)
	            .learn(1, fouet_liane)
	            .learn(10, poudre_dodo)
	            .learn(18, poudre_toxik)
	            .evol(23, chapignon)
	            .build();

	    Pokemon maskadra = new PokemonBuilder(284, "Maskadra")
	            .stats(70,60,62,80,82,60)
	            .ev(0,0,0,2,0,0)
	            .types(TYP.insect, TYP.vol)
	            .learn(1, piqure)
	            .learn(15, signal_beam)
	            .learn(25, tranche_air)
	            .learn(40, tourbillon)
	            .build();

	    Pokemon arakdo = new PokemonBuilder(283, "Arakdo")
	            .stats(40,30,32,50,52,65)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.insect, TYP.eau)
	            .learn(1, piqure)
	            .learn(10, pistolet_eau)
	            .learn(18, signal_beam)
	            .evol(22, maskadra)
	            .build();

	    Pokemon gardevoir = new PokemonBuilder(282, "Gardevoir")
	            .stats(68,65,65,125,115,80)
	            .ev(0,0,0,3,0,0)
	            .types(TYP.psy, null)
	            .learn(1, confusion)
	            .learn(15, psyko)
	            .learn(25, aura_psy)
	            .learn(40, amnesie)
	            .learn(52, laser_psy)
	            .build();

	    Pokemon kirlia = new PokemonBuilder(281, "Kirlia")
	            .stats(38,35,35,65,55,50)
	            .ev(0,0,0,2,0,0)
	            .types(TYP.psy, null)
	            .learn(1, confusion)
	            .learn(10, choc_mental)
	            .learn(20, psyko)
	            .evol(30, gardevoir)
	            .build();

	    Pokemon tarsal = new PokemonBuilder(280, "Tarsal")
	            .stats(28,25,25,45,35,40)
	            .ev(0,0,0,1,0,0)
	            .types(TYP.psy, null)
	            .learn(1, confusion)
	            .learn(8, choc_mental)
	            .evol(20, kirlia)
	            .build();

	    Pokemon larmanin = new PokemonBuilder(279, "Larmanin")
	            .stats(60,50,100,85,70,65)
	            .ev(0,0,2,0,0,0)
	            .types(TYP.eau, TYP.vol)
	            .learn(1, pistolet_eau)
	            .learn(15, tranche_air)
	            .learn(25, surf)
	            .learn(40, hydrocanon)
	            .learn(52, ouragan)
	            .build();

	    Pokemon goelise = new PokemonBuilder(278, "Goélise")
	            .stats(40,30,30,55,30,85)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.eau, TYP.vol)
	            .learn(1, pistolet_eau)
	            .learn(10, tornade)
	            .learn(18, tranche_air)
	            .evol(25, larmanin)
	            .build();

	    Pokemon heledelle = new PokemonBuilder(277, "Hélédelle")
	            .stats(60,85,60,50,50,125)
	            .ev(0,0,0,0,0,2)
	            .types(TYP.normal, TYP.vol)
	            .learn(1, tornade)
	            .learn(15, tranche_air)
	            .learn(25, aeropique)
	            .learn(40, ouragan)
	            .build();

	    Pokemon nirondelle = new PokemonBuilder(276, "Nirondelle")
	            .stats(40,55,30,30,30,85)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.normal, TYP.vol)
	            .learn(1, tornade)
	            .learn(10, tranche_air)
	            .learn(18, aeropique)
	            .evol(22, heledelle)
	            .build();

	    Pokemon tengalice = new PokemonBuilder(275, "Tengalice")
	            .stats(90,100,60,90,60,80)
	            .ev(0,1,0,1,0,0)
	            .types(TYP.plante, TYP.tenebre)
	            .learn(1, fouet_liane)
	            .learn(15, tranche_nuit)
	            .learn(25, tranch_feuille)
	            .learn(40, machination)
	            .learn(52, lance_soleil)
	            .build();

	    Pokemon pifeuil = new PokemonBuilder(274, "Pifeuil")
	            .stats(60,70,40,60,40,60)
	            .ev(0,2,0,0,0,0)
	            .types(TYP.plante, TYP.tenebre)
	            .learn(1, fouet_liane)
	            .learn(15, tranche_nuit)
	            .learn(25, tranch_herbe)
	            .evol(32, tengalice) //EVOLCUSTOM
	            .build();

	    Pokemon grainipiot = new PokemonBuilder(273, "Grainipiot")
	            .stats(40,40,50,30,30,30)
	            .ev(0,0,1,0,0,0)
	            .types(TYP.plante, null)
	            .learn(1, fouet_liane)
	            .learn(8, croissance)
	            .evol(14, pifeuil)
	            .build();

	    Pokemon ludicolo = new PokemonBuilder(272, "Ludicolo")
	            .stats(80,70,70,90,100,70)
	            .ev(0,0,0,0,2,0)
	            .types(TYP.eau, TYP.plante)
	            .learn(1, pistolet_eau)
	            .learn(15, fouet_liane)
	            .learn(25, surf)
	            .learn(40, lance_soleil)
	            .learn(52, hydrocanon)
	            .build();

	    Pokemon lombre = new PokemonBuilder(271, "Lombre")
	            .stats(60,50,50,60,70,50)
	            .ev(0,0,0,0,2,0)
	            .types(TYP.eau, TYP.plante)
	            .learn(1, pistolet_eau)
	            .learn(10, fouet_liane)
	            .learn(20, surf)
	            .evol(32, ludicolo) //EVOLCUSTOM
	            .build();

	    Pokemon nenupiot = new PokemonBuilder(270, "Nénupiot")
	            .stats(40,30,30,40,50,30)
	            .ev(0,0,0,0,1,0)
	            .types(TYP.eau, TYP.plante)
	            .learn(1, pistolet_eau)
	            .learn(8, fouet_liane)
	            .evol(14, lombre)
	            .build();

	    Pokemon papinox = new PokemonBuilder(269, "Papinox")
	            .stats(60,50,70,50,90,65)
	            .ev(0,0,0,0,2,0)
	            .types(TYP.insect, TYP.poison)
	            .learn(1, piqure)
	            .learn(15, acide)
	            .learn(25, ball_poison)
	            .learn(40, tourbillon)
	            .build();

	    Pokemon blindalys = new PokemonBuilder(268, "Blindalys")
	            .stats(50,35,55,25,25,15)
	            .ev(0,0,2,0,0,0)
	            .types(TYP.insect, null)
	            .learn(1, piqure)
	            .learn(8, defense_roc)
	            .evol(10, papinox)
	            .build();

	    Pokemon charmillon = new PokemonBuilder(267, "Charmillon")
	            .stats(60,70,50,90,50,65)
	            .ev(0,0,0,2,0,0)
	            .types(TYP.insect, TYP.vol)
	            .learn(1, piqure)
	            .learn(15, signal_beam)
	            .learn(25, tranche_air)
	            .learn(40, tourbillon)
	            .build();

	    Pokemon armulys = new PokemonBuilder(266, "Armulys")
	            .stats(50,35,55,25,25,15)
	            .ev(0,0,2,0,0,0)
	            .types(TYP.insect, null)
	            .learn(1, piqure)
	            .learn(8, defense_roc)
	            .evol(10, charmillon)
	            .build();

	    Pokemon chenipotte = new PokemonBuilder(265, "Chenipotte")
	            .stats(45,45,35,20,30,20)
	            .ev(0,1,0,0,0,0)
	            .types(TYP.insect, null)
	            .learn(1, piqure)
	            .learn(5, dard_venin)
	            .evol(7, armulys)
	            .build();

	    Pokemon lineon = new PokemonBuilder(264, "Linéon")
	            .stats(78,70,61,50,61,100)
	            .ev(0,0,0,0,0,2)
	            .types(TYP.normal, null)
	            .learn(1, tackle)
	            .learn(15, coup_rapide)
	            .learn(25, tranche)
	            .learn(40, double_equipe)
	            .build();

	    Pokemon zigzaton = new PokemonBuilder(263, "Zigzaton")
	            .stats(38,30,41,30,41,60)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.normal, null)
	            .learn(1, tackle)
	            .learn(8, coup_rapide)
	            .evol(20, lineon)
	            .build();

	    Pokemon grahyena = new PokemonBuilder(262, "Grahyena")
	            .stats(70,90,70,60,60,70)
	            .ev(0,2,0,0,0,0)
	            .types(TYP.tenebre, null)
	            .learn(1, croc_fatal)
	            .learn(15, tranche_nuit)
	            .learn(25, machination)
	            .learn(40, nuit_noire)
	            .build();

	    Pokemon medhyena = new PokemonBuilder(261, "Médhyena")
	            .stats(35,55,35,30,30,35)
	            .ev(0,1,0,0,0,0)
	            .types(TYP.tenebre, null)
	            .learn(1, croc_fatal)
	            .learn(8, tranche_nuit)
	            .learn(15, machination)
	            .evol(18, grahyena)
	            .build();

	    Pokemon laggron = new PokemonBuilder(260, "Laggron")
	            .stats(100,110,90,85,90,60)
	            .ev(0,3,0,0,0,0)
	            .types(TYP.eau, TYP.sol)
	            .learn(1, pistolet_eau)
	            .learn(15, surf)
	            .learn(25, seisme)
	            .learn(40, hydrocanon)
	            .learn(52, excavation)
	            .build();

	    Pokemon flobio = new PokemonBuilder(259, "Flobio")
	            .stats(70,85,70,60,70,50)
	            .ev(0,2,0,0,0,0)
	            .types(TYP.eau, TYP.sol)
	            .learn(1, pistolet_eau)
	            .learn(15, surf)
	            .learn(25, seisme)
	            .evol(36, laggron)
	            .build();

	    Pokemon gobou = new PokemonBuilder(258, "Gobou")
	            .stats(50,70,50,50,50,40)
	            .ev(0,1,0,0,0,0)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(8, bulles_eau)
	            .learn(15, surf)
	            .evol(16, flobio)
	            .build();

	    Pokemon brasegali = new PokemonBuilder(257, "Braségali")
	            .stats(80,120,70,110,70,80)
	            .ev(0,3,0,0,0,0)
	            .types(TYP.feu, TYP.combat)
	            .learn(1, flammèche)
	            .learn(15, poing_feu)
	            .learn(25, lance_flamme)
	            .learn(40, close_combat)
	            .learn(52, cremation)
	            .build();

	    Pokemon galifeu = new PokemonBuilder(256, "Galifeu")
	            .stats(60,85,60,85,60,55)
	            .ev(0,2,0,0,0,0)
	            .types(TYP.feu, TYP.combat)
	            .learn(1, flammèche)
	            .learn(15, poing_feu)
	            .learn(25, lance_flamme)
	            .evol(36, brasegali)
	            .build();

	    Pokemon poussifeu = new PokemonBuilder(255, "Poussifeu")
	            .stats(45,60,40,70,50,45)
	            .ev(0,1,0,0,0,0)
	            .types(TYP.feu, null)
	            .learn(1, flammèche)
	            .learn(8, danse_flamme)
	            .learn(15, roue_feu)
	            .evol(16, galifeu)
	            .build();

	    Pokemon jungko = new PokemonBuilder(254, "Jungko")
	            .stats(70,85,65,105,85,120)
	            .ev(0,0,0,0,0,3)
	            .types(TYP.plante, null)
	            .learn(1, fouet_liane)
	            .learn(15, tranch_herbe)
	            .learn(25, lance_soleil)
	            .learn(40, tranch_feuille)
	            .learn(52, synthesis)
	            .build();

	    Pokemon massko = new PokemonBuilder(253, "Massko")
	            .stats(50,65,45,85,65,95)
	            .ev(0,0,0,0,0,2)
	            .types(TYP.plante, null)
	            .learn(1, fouet_liane)
	            .learn(15, tranch_herbe)
	            .learn(25, rayon_soleil)
	            .evol(36, jungko)
	            .build();

	    Pokemon arcko = new PokemonBuilder(252, "Arcko")
	            .stats(40,45,35,65,55,70)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.plante, null)
	            .learn(1, fouet_liane)
	            .learn(8, croissance)
	            .learn(15, tranch_herbe)
	            .evol(16, massko)
	            .build();

	    // GEN 1 & 2
	    Pokemon grolem = new PokemonBuilder(76, "Grolem")
	            .stats(80,120,130,55,65,45)
	            .ev(0,0,3,0,0,0)
	            .types(TYP.roche, TYP.sol)
	            .learn(1, jet_pierres)
	            .learn(15, seisme)
	            .learn(25, tete_pierre)
	            .learn(40, explosion_roc)
	            .learn(52, eboulement)
	            .build();

	    Pokemon gravalanch = new PokemonBuilder(75, "Gravalanch")
	            .stats(55,95,115,45,45,35)
	            .ev(0,0,2,0,0,0)
	            .types(TYP.roche, TYP.sol)
	            .learn(1, jet_pierres)
	            .learn(15, seisme)
	            .learn(25, eboulement)
	            .evol(46, grolem) //EVOLCUSTOM
	            .build();

	    Pokemon racaillou = new PokemonBuilder(74, "Racaillou")
	            .stats(40,80,100,30,30,20)
	            .ev(0,0,1,0,0,0)
	            .types(TYP.roche, TYP.sol)
	            .learn(1, jet_pierres)
	            .learn(10, seisme)
	            .learn(18, eboulement)
	            .evol(25, gravalanch)
	            .build();

	    Pokemon akwakwak = new PokemonBuilder(55, "Akwakwak")
	            .stats(80,82,78,95,80,85)
	            .ev(0,0,0,2,0,0)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(15, surf)
	            .learn(25, psyko)
	            .learn(40, hydrocanon)
	            .learn(52, aqua_queue)
	            .build();

	    Pokemon psykokwak = new PokemonBuilder(54, "Psykokwak")
	            .stats(50,52,48,65,50,55)
	            .ev(0,0,0,1,0,0)
	            .types(TYP.eau, null)
	            .learn(1, pistolet_eau)
	            .learn(10, confusion)
	            .learn(20, surf)
	            .evol(33, akwakwak)
	            .build();

	    Pokemon raichu = new PokemonBuilder(26, "Raichu")
	            .stats(60,90,55,90,80,110)
	            .ev(0,0,0,0,0,3)
	            .types(TYP.electrique, null)
	            .learn(1, eclair)
	            .learn(15, tonnerre)
	            .learn(25, poing_eclair)
	            .learn(40, fatal_foudre)
	            .learn(52, charge)
	            .build();

	    Pokemon pikachu = new PokemonBuilder(25, "Pikachu")
	            .stats(35,55,40,50,50,90)
	            .ev(0,0,0,0,0,2)
	            .types(TYP.electrique, null)
	            .learn(1, eclair)
	            .learn(10, tonnerre)
	            .learn(20, poing_eclair)
	            .evol(33, raichu) //EVOLCUSTOM
	            .build();

	    Pokemon pichu = new PokemonBuilder(172, "Pichu")
	            .stats(20,40,15,35,35,60)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.electrique, null)
	            .learn(1, eclair)
	            .learn(8, onde_choc)
	            .evol(12, pikachu) //EVOLCUSTOM
	            .build();

	    Pokemon feunard = new PokemonBuilder(38, "Feunard")
	            .stats(73,76,75,81,100,100)
	            .ev(0,0,0,0,1,1)
	            .types(TYP.feu, null)
	            .learn(1, flammèche)
	            .learn(15, lance_flamme)
	            .learn(25, abrasion)
	            .learn(40, cremation)
	            .learn(52, deflagration)
	            .build();

	    Pokemon goupix = new PokemonBuilder(37, "Goupix")
	            .stats(38,41,40,50,65,65)
	            .ev(0,0,0,0,1,0)
	            .types(TYP.feu, null)
	            .learn(1, flammèche)
	            .learn(10, danse_flamme)
	            .learn(20, lance_flamme)
	            .evol(22, feunard) //EVOLCUSTOM
	            .build();

	    Pokemon grodoudou = new PokemonBuilder(40, "Grodoudou")
	            .stats(140,70,45,85,50,45)
	            .ev(3,0,0,0,0,0)
	            .types(TYP.normal, null)
	            .learn(1, tackle)
	            .learn(15, berceuse)
	            .learn(25, rugissement)
	            .learn(40, hyper_beam)
	            .build();

	    Pokemon rondoudou = new PokemonBuilder(39, "Rondoudou")
	            .stats(115,45,20,45,25,20)
	            .ev(2,0,0,0,0,0)
	            .types(TYP.normal, null)
	            .learn(1, tackle)
	            .learn(10, berceuse)
	            .learn(20, rugissement)
	            .evol(39, grodoudou) //EVOLCUSTOM
	            .build();

	    Pokemon toudoudou = new PokemonBuilder(174, "Toudoudou")
	            .stats(90,30,15,40,20,15)
	            .ev(2,0,0,0,0,0)
	            .types(TYP.normal, null)
	            .learn(1, tackle)
	            .learn(8, berceuse)
	            .evol(18, rondoudou) //EVOLCUSTOM
	            .build();

	    Pokemon joliflor = new PokemonBuilder(182, "Joliflor")
	            .stats(75,80,95,90,100,50)
	            .ev(0,0,0,0,3,0)
	            .types(TYP.plante, null)
	            .learn(1, fouet_liane)
	            .learn(15, poudre_dodo)
	            .learn(25, synthesis)
	            .learn(40, lance_soleil)
	            .learn(52, tranch_feuille)
	            .build();

	    Pokemon rafflesia = new PokemonBuilder(45, "Rafflesia")
	            .stats(75,80,85,110,90,50)
	            .ev(0,0,0,3,0,0)
	            .types(TYP.plante, TYP.poison)
	            .learn(1, fouet_liane)
	            .learn(15, poudre_toxik)
	            .learn(25, lance_soleil)
	            .learn(40, acide)
	            .learn(52, ball_poison)
	            .build();

	    Pokemon ortide = new PokemonBuilder(44, "Ortide")
	            .stats(60,65,70,85,75,40)
	            .ev(0,0,0,2,0,0)
	            .types(TYP.plante, TYP.poison)
	            .learn(1, fouet_liane)
	            .learn(15, poudre_toxik)
	            .learn(25, acide)
	            .evol(42, rafflesia) //EVOLCUSTOM
	            .build();

	    Pokemon mystherbe = new PokemonBuilder(43, "Mystherbe")
	            .stats(45,50,55,75,65,30)
	            .ev(0,0,0,1,0,0)
	            .types(TYP.plante, TYP.poison)
	            .learn(1, fouet_liane)
	            .learn(8, poudre_toxik)
	            .learn(15, acide)
	            .evol(21, ortide)
	            .build();

	    Pokemon dodrio = new PokemonBuilder(85, "Dodrio")
	            .stats(60,110,70,60,60,110)
	            .ev(0,3,0,0,0,0)
	            .types(TYP.normal, TYP.vol)
	            .learn(1, tornade)
	            .learn(15, aeropique)
	            .learn(25, tranche_air)
	            .learn(40, vol)
	            .learn(52, ouragan)
	            .build();

	    Pokemon doduo = new PokemonBuilder(84, "Doduo")
	            .stats(35,85,45,35,35,75)
	            .ev(0,2,0,0,0,0)
	            .types(TYP.normal, TYP.vol)
	            .learn(1, tornade)
	            .learn(10, aeropique)
	            .learn(20, tranche_air)
	            .evol(31, dodrio)
	            .build();

	    Pokemon nostenfer = new PokemonBuilder(169, "Nostenfer")
	            .stats(85,90,80,70,80,130)
	            .ev(0,0,0,0,0,3)
	            .types(TYP.poison, TYP.vol)
	            .learn(1, croc_poison)
	            .learn(15, tranche_air)
	            .learn(25, ball_poison)
	            .learn(40, vol)
	            .learn(52, pique)
	            .build();

	    Pokemon nosferalto = new PokemonBuilder(42, "Nosféralto")
	            .stats(75,80,70,65,75,90)
	            .ev(0,0,0,0,0,2)
	            .types(TYP.poison, TYP.vol)
	            .learn(1, croc_poison)
	            .learn(15, tranche_air)
	            .learn(25, acide)
	            .evol(46, nostenfer) //EVOLCUSTOM
	            .build();

	    Pokemon nosferapti = new PokemonBuilder(41, "Nosferapti")
	            .stats(40,45,35,30,40,55)
	            .ev(0,0,0,0,0,1)
	            .types(TYP.poison, TYP.vol)
	            .learn(1, croc_poison)
	            .learn(10, tranche_air)
	            .learn(18, acide)
	            .evol(22, nosferalto)
	            .build();

	    Pokemon tentacruel = new PokemonBuilder(73, "Tentacruel")
	            .stats(80,70,65,80,120,100)
	            .ev(0,0,0,0,2,0)
	            .types(TYP.eau, TYP.poison)
	            .learn(1, pistolet_eau)
	            .learn(15, acide)
	            .learn(25, surf)
	            .learn(40, toxic)
	            .learn(52, hydrocanon)
	            .build();

	    Pokemon tentacool = new PokemonBuilder(72, "Tentacool")
	            .stats(40,40,35,50,100,70)
	            .ev(0,0,0,0,1,0)
	            .types(TYP.eau, TYP.poison)
	            .learn(1, pistolet_eau)
	            .learn(10, acide)
	            .learn(20, surf)
	            .evol(30, tentacruel)
	            .build();

	    Pokemon lanturn = new PokemonBuilder(171, "Lanturn")
	            .stats(125,58,58,76,76,67)
	            .ev(2,0,0,0,0,0)
	            .types(TYP.eau, TYP.electrique)
	            .learn(1, pistolet_eau)
	            .learn(15, eclair)
	            .learn(25, surf)
	            .learn(40, tonnerre)
	            .learn(52, hydrocanon)
	            .build();

	    Pokemon loupio = new PokemonBuilder(170, "Loupio")
	            .stats(75,38,38,56,56,67)
	            .ev(1,0,0,0,0,0)
	            .types(TYP.eau, TYP.electrique)
	            .learn(1, pistolet_eau)
	            .learn(10, eclair)
	            .learn(20, surf)
	            .evol(27, lanturn)
	            .build();

	    Pokemon corayon = new PokemonBuilder(222, "Corayon")
	            .stats(55,55,85,65,85,35)
	            .ev(0,0,1,0,1,0)
	            .types(TYP.eau, TYP.roche)
	            .learn(1, pistolet_eau)
	            .learn(10, jet_pierres)
	            .learn(20, surf)
	            .learn(35, eboulement)
	            .build();
	    
	}
	
	public static void main(String[] args) {
		Init();	
	}
}
