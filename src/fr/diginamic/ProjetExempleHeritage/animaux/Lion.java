package fr.diginamic.ProjetExempleHeritage.animaux;

import fr.diginamic.ProjetExempleHeritage.regime.Carnivore;

public class Lion extends Carnivore{

	public Lion(int age, float poids, int taille) {
		super(age, poids, taille);
	}
	
	public Lion() {
		super();
	}
}
