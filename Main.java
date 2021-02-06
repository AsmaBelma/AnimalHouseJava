import java.io
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[])
    {
        final int size = 5;
        Animal2[] array = new Animal2[size];
        while(true) {
            printMenu();
            int option = readInt();
            switch (option) {
                case 1 : add_animal(array);break;
                // case 2 : //older_one_animal (array);break;
                // case 3 : //older_all_animal(array);break;
                // case 4 : //kill_animal(array);break;
                // case 5 : //search_animal (array);break;
                case 6 : printAnimal(array);break;
                case 0 : System.exit(0);
                default : 
                    System.out.println("non existant option, start again");
            }
        }
    }

    static void print_menu()
    {
        System.out.println("What do you want to do?");
        System.out.println("1\t enter animals");
        System.out.println("2\t make one animal older");
        System.out.println("3\t make all the animals older");
        System.out.println("5\t kill one animal");
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

    public static void add_animal(Animal2[] array) {
        int MAX = 10;
        for (int i=0; i<MAX; i++) {
            String name = readString();
            int age = readInt();
            Animal2 animal = new Animal2(name, age);
            array[i] = animal;
        }
    }

    public static String readString() {
        try{
            BufferedReader buff = new BufferedReader();
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
            BufferedReader buff = new BufferedReader
                ();
            String chaine=buff.readLine();
            int num = Integer.parseInt(chaine);
            return num;
        }
        catch(IOException e){
            return 0;
        }
    }

    void printAnimal(){

        animal.toString();
    }
}
    



