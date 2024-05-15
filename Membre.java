import java.util.Date;

public class Membre extends Personne {
    private String statut;
    private Date dateAdhesion;

    public Membre(String nom, String prénom, int id, Date dateAdhesion, String statut) {
        super(nom, prénom, id);
        this.statut = statut;
        this.dateAdhesion = dateAdhesion;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Nom: " + getNom() + ", Prénom: " + getPrénom() + ", ID: " + getId() +
                           ", Statut: " + statut + ", Date d'adhésion: " + dateAdhesion);
    }
}