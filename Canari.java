public class Canari extends Animal2{
    public Canari(String nom) {super(nom);}
    public Canari(String nom,int age) {super(nom,age);}
    public void affiche(){
        System.out.println("je suis un canari");
        super.affiche();
    }
}
