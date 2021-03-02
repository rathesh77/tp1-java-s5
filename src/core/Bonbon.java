package core;

public class Bonbon {
    private String nom;
    private int amount;

    public int getAmount() {
        return amount;
    }

    public String getNom() {
        return nom;
    }

    public Bonbon(String nom, int amount)
    {
        this.nom = nom;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bonbon{" +
                "nom='" + nom + '\'' +
                ", amount=" + amount +
                '}';
    }
}
