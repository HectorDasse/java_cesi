package jsp;

public class CompteEpargne {
    private double solde;
    private String numero;
    private double tauxInteret;
    private String intitule;

    public double getSolde() {
        return solde;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    CompteEpargne(double solde, String numero, double taauxInteret, String intitule) {
        this.solde = solde;
        this.numero = numero;
        this.tauxInteret = taauxInteret;
        this.intitule = intitule;
    }

    public double less_solde(double nombre){
        double montant = this.solde - nombre;
        if (montant > 0){
            this.solde = montant;
        }else {
            System.out.println("Fond insufisant");
        }
        return this.solde;
    }

    public double add_solde(double nombre){
        this.solde += nombre;

        return this.solde;
    }

    public double calculerInteret(){
        return (this.solde * this.tauxInteret) / 100;
    }
}
