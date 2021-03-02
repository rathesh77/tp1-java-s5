package core;

import java.util.List;

public class Inventaire {

    private List<Objet> objets;
    public Inventaire(List<Objet> objets)
    {
        this.objets = objets;
    }

    @Override
    public String toString() {
        return "Inventaire{" +
                "objets=" + objets +
                '}';
    }
    public int prixTotal(){
        int prix = 0;
        for ( Objet obj: objets)
        {
            prix+= obj.getPrix();
        }
        return prix;
    }
}
