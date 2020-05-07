package jsp;

public class CompteCourant extends Compte{

    private Double montantDecouvertAutorise;
    public static int nbCompteCourants;


    public Double getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }

    public void setMontantDecouvertAutorise(Double montantDecouvertAutorise) {
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }



    public CompteCourant(String numero, String intitule, double solde, Double montantDecouvertAutorise) {
        if (solde < 0){
            this.solde = 0;
            System.out.println("Solde négatif impossible");
        } else {
            this.solde = solde;
        }

        this.numero = numero;
        this.intitule = intitule;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
        this.nbCompteCourants ++;
    }


    public double less_solde(double nombre){
        double montant = this.solde - nombre;

        if (montant < 0){
            if (montant *-1 > this.montantDecouvertAutorise){
                System.out.println("Opération impossible découvert insufisant");
            } else {
                this.solde = montant;
            }
        }else {
            this.solde = montant;
        }
        return this.solde;
    }
}
