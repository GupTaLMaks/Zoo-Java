public class AnimalVolant extends Animal implements Deplacement{
	public AnimalVolant(String n, double bc) {
		super(n,bc);
	}
	//Surcharge de la méthode seDeplacer de l'interface Deplacement en fonction du type 
	@Override public void seDeplacer(){
           System.out.println(super.getNom() +" se deplace en volant.");
    }
}