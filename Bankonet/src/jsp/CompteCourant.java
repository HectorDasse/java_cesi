package jsp;

public class CompteCourant {
    String numero;
    String intitule;
    double solde;
    Double montantDecouvertAutorise;
    public static int nbCompteCourants;

    public CompteCourant(String numero, String intitule, double solde, Double montantDecouvertAutorise) {
        this.numero = numero;
        this.intitule = intitule;
        this.solde = solde;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
        this.nbCompteCourants ++;
    }


    public void add_solde(double nombre){
        this.solde += nombre;
    }

    public void less_solde(double nombre){
        this.solde -= nombre;
    }
}
