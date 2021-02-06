abstract public class Animal2{

    private String name;
    private int age;
    private boolean alive;
    static int counter=0;
    private int number;
    abstract public void noise ();

    public Animal2(String chaine)
    {
	    alive=true;
	    name=chaine;
	    age =0;
        counter++;
	    number=counter;
    }


    public  Animal2(String chaine,int age){
	    this.age =age;
	    alive=true;
	    name=chaine;
        counter++;
	    number=counter;
    }

    public String getname(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void older_one_animal(){
	    age++;
	    System.out.println(" now the animal is " +name+" a " + age +" years old"); 
    }

    void older_all_animal(int inc){
	    age+=inc;
	    System.out.println(" now the animal is " +name+" a " + age+" years old"); 
    }

    void killAnimal(){
        alive=false;
    }

    void affiche_animal(){

	public String toString(){
        String msg="my name is " +name+" number" + " age "+ age;
	    if (alive)
	        msg+="animal alive" ;
	    else 
	        msg+="animal dead" ;
	return msg;
    }
}

