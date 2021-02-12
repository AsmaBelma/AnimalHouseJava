import java.io; //system out 
import java.util.*; //use des vecteurs 
public class GestionAnimalHouse {

    public static void main (String args[])
    {
        Vector animalhouse = new Vector();
        while(true) {
            print_menu();
            int option = readInt();
            switch (option) {
                case 1 : animalhouse.addElement(createAnimalhouse());break;
                case 2 : add(animalhouse);break;
                case 2 : older_one_animal(animalhouse);break;
                case 3 : older_all_animal(animalhouse);break;
                case 4 : kill_animal(animalhouse);break;
                case 5 : search_animal(animalhouse);break;
                case 6 : printAnimal(animalhouse);break;
                case 0 : System.exit(0);
                default : 
                    System.out.println("non existant option, start again");
            }
        }
    }
// creation animalerie
    public static AnimalHouseVector createAnimalHouse(){
        System.out.println("give the name of your animal house");
        String name = readString();
        return new AnimalHouseVector(name);
    }

//chercher une animalerie  
    public static AnimalHouseVector find (Vector animalhouse){
        if (animalhouse.isEmpty()}
        {
            System.out.println("no existing animal house");
        }
        System.out.println("give the animal name");
        String name = readString();
        for(Enumeration e = animalhouse.element() ; e.hasMoreElement();)
        {
            AnimalVector courant = (AnimalHouseVector)e.nextElement(); 
            if courant.getName().equals(name){
                return courant;
            }
        System.out.println("l'animal" + name + "doesn't exist");
        return null;        
        }
        
    }
}

//ajouter un animal
    public static void add (Vector animalhouse){
        AnimalHouseVector courante = find (animalhouse);
        if (courante != null){
            courante.add_animal();
        }         
    }
// vieillir 
    public static void older(Vector animalhouse)
        AnimalHouseVector item = find(animalhouse);
        if (item != null ){
            item.older_one_animal();
        }
    }

    public static void older_all(Vector animalhouse){
        AnimalHouseVector item = find(animalhouse))
    }
//affiche 
    public static void display(Vector animalhouse){
        if (animalhouse.isEmpty())
        {
            System.out.println("no animal house");
            return; 
        }
        System.
    }

    public static void display( Vector animalhouse){
        if (animalhouse)
    }

    void older_one_animal(Animal2 animalhouse[]){
        Animal2 animal = find(animalhouse);
	    if (animal !=null)
	        animal.older();
    }

    public static void older_all_animal(Animal2 animalhouse[])
    {
        if (animalhouse[0]==null){
            System.out.println("no animals in the animal house");
            return;
        }
        System.out.println("give the number of years to add to the animal age");
        int years= readInt();
        for (int i=0;i<animalhouse.length;i++)
	    {
		    animalhouse[i].older(years);
	    }

    }
    public static void search_animal(Animal2 animalhouse[]){
	    Animal2 animal =find(animalhouse);
	    if (animal !=null)
	    animal.display();
    }

    public static Animal2 find(Animal2 animalhouse[]){
        System.out.println("Give the animal name that you're looking for");
        String name=readString();
        for (int i=0; i<animalhouse.length;i++){
            if (animalhouse[i].getname().equals(name))
		        return animalhouse[i];
	    }
	    System.out.println("the animal " + name+" doesn't exist");
	    return null;
    }



   public static void kill_animal(Animal2 animalhouse[]){
	Animal2 animal =find(animalhouse);
	if (animal !=null)
	    animal.kill();
    }

    public static void printAnimal( Animal2[]animalhouse){
        if (animalhouse[0]==null)
	        {
		        System.out.println("no animal in the club house ");
		        return;
	        }
	    for (int i =0; i<animalhouse.length;i++)
	    {
	        System.out.println(animalhouse[i]);
	    }

    }


        //animal.toString(); ???
    //}
    //}
    public static void add_animal(Animal2 animalhouse[]){
        //int MAX = 10;
        for (int i=0; i<animalhouse.length; i++) {
            String name = readString();
            int age = readInt();
            display_choice();
            int option=readInt();
            Animal2 animal=null;
            switch (option){
                case 1: animal=new Cat(name,age);break;
                case 2: animal=new Mice(name,age);break;
                case 3: animal=new Bird(name,age);break;
                default :
                    System.out.println("non existant option, start again");
                    i--;
                }
            if (animal != null)
                animalhouse[i]=animal;
        }
        System.out.println("You created 10 animals");   
    }

    static void print_menu()
    {
        System.out.println("What do you want to do?");
        System.out.println("1\t enter animals");
        System.out.println("2\t make one animal older");
        System.out.println("3\t make all the animals older");
        System.out.println("4\t kill one animal");
        System.out.println("5\t find an animal");
        System.out.println("6\t display");
        System.out.println(" \n 0 \t to exit");
    }

    static void display_choice()
    {
        System.out.println("What species is your animal ?");
        System.out.println(" 1 \t add a cat");
        System.out.println(" 2 \t add a mice");
        System.out.println(" 3 \t add a bird");
       
    }



    public static String readString() {
        try{
            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            String chaine=buff.readLine();
            return chaine;
        }
        catch(IOException e){
            System.out.println(" impossible to work" +e);
            return null;
        }
    }

    public static int readInt() {
        try{
            BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            String chaine=buff.readLine();          
            int num = Integer.parseInt(chaine);
            return num;
        }
        catch(IOException e){
            System.out.println(" impossible to work" +e);
	        return -1; //why -1 or 0 ?
        }
    }
}

    



