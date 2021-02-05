public class Animal {
	private String nom;
	private int age;
	private boolean vivant;
	public Animal(){
		nom="Absent";
		age=0;
		vivant=true;
	}
	public Animal(String chaine, int valeur){
		nom=chaine;
		age=valeur;
		vivant=true;
	}
}
