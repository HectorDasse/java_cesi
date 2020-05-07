package jsp;

public class Client {
    private String identifiant;
    private String nom;
    private String prenom;
    private CompteCourant compteCourant;
    private CompteEpargne compteEpargne;

    public Client(String identifiant, String nom, String prenom, CompteCourant compteCourant, CompteEpargne compteEpargne) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.compteCourant = compteCourant;
        this.compteEpargne = compteEpargne;
    }

    public double calculerAvoirGloabal(){
        return this.compteCourant.getSolde() + this.compteEpargne.getSolde();
    }
}
