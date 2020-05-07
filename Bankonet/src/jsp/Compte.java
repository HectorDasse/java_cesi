package jsp;

public class Compte {
    protected String numero;
    protected String intitule;
    protected double solde;


    public double add_solde(double nombre){
        this.solde += nombre;

        return this.solde;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }
}
