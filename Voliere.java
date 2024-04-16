public class Voliere extends Enclos {
	public Voliere(String n, int c){
		super(n,c);
	}
	//Surcharge de la méthode toString de Enclos
	@Override public String toString(){
		return super.toString()+" et accueille des animaux volants.";
	}
	//Ajoute un animal du type volant dans l'enclos
	@Override public void addAnimal(Animal a){
		if (a instanceof AnimalVolant){
			super.addAnimal(a);
		}
		else System.out.println(a.getNom()+" ne peut pas vivre dans une voliere.");
	}
	//Retire un animal de l'enclos
	@Override public void removeAnimal(Animal a){
		if (a instanceof AnimalVolant){
			super.removeAnimal(a);
		}
	}
}