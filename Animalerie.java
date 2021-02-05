import java.io
import java.io.IOException;
import java.io.InputStreamReader;
public class Animalerie {
    public static void main(String []Args)
    {
        final int NBA=5;
        Animal2 []leclub = new Animal2[NBA];
        while(true)
        {
            affiche_menu();
            int response=saisieEntier();
            switch (response)
                {
                case 1 : ajouter_animal(leclub);break;
                case 2 : //vieillir_animal (leclub);break;
                case 3 : //vieillir_tous_animaux(leclub);break;
                case 4 : //animal_mourir(leclub);break;
                case 5 : //chercher_animal (leclub);break;
                case 6 : affiche_animal(leclub);break;
                case 0 : System.exit(0);
                default : 
                    System.out.println("option inexistante, recommencez");
                }
        }

    }
    

    static void affiche_menu()
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

        public static void ajouter_animal(Animal2[] leclub) {
            int cpt = 0;
            int MAX = 10;
            Animal []tableau = new Animal[MAX];
            for (cpt=0;cpt<=10;cpt++){
                String nom = saisie_chaine();
                int age = saisie_entier();
                Animal item = new Animal(nom,age);
                tableau[cpt] = item;
            }
        }
        public static String saisie_chaine ()
        {
        try{
            BufferedReader buff = new BufferedReader
                ();
            String chaine=buff.readLine();
            return chaine;
        }
        catch(IOException e){
        System.out.println(" Impossible de travailler" +e);
        return null;
            }
        }
        public static int saisie_entier ()
        {
        try{
            BufferedReader buff = new BufferedReader
                ();
            String chaine=buff.readLine();
            int num = Integer.parseInt(chaine);
            return num;
        }
        catch(IOException e){return 0;}
        }
    }
    



