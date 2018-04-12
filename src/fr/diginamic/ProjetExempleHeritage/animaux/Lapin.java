package fr.diginamic.ProjetExempleHeritage.animaux;

import fr.diginamic.ProjetExempleHeritage.regime.Herbivore;

public class Lapin extends Herbivore{

	public Lapin(int age, float poids, int taille) {
		super(age, poids, taille);
	}
	
	public Lapin() {
		super();
	}
}
