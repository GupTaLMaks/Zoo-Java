import java.util.*;

public class Administratif extends Personnel{
	public Administratif(String n, double s){
		super(n,s);
	}
	//Surcharge de la méthode toString de Personnel
	@Override public String toString(){
		return super.toString()+ "et est en charge de la partie administrative.";
	}
	//Affecte un enclos à un soigneur
	public void affecterSoigneur(Soigneur s, Enclos e){
		System.out.println(s.getNom()+" a ete affecte a l'enclos "+e.getNom()+".");
		s.setEnclos(e);
	}
	//Affecte un animal à un enclos 
	public void affecterAnimal(Animal a, Soigneur s, Enclos e){
		if (e.getAnimaux().size()<e.getCapacite()) {
			a.setCanMove(true);
			System.out.println(a.getClass().getName()+" "+a.getNom()+" a ete affecte a l'enclos "+e.getNom()+". Le soigneur "+s.getNom()+" doit le transferer.");
		}
		else if(e.getAnimaux().size()>=e.getCapacite()) System.out.println("L'enclos "+e.getNom()+" est plein !");
	}
	//Affiche le salaire d'un employé donné en paramètres
	public void printSalary(Personnel p){
		System.out.println(p.getNom()+" touche un salaire de "+p.getSalaire()+" euros.");
	}
	//Affiche le salaire de tous les employés
	public void printAllSalaries(List<Soigneur> listS, List<Administratif> listA){
		System.out.println("");
		System.out.println("Le salaire de chaque personnel du zoo :");
		for (Soigneur s : listS) {
			this.printSalary(s);
		}
		for (Administratif a : listA) {
			this.printSalary(a);
		}
	}
}