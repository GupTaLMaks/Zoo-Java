import java.util.*;

public class Enclos {
	private String nom;//nom de l'enclos
	private int capacite;//capacité max de l'enclos
	private Vector<Animal> animaux;//animaux contenus dans l'enclos

	public Enclos(String n, int c){
		this.nom = n;
		this.capacite = c;
		this.animaux = new Vector<Animal>();
	}
	public String getNom(){
		return this.nom;
	}
	public int getCapacite(){
		return this.capacite;
	}
	public Vector<Animal> getAnimaux(){
		return this.animaux;
	}
	public void setNom(String n){
		this.nom = n;
	}
	public void setCapacite(int c){
		this.capacite = c;
	}
	
	public String toString(){
		return this.nom+" a une capacite max de "+this.capacite;
	}
	//Ajoute un animal au vecteur animaux
	public void addAnimal(Animal a){
		animaux.add(a);
	}
	//Retire un animal au vecteur animaux
	public void removeAnimal(Animal a){
		animaux.remove(a);
	}
}