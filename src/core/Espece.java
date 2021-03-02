package core;

public class Espece {

    private int id;
    private String nom;
    private String type;

    public Espece(int id, String nom, String type){
        this.id = id;
        this.nom = nom;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Espece{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
