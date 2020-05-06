package jsp;

public class CompteCourant {
    String numero;
    String intitule;
    String solde;
    Double montantDecouvertAutorise;
    public static int nbCompteCourants;

    public CompteCourant(String numero, String intitule, String solde, Double montantDecouvertAutorise) {
        this.numero = numero;
        this.intitule = intitule;
        this.solde = solde;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }
}
