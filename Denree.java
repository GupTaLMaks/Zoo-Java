public class Denree{
	private String nom;//nom de la denrée
	private double cal;//calories contenues dans la denrée
	
	public Denree(String nom, double cal){
		this.nom=nom;
		this.cal=cal;
	}
	public String getNom() {
		return this.nom;
	}
	public double getCal() {
		return this.cal;
	}
	public void setNom(String nom){
		this.nom = nom;
	}
	public void setCal(double cal){
		this.cal = cal;
	}
	public String toString(){
		return this.nom+" contient "+this.cal+" calories.";
	}
}