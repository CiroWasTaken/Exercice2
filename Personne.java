public abstract class Personne {
	private String nom;
	private String prénom;
	private int id;

	public Personne(String nom, String prénom, int id) {
		this.nom = nom;
		this.prénom = prénom;
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrénom() {
		return prénom;
	}

	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public abstract void afficherDetails();
}