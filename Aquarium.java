public class Aquarium extends Enclos {
	public Aquarium(String n, int c){
		super(n,c);	
	}
	//Surcharge de la méthode toString de Enclos
	@Override public String toString(){
		return super.toString()+" et accueille des animaux aquatiques.";
	}
	//Ajoute un animal du type aquatique dans l'enclos
	@Override public void addAnimal(Animal a){
		if (a instanceof AnimalAquatique){
			super.addAnimal(a);
		}
		else System.out.println(a.getNom()+" ne peut pas vivre dans un aquarium.");
	}
	//Retire un animal de l'enclos
	@Override public void removeAnimal(Animal a){
		if (a instanceof AnimalAquatique){
			super.removeAnimal(a);
		}
	}
}