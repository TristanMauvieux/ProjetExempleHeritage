package fr.diginamic.ProjetExempleHeritage.animaux;

import fr.diginamic.ProjetHeritage.animal.Animal;

public class Homme extends Animal{

	public Homme() {
		super();
	}
	
	public Homme(int age, float poids, int taille) {
		super(age, poids, taille);
	}
}
