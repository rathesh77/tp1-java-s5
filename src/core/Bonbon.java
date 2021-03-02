package core;

public class Bonbon extends Objet{
    private int amount;

    public int getAmount() {
        return amount;
    }


    public Bonbon(String nom, int amount,int prix, String typeUtilisation)
    {
        super(nom,prix,typeUtilisation);

        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bonbon{" +
                "amount=" + amount +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}
