package fr.diginamic.ProjetExempleHeritage.animaux;

import fr.diginamic.ProjetExempleHeritage.regime.Carnivore;
import fr.diginamic.ProjetHeritage.animal.Animal;

public class Lion extends Animal{

	public Lion(int age, float poids, int taille) {
		super(age, poids, taille,"",new Carnivore());
	}
	

}
