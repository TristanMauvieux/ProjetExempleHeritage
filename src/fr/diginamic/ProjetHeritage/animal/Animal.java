package fr.diginamic.ProjetHeritage.animal;

import javax.swing.GroupLayout.Alignment;

import fr.diginamic.ProjetExempleHeritage.Aliment.Aliment;

public abstract class Animal {
	
	private int age;
	private float poids;
	private int taille; // taille en cm
	private String regime;
	

	
	public Animal() {
		this(0, 0, 0);
	}
	
	
	
	public Animal(int age, float poids, int taille) {
		this.age = age;
		this.poids = poids;
		this.taille = taille;
	}



	public void deplacer() {
		System.out.println("je me deplace");
	}
	
	private void manger(Aliment aliment) {
		// TODO Auto-generated method stub

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	

}
