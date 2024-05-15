import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Personne> personnes = new ArrayList<>();

        personnes.add(new Membre("Morgan", "Arthur", 1, new Date(), "Inactif"));
        personnes.add(new Membre("William", "Ellie", 2, new Date(), "actif"));


        personnes.add(new Employe("Leeroy", "Jenkins", 3, "Directeur", 4000));
        personnes.add(new Employe("Notch", "Steve", 4, "Secrétaire", 1800));
        personnes.add(new Employe("Porlier", "Florent", 5, "Technicien", 1400));

        for (Personne personne : personnes) {
            personne.afficherDetails();
        }
    }
}

