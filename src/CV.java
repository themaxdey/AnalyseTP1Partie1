

public class CV {
	private String nom;
	private String prenom;
	private String formation;
	private int experience;
	private String[] competences;
	private String attentes;
	
	
	
	public static void main(String[] args) {
		System.out.println("Bienvenue chez Barette !");
				
		String[] tabCompetMaxime = {"Web", "Java", "MySQL", "Paint"};
		CV cvMaxime = new CV ("Maxime", "Dery", "Professionel", 2, tabCompetMaxime, "Apprendre a produire des bons logiciels");
		
		String[] tabCompetHamza = {"Programmateur", "Java", "HTML", "Photoshop"};
		CV cvHamza = new CV ("Hamza", "Nassime", "Talentueux", 2, tabCompetHamza, "Passer le cours");
		
		cvMaxime.affiche();
		System.out.println("------------------");
		cvHamza.affiche();
	}
	
	public void affiche() {
		System.out.println("Nom : " + nom);
		System.out.println("Prenom : " + prenom);
		System.out.println("Formation : " + formation);
		System.out.println("Exp�riences de travail : " + experience);
		
		System.out.print("Comp�tences : ");
		for (int i = 0; i < competences.length; i++) {
			String string = competences[i];	
			
			if (i == competences.length - 1) {
				System.out.print(string + " ");
			} else {
				System.out.print(string + ", ");
			}
			
			
		}
		
		System.out.println("\nAttentes vis � vis le cours 4B4 : " + attentes);
		
	}

	public CV (String nom, String prenom, String formation, int experience, String[] competences, String attentes) {
		this.nom = nom;
		this.attentes = attentes;
		this.formation = formation;
		this.prenom = prenom;
		this.experience = experience;
		this.competences = competences;
	}
	
	
}
