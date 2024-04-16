import java.util.*;

public class Zoo{
	static List<AnimalAquatique> aquatiques = new ArrayList<AnimalAquatique>();//liste de tous les animaux aquatiques déclarés
	static List<AnimalTerrestre> terrestres = new ArrayList<AnimalTerrestre>();//liste de tous les animaux terrestres déclarés
	static List<AnimalVolant> volants = new ArrayList<AnimalVolant>();//liste de tous les animaux volants déclarés
	static List<Aquarium> aquariums = new ArrayList<Aquarium>();//liste de tous les aquariums déclarés
	static List<Champ> champs = new ArrayList<Champ>();//liste de tous les champs déclarés
	static List<Voliere> volieres = new ArrayList<Voliere>();//liste de toutes les volieres déclarés
	static List<Soigneur> soigneurs = new ArrayList<Soigneur>();//liste de tous les soigneurs déclarés
	static List<Administratif> administratifs = new ArrayList<Administratif>();//liste de tous les administratifs déclarés

	//Affiche la liste de tous les animaux aquatiques déclarés
	public static void showAllAquatiques(){
		System.out.println("");
		System.out.println("Tous les animaux Aquatiques :");
		for (AnimalAquatique a : aquatiques) {
			System.out.println(a.toString());
		}
	}
	//Affiche la liste de tous les animaux terrestres déclarés
	public static void showAllTerrestres(){
		System.out.println("");
		System.out.println("Tous les animaux Terrestres :");
		for (AnimalTerrestre a : terrestres) {
			System.out.println(a.toString());
		}
	}
	//Affiche la liste de tous les animaux volants déclarés
	public static void showAllVolants(){
		System.out.println("");
		System.out.println("Tous les animaux Volants :");
		for (AnimalVolant a : volants) {
			System.out.println(a.toString());
		}
	}
	//Affiche la liste de tous les animaux déclarés
	public static void showAllAnimaux(){
		System.out.println("");
		System.out.println("Tous les Animaux :");
		for (AnimalAquatique a : aquatiques) {
			System.out.println(a.toString());
		}
		for (AnimalTerrestre a : terrestres) {
			System.out.println(a.toString());
		}
		for (AnimalVolant a : volants) {
			System.out.println(a.toString());
		}
	}

	//Affiche la liste de tous les aquariums déclarés
	public static void showAllAquariums(){
		System.out.println("");
		System.out.println("Tous les Aquariums :");
		for (Aquarium a : aquariums) {
			System.out.println(a.toString());
		}
	}
	//Affiche la liste de tous les champs déclarés
	public static void showAllChamps(){
		System.out.println("");
		System.out.println("Tous les Champs :");
		for (Champ c : champs) {
			System.out.println(c.toString());
		}
	}
	//Affiche la liste de toutes les volieres déclarés
	public static void showAllVolieres(){
		System.out.println("");
		System.out.println("Tous les Volieres :");
		for (Voliere v : volieres) {
			System.out.println(v.toString());
		}
	}
	//Affiche la liste de tous les enclos déclarés
	public static void showAllEnclos(){
		System.out.println("");
		System.out.println("Tous les Enclos :");
		for (Aquarium a : aquariums) {
			System.out.println(a.toString());
		}
		for (Champ c : champs) {
			System.out.println(c.toString());
		}
		for (Voliere v : volieres) {
			System.out.println(v.toString());
		}
	}

	//Affiche la liste de tous les soigneurs déclarés
	public static void showAllSoigneurs(){
		System.out.println("");
		System.out.println("Tous les Soigneurs :");
		for (Soigneur s : soigneurs) {
			System.out.println(s.toString());
		}
	}
	//Affiche la liste de tous les administratifs déclarés
	public static void showAllAdministratifs(){
		System.out.println("");
		System.out.println("Tous les Soigneurs :");
		for (Administratif a : administratifs) {
			System.out.println(a.toString());
		}
	}
	//Affiche la liste de tout le personnel du zoo déclaré
	public static void showAllPersonnels(){
		System.out.println("");
		System.out.println("Tous les Personnels :");
		for (Soigneur s : soigneurs) {
			System.out.println(s.toString());
		}
		for (Administratif a : administratifs) {
			System.out.println(a.toString());
		}
	}

	public static void main(String[] args) {
		//Déclaration des animaux
		Girafe g1 = new Girafe("Melmann");
		terrestres.add(g1);
		Girafe g2 = new Girafe("Zarafa");
		terrestres.add(g2);
		Elephant e = new Elephant("Babar");
		terrestres.add(e);
		Dauphin d1 = new Dauphin("Flipper");
		aquatiques.add(d1);
		Dauphin d2 = new Dauphin("Nelly");
		aquatiques.add(d2);
		Poisson po1 = new Poisson("Nemo");
		aquatiques.add(po1);
		Poisson po2 = new Poisson("Bruce");
		aquatiques.add(po2);
		Poisson po3 = new Poisson("Bubbles");
		aquatiques.add(po3);
		Poisson po4 = new Poisson("Marin");
		aquatiques.add(po4);
		Poisson po5 = new Poisson("Gill");
		aquatiques.add(po5);
		Pelican pel1 = new Pelican("Josey");
		volants.add(pel1);
		Pelican pel2 = new Pelican("Patrick");
		volants.add(pel2);
		Perroquet p1 = new Perroquet("Blu");
		volants.add(p1);
		Perroquet p2 = new Perroquet("Picchu");
		volants.add(p2);
		Lion l1 = new Lion("Diego");
		terrestres.add(l1);
		Lion l2 = new Lion("Nala");
		terrestres.add(l2);
		Pingouin pi1 = new Pingouin("Rico");
		aquatiques.add(pi1);
		Pingouin pi2 = new Pingouin("Maurice");
		aquatiques.add(pi2);
		Pingouin pi3 = new Pingouin("Skipper");
		aquatiques.add(pi3);
		Aigle a1 = new Aigle("Sitka");
		volants.add(a1);
		Aigle a2 = new Aigle("Kenai");
		volants.add(a2);

		//Déclaration des enclos
		Champ ch1 = new Champ("Plaine",5);
		champs.add(ch1);
		ch1.addAnimal(g1);
		ch1.addAnimal(g2);
		ch1.addAnimal(e);
		Champ ch2 = new Champ("Savane",4);
		champs.add(ch2);
		ch2.addAnimal(l1);
		ch2.addAnimal(l2);
		Aquarium aq1 = new Aquarium("Delphinarium",3);
		aquariums.add(aq1);
		aq1.addAnimal(d1);
		aq1.addAnimal(d2);
		Aquarium aq2 = new Aquarium("Bassin",6);
		aquariums.add(aq2);
		aq2.addAnimal(po1);
		aq2.addAnimal(po2);
		aq2.addAnimal(po3);
		aq2.addAnimal(po4);
		aq2.addAnimal(po5);
		Aquarium aq3 = new Aquarium("Piscine",4);
		aquariums.add(aq3);
		aq3.addAnimal(pi1);
		aq3.addAnimal(pi2);
		aq3.addAnimal(pi3);
		Voliere vo1 = new Voliere("Cage de vol",4);
		volieres.add(vo1);
		vo1.addAnimal(pel1);
		vo1.addAnimal(pel2);
		vo1.addAnimal(p1);
		vo1.addAnimal(p2);
		Voliere vo2 = new Voliere("Falaise",3);
		volieres.add(vo2);
		vo2.addAnimal(a1);
		vo2.addAnimal(a2);

		//Déclaration du personnel du zoo
		Soigneur s1 = new Soigneur("Jeremy",1954.5,ch1);
		soigneurs.add(s1);
		Soigneur s2 = new Soigneur("Christelle",1806,aq1);
		soigneurs.add(s2);
		Soigneur s3 = new Soigneur("Jean-Luc",2047.76,aq3);
		soigneurs.add(s3);
		Soigneur s4 = new Soigneur("Emma",1970.4,vo1);
		soigneurs.add(s4);
		Administratif ad = new Administratif("Vincent",1851);
		administratifs.add(ad);

		//Déclaration des denrées
		Denree de1 = new Denree("Botte de foin",30000);
		Denree de2 = new Denree("Viande",5000);
		Denree de3 = new Denree("Sardines",400);
		Denree de4 = new Denree("Fruits",750);
		Denree de5 = new Denree("Petit gibier",500);
		Denree de6 = new Denree("Mollusques",200);

		//Test des méthodes
		s1.soigner(l1,de2);
		s1.soigner(e,de1);
		s1.soignerAll(de1);
		s1.soignerAll(de1);
		s1.soigner(e,de1);

		ad.affecterSoigneur(s1,ch2);
		s1.move(l1,ch1);
		ad.affecterAnimal(l1,s1,ch1);
		ad.affecterAnimal(l2,s1,ch1);
		s1.moveAll(ch1);

		ad.affecterSoigneur(s2,ch1);
		ad.affecterAnimal(l1,s2,ch2);
		ad.affecterAnimal(l2,s2,ch2);
		s2.move(l1,ch2);
		s2.move(l2,ch2);
		s1.soignerAll(de2);

		s3.soignerAll(de3);
		ad.affecterSoigneur(s3,aq1);
		s3.soignerAll(de3);
		s3.soignerAll(de3);
		ad.affecterSoigneur(s3,aq2);
		s3.soignerAll(de6);

		ad.affecterSoigneur(s4,vo2);
		s4.soigner(a2,de5);
		s4.soignerAll(de5);

		ad.affecterSoigneur(s4,vo1);
		s4.soigner(pel1,de3);
		s4.soigner(pel2,de3);
		s4.soigner(p1,de4);
		s4.soigner(p2,de4);
		
		ad.printAllSalaries(soigneurs, administratifs);

		//Listage des éléments par types
		Zoo.showAllAquatiques();
		Zoo.showAllTerrestres();
		Zoo.showAllVolants();
		Zoo.showAllAnimaux();

		Zoo.showAllAquariums();
		Zoo.showAllChamps();
		Zoo.showAllVolieres();
		Zoo.showAllEnclos();

		Zoo.showAllSoigneurs();
		Zoo.showAllAdministratifs();
		Zoo.showAllPersonnels();
	}
}