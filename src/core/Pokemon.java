package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Pokemon {
    private int id;
    private int pv = 100;
    private int force;
    private String surnom;
    private int taille;
    private Espece espece;
    private int niveau = 1;
    private int exp = 0;
    private List<Bonbon> bonbonsConsommes = new ArrayList<Bonbon>(){
        @Override
        public boolean contains(Object o) {
            Bonbon bonbon = (Bonbon) o;

            for ( Bonbon b: bonbonsConsommes)
            {
                if (b.getNom() == bonbon.getNom())
                    return true;
            }
            return false;
        }
    };
    public void gagnerExperience(int exp) {
        this.exp += exp;
        setNiveau(getNiveauDepuisXp(this.exp));
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void mangerBonbon(Bonbon bonbon)
    {

        if ( bonbonsConsommes.contains(bonbon))
        {
            System.out.println("bonbon deja consommé:"+ bonbon);
            System.out.println("experience non gagné");

        }
        else {
            gagnerExperience(bonbon.getAmount());
            bonbonsConsommes.add(bonbon);
        }
    }
    public void attaquer(Pokemon p)
    {
        p.recevoirDegats(force);
    }
    public int getNiveauDepuisXp(int exp)
    {
        if ( exp<5)
        {
            return 1;
        }
        if ( exp < 15)
        {
            return 2;
        }
        if ( exp < 30){
            return 3;
        }
        if ( exp < 100)
        {
            return 4;
        }
        return 5;
    }

    private void recevoirDegats(int force) {
        if ( pv > 0)
            pv-= force;
        else
            System.out.println(this+ "est mort");
    }

    public Pokemon(String surnom, int taille, Espece espece){
        this.surnom = surnom;
        this.taille = taille;
        this.espece = espece;
        this.force = new Random().nextInt((50-10)+1)+10;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", pv=" + pv +
                ", force=" + force +
                ", surnom='" + surnom + '\'' +
                ", taille=" + taille +
                ", espece=" + espece +
                ", niveau=" + niveau +
                ", exp=" + exp +
                '}';
    }

    public int getPv() {
        return pv;
    }
}
