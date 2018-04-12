package fr.diginamic.ProjetExempleHeritage.regime;

import fr.diginamic.ProjetHeritage.animal.Animal;

public abstract class Omnivore extends Animal {

	public Omnivore(int age, float poids, int taille) {
		super(age, poids, taille);
	}
	
	public Omnivore() {
		super();
	}
}
