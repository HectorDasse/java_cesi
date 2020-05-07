package jsp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ComtpeCourantTest {
    double argent_de_base = 100;
    double un_nombre = 50;

    @Test
    public void nb_compte() {
        CompteCourant compte1 = new CompteCourant("1", "toto", 15, (double) 150);
        CompteCourant compte2 = new CompteCourant("2", "tata", 48, (double) 496);
        CompteCourant compte3 = new CompteCourant("3", "titi", 63, (double) 1256);

        assertEquals(3,  CompteCourant.nbCompteCourants);
    }

    @Test
    public void crediter(){
        CompteCourant compte1 = new CompteCourant("1", "toto", argent_de_base, (double) 150);
        compte1.add_solde(un_nombre);
        assertEquals(argent_de_base + un_nombre, compte1.solde);

    }

    @Test
    public void debiter(){
         CompteCourant compte1 = new CompteCourant("1", "toto", argent_de_base, (double) 150);
        compte1.less_solde(un_nombre);
        assertEquals(argent_de_base - un_nombre, compte1.solde);

    }
}
