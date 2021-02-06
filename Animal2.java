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

    void older(){ // this works my animal is one year older with this fct
	    age++;
	    System.out.println(" now the animal is " +name+" a " + age +" years old"); 
    }

    // void older(int inc){
	//     age+=inc;
	//     System.out.println(" now the animal " +name+" is " + age+" years old"); 
    // }

    void kill(){
        alive=false;
    }

    void display(){
        System.out.println("my name is " +name+" number "+number+ " age "+ age);
        if (alive)
            System.out.println("  animal alive" );
        else 
            System.out.println("  animal dead" );
        noise();
        }

	public String toString(){
        String msg="my name is " +name+" number" + " age "+ age;
	    if (alive)
	        msg+="animal alive" ;
	    else 
	        msg+="animal dead" ;
	return msg;
    }
}

