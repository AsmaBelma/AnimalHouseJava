import java.io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main (String args[])
    {
        final int size = 5;
        Animal2 []array = new Animal2[size];
        while(true) {
            print_menu();
            int option = readInt();
            switch (option) {
                case 1 : add_animal(array);break;
                case 2 : older_one_animal(array);break;
                case 3 : older_all_animal(array);break;
                case 4 : kill_animal(array);break;
                case 5 : search_animal(array);break;
                case 6 : printAnimal(array);break;
                case 0 : System.exit(0);
                default : 
                    System.out.println("non existant option, start again");
            }
        }
    }

    public static void older_one_animal(Animal2 array[]){
        Animal2 animal = find(array);
	    if (animal !=null)
	        animal.older();
    }

    public static void older_all_animal(Animal2 array[])
    {
        if (array[0]==null){
            System.out.println("no animals in the animal house");
            return;
        }
        System.out.println("give the number of years to add to the animal age");
        int years= readInt();
        for (int i=0;i<array.length;i++)
	    {
		    array[i].older(years);
	    }

    }
    public static void search_animal(Animal2 array[]){
	    Animal2 animal =find(array);
	    if (animal !=null)
	    animal.display();
    }

    public static Animal2 find(Animal2 array[]){
        System.out.println("Give the animal name that you're looking for");
        String name=readString();
        for (int i=0; i<array.length;i++){
            if (array[i].getname().equals(name))
		        return array[i];
	    }
	    System.out.println("the animal " + name+" doesn't exist");
	    return null;
    }



   public static void kill_animal(Animal2 array[]){
	Animal2 animal =find(array);
	if (animal !=null)
	    animal.kill();
    }

    public static void printAnimal( Animal2[]array){
        if (array[0]==null)
	        {
		        System.out.println("no animal in the club house ");
		        return;
	        }
	    for (int i =0; i<array.length;i++)
	    {
	        System.out.println(array[i]);
	    }

    }


        //animal.toString(); ???
    //}
    //}
    public static void add_animal(Animal2 array[]){
        //int MAX = 10;
        for (int i=0; i<array.length; i++) {
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
                array[i]=animal;
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

    



