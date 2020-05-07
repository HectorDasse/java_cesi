package jsp;

public class CompteCourant {

    public String intitule;
    public double solde;
    public Double montantDecouvertAutorise;
    public static int nbCompteCourants;
    public String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

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


    public void add_solde(double nombre){
        this.solde += nombre;
    }

    public void less_solde(double nombre){
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



    }
}
