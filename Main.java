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
                case 1 : addAnimal(array);break;
                // case 2 : //vieillir_animal (leclub);break;
                // case 3 : //vieillir_tous_animaux(leclub);break;
                // case 4 : //animal_mourir(leclub);break;
                // case 5 : //chercher_animal (leclub);break;
                case 6 : printAnimal(array);break;
                case 0 : System.exit(0);
                default : 
                    System.out.println("option inexistante, recommencez");
            }
        }
    }

    static void print_menu()
    {
        System.out.println("Que voulez-vous faire ?");
        System.out.println("1\t saisir des Animaux");
        //System.out.println("2\t vieillir 1 animal");
        //System.out.println("3\t vieillir tous");
        //System.out.println("5\t mourir 1 animal");
        System.out.println("6\t affiche");
        System.out.println(" \n 0 \t pour sortir");
    }

    //static void afficheChoix()
    //{
        //System.out.println("Que voulez-vous faire ?");
        //System.out.println(" 1 \t ajouter un chat");
        //System.out.println(" 2 \t ajouter une souris");
        //System.out.println(" 3 \t ajouter un canari");
       
    //}

    public static void addAnimal(Animal2[] array) {
        int MAX = 10;
        for (int i=0; i<MAX; i++) {
            String nom = readString();
            int age = readInt();
            Animal2 animal = new Animal2(nom, age);
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
            System.out.println(" Impossible de travailler" +e);
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
    



