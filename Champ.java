public class Champ extends Enclos {
	public Champ(String n, int c){
		super(n,c);
	}
	//Surcharge de la méthode toString de Enclos
	@Override public String toString(){
		return super.toString()+" et accueille des animaux terrestres.";
	}
	//Ajoute un animal du type terrestre dans l'enclos
	@Override public void addAnimal(Animal a){
		if (a instanceof AnimalTerrestre){
			super.addAnimal(a);
		}
		else System.out.println(a.getNom()+" ne peut pas vivre dans un champ.");
	}
	//Retire un animal de l'enclos
	@Override public void removeAnimal(Animal a){
		if (a instanceof AnimalTerrestre){
			super.removeAnimal(a);
		}
	}
}