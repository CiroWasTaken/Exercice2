public class Livre implements Empruntable {
    private String titre;
    private String auteur;
    private String isbn;
    private boolean disponible;

    public Livre(String titre, String auteur, String isbn, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println("Le livre '" + titre + "' est maintenant emprunté.");
        } else {
            System.out.println("Le livre '" + titre + "' n'est pas disponible pour emprunt.");
        }
    }

    @Override
    public void retourner() {
        disponible = true;
        System.out.println("Le livre '" + titre + "' a été retourné et est maintenant disponible.");
    }

    public void afficherDetails() {
        System.out.println("Titre: " + getTitre() + ", Auteur: " + getAuteur() + ", ISBN: " + getIsbn()
                           + ", Disponible: " + (isDisponible() ? "oui" : "non"));
    }
}