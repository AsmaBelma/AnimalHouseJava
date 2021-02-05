public class Chat extends Animal2{
    public Chat(String nom) {super(nom);}
    public Chat(String nom,int age) {super(nom,age);}
    public void affiche(){
        System.out.println("je suis un chat");
        super.affiche();
    }
}