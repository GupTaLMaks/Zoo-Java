public class Personnel {
	private String nom;//nom de l'employé
	private double salaire;//salaire de l'employé
	
	public Personnel(String n, double s){
		this.nom=n;
		this.salaire=s;
	}
	public String getNom(){
		return this.nom;
	}
	public double getSalaire(){
		return this.salaire;
	}
	public void setNom(String n){
		this.nom=n;
	}
	public void setSalaire(double s){
		this.salaire=s;
	}
	public String toString(){
		return this.nom+" travaille au zoo pour "+this.salaire+" euros ";
	}
}