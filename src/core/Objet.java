package core;

public class Objet {
    protected String nom;
    protected int prix;
    private String typeUtilisation;

    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }

    public Objet(String nom, int prix, String typeUtilisation)
    {
        this.prix = prix;
        this.nom = nom;
        this.typeUtilisation = typeUtilisation;
    }
}
