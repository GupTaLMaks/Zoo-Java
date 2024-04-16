public class Animal implements Nourriture{
	private String nom;//nom de l'animal
	private double besoinCal;//besoin calorique de l'animal par jour
	private boolean canMove;//autorisation d'être déplacer par un soigneur
	private double calAbs;//calories absorbées par l'animal

	public Animal(String n, double bc){
		this.nom=n;
		this.besoinCal=bc;
		this.canMove=false;
		this.calAbs=0;
	}
	public String getNom(){
		return this.nom;
	}
	public double getBesoinCal(){
		return this.besoinCal;
	}
	public boolean getCanMove(){
		return this.canMove;
	}
	public double getCalAbs(){
		return this.calAbs;
	}
	public void setNom(String n){
		this.nom = n;
	}
	public void setBesoinCal(double bc){
		this.besoinCal = bc;
	}
	public void setCanMove(boolean cm){
		this.canMove = cm;
	}
	public void setCalAbs(double ca){
		this.calAbs = ca;
	}
	public String toString(){
		return getClass().getName()+" \""+this.nom +"\" a besoin de " + this.besoinCal + " calories par jour.";
	}
	//Surcharge de la méthode manger de l'interface Nourriture
	@Override public void manger(double cal){
		if (this.besoinCal>this.calAbs) {
			System.out.println(this.nom+" a mange "+cal+" calories.");
			this.calAbs+=cal;
		}
		else System.out.println(this.nom+" est repu pour aujourd'hui !");	
	}
}