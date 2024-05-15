public class Livre {
    private String titre;
    private String auteur;
    private String isbn;
    private Boolean disponible;

    public Livre(String titre, String auteur, String isbn, Boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
}