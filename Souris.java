public class Souris extends Animal2{
    public Souris(String nom) {super(nom);}
    public Souris(String nom,int age) {super(nom,age);}
    public void affiche(){
        System.out.println("je suis une souris");
        super.affiche();
    }
}