
public class CV {
	private String nom;
	private String prenom;
	private String formation;
	private int experience;
	private String[] competences;
	private String attentes;
	
	
	
	public static void main(String[] args) {
		
	}
	
	public void affiche() {
		System.out.println("Nom : " + nom);
		System.out.println("Prenom : " + prenom);
		System.out.println("Formation : " + formation);
		System.out.println("Expériences de travail : " + experience);
		
		System.out.print("Compétences : ");
		for (int i = 0; i < competences.length; i++) {
			String string = competences[i];	
			
			if (i == competences.length - 1) {
				System.out.print(string + " ");
			} else {
				System.out.print(string + ", ");
			}
			
			
		}
		
		System.out.println("\nAttentes vis à vis le cours 4B4 : " + attentes);
		
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
