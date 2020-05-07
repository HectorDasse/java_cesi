package jsp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ComtpeCourantTest {
    private double argent_de_base = 100;
    private double un_nombre = 400;

    @Test
    void nb_compte() {
        CompteCourant compte1 = new CompteCourant("1", "toto", 15, (double) 150);
        CompteCourant compte2 = new CompteCourant("2", "tata", 48, (double) 496);
        CompteCourant compte3 = new CompteCourant("3", "titi", 63, (double) 1256);

        assertEquals(3,  CompteCourant.nbCompteCourants);
    }

    @Test
    void crediter(){
        CompteCourant compte1 = new CompteCourant("1", "toto", argent_de_base, (double) 150);
        assertEquals(argent_de_base + un_nombre, compte1.add_solde(un_nombre));

    }

    @Test
    void debiter(){
        CompteCourant compte1 = new CompteCourant("1", "toto", argent_de_base, (double) 150);
        assertEquals(argent_de_base - 20, compte1.less_solde(20));

    }

    @Test
    void test_debi_plus_important_que_decouvert(){
        CompteCourant compte1 = new CompteCourant("1", "toto", argent_de_base, (double) 20);
        assertEquals(argent_de_base, compte1.less_solde(un_nombre));
    }

    @Test
    void test_calcule_solde_tout_comtpe(){
        CompteEpargne compteEpargne = new CompteEpargne(120.00, "1", 0.50, "compte1");
        CompteCourant compteCourant = new CompteCourant("1","Compte1", 50.00, 150.00);
        Client client = new Client("1", "Dasse", "Hector", compteCourant, compteEpargne);
        assertEquals(170, client.calculerAvoirGloabal());
    }
}
