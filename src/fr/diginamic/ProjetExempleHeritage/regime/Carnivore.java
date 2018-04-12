package fr.diginamic.ProjetExempleHeritage.regime;

import fr.diginamic.ProjetHeritage.animal.Animal;

public abstract class Carnivore extends Animal {

	public Carnivore() {
		super();
	}
	
	public Carnivore(int age, float poids, int taille) {
		super(age, poids, taille);
	}
}
