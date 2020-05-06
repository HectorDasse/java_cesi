import jsp.CompteCourant;

public class Main {
    public static void main(String[] arg){
        CompteCourant compte1 = new CompteCourant("1", "toto", "15", (double) 150);
        CompteCourant.nbCompteCourants ++;
        CompteCourant compte2 = new CompteCourant("2", "tata", "48", (double) 496);
        CompteCourant.nbCompteCourants ++;
        CompteCourant compte3 = new CompteCourant("3", "titi", "63", (double) 1256);
        CompteCourant.nbCompteCourants ++;

        System.out.println(CompteCourant.nbCompteCourants);
    }
}
