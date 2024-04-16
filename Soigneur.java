public class Soigneur extends Personnel {
	private Enclos enclos;//enclos dont le soigneur est chargé

	public Soigneur(String n, double s, Enclos e){
		super(n,s);
		this.enclos=e;
	}
	public Enclos getEnclos(){
		return this.enclos;
	}
	public void setEnclos(Enclos e){
		this.enclos=e;
	}
	//Surcharge de la méthode toString de Personnel
	@Override public String toString(){
		return super.toString()+ "en tant que soigneur de l'enclos "+this.enclos.getNom()+".";
	}
	//Nourrit un animal de l'enclos du soigneur
	public void soigner(Animal a, Denree d){
		Enclos es = this.enclos;
		if (!es.getAnimaux().contains(a)) System.out.println(a.getNom()+" n'est pas dans l'enclos "+es.getNom());
		else {
			System.out.println(super.getNom()+" a nourri "+a.getNom()+" avec "+d.getNom()+".");
			a.manger(d.getCal());
		}
	}
	//Nourrit tous les animaux de l'enclos du soigneur
	public void soignerAll(Denree d){
		System.out.println("");
		Enclos en = this.enclos;
		System.out.println(super.getNom()+" a nourri l'enclos "+en.getNom()+" avec "+d.getNom()+".");
		int n = 0;
		for (Animal a : en.getAnimaux()) {
			if(a.getBesoinCal()>a.getCalAbs()) n++;
		}
		double dcal = d.getCal()/n;
		for (Animal a : en.getAnimaux()) {
			if(a.getBesoinCal()>a.getCalAbs()) a.manger(dcal);
		}
	}
	//Déplace un animal de l'enclos du soigneur dans un enclos donné en paramètres
	public void move(Animal a, Enclos e){ //e : enclos destination
		Enclos en = this.enclos;
		if (!en.getAnimaux().contains(a)) System.out.println(a.getNom()+" n'est pas dans l'enclos "+en.getNom());
		else if (a.getCanMove()==true) {
			System.out.println(super.getNom()+" a tranfere "+ a.getClass().getName()+" \""+a.getNom()+"\" de l'enclos "+en.getNom()+" a l'enclos "+e.getNom()+".");
			en.removeAnimal(a);
			e.addAnimal(a);
			a.setCanMove(false);	
		}
		else System.out.println(super.getNom()+" ne peut pas tranfere "+ a.getClass().getName()+" \""+a.getNom()+"\" sans autorisation !");
	}
	//Déplace tous les animaux de l'enclos du soigneur dans un autre enclos donné en paramètres
	public void moveAll(Enclos e){ //e : enclos destination
		System.out.println("");
		Enclos en = this.enclos;
		boolean canMoveAll = true;
		for (Animal a : en.getAnimaux()) {
			if(!a.getCanMove()) canMoveAll=false;
		}
		if (canMoveAll) {
			System.out.println(super.getNom()+" a tranfere l'enclos "+en.getNom()+" dans l'enclos "+e.getNom()+".");
			for (Animal a : en.getAnimaux()) {
				e.addAnimal(a);
				a.setCanMove(false);
			}
			en.getAnimaux().clear();
			

		}
		else System.out.println("Le deplacement de certains animaux de l'enclos n'a pas ete autorise.");
	}
}