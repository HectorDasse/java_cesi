package jsp;

public class CompteEpargne extends Compte{

    private double tauxInteret;



    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
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


    public double calculerInteret(){
        return (this.solde * this.tauxInteret) / 100;
    }
}
