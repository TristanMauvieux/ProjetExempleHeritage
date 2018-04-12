package fr.diginamic.ProjetExempleHeritage.regime;

import fr.diginamic.ProjetExempleHeritage.Aliment.Aliment;

public class Herbivore extends Regime {

	public Herbivore() {
		super();
	}

	@Override
	public void manger(Aliment aliment) {
		if(!aliment.getViande()) {
			System.out.println("j'ai manger "+ aliment.getNom());
		}else {
			System.out.println(" je ne peux pas manger ça ! Je ne veux pas manger ça !");
		}
		
	}
	

	
	
	
}
