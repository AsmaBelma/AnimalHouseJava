
abstract public class Animal2{

    private String nom;
    private int age;
    private boolean vivant;
    static int compteur=0;
    private int numero;
    abstract public void crier ();

    public Animal2(String chaine)
    {
	vivant=true;
	nom=chaine;
	age =0;
        compteur++;
	numero=compteur;
    }


    public  Animal2(String chaine,int age){
	this.age =age;
	vivant=true;
	nom=chaine;
        compteur++;
	numero=compteur;
    }
    public String getNom()
    { return nom;}

    void veillir(){
	age++;
	System.out.println(" Desormais l' animal " +nom+" a " + age +" ans"); 
    }
    void veillir(int inc){
	age+=inc;
	System.out.println(" Desormais l' animal " +nom+" a " + age+" ans"); 
    }

    void mourrir (){vivant=false;}

    void affiche_animal(){

	System.out.println("je m'appelle " +nom+" numero "+numero+ " age "+ age);
	if (vivant)
	    System.out.println("  animal vivant" );
	else 
	    System.out.println("  animal mort" );
	crier();
    }

    public String toString(){

	String msg="je m'appelle " +nom+" numero" + " age "+ age;
	if (vivant)
	    msg+="animal vivant" ;
	else 
	     msg+="animal mort" ;
	return msg;
    }
    void ajouter_animal(){

        System.out.println("je m'appelle " +nom+" numero "+numero+ " age "+ age);
        if (vivant)
            System.out.println("  animal vivant" );
        else 
            System.out.println("  animal mort" );
        crier();
        }

}
