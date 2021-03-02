package com.rathesh;

import core.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");


        Pokemon p1 = new Pokemon(1,"pikachu",180,new Espece(1,"pikachu","electrique"));
        Pokemon p2 = new Pokemon(2,"bulbizarre",180,new Espece(2,"bulbizarre","plante"));
        System.out.println(p1 + "\n" + p2);

        for (int i = 0; i < 100; i++) {
            p1.gagnerExperience(5);
            System.out.println(p1);
        }
        p1.mangerBonbon(new Bonbon("un bonbon",25,4,"unique"));
        while(p1.getPv()>0 && p2.getPv()>0)
        {
            p1.attaquer(p2);
            if ( p2.getPv()<=0)
                break;
            p2.attaquer(p1);
        }
        Pokemon winner = p1;

        if ( p1.getPv()<=0)
        {
            winner = p2;
        }

        winner.gagnerExperience(25);
        System.out.println(winner + " a gagné");

        Inventaire inventaire = new Inventaire(new ArrayList<Objet>(Arrays.asList(new Bonbon("un bonbon",25,10,"unique"),new Pokeball("pokeball",25,"unique"))));
        Joueur j = new Joueur(inventaire);

        System.out.println("Prix de l'inventaire : "+ inventaire.prixTotal());

    }
}