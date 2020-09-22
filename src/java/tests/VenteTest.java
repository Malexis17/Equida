/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.Lieu;
import modele.Vente;

/**
 *08/009/2020
 * @author sio2
 * Alexis MOREL
 */
public class VenteTest {
    
     public static void main(String[] args) {
     Vente uneVente = new Vente(30917, "Garibaldi Princess", "12/05/20");
     Lieu unLieu = new Lieu(1, "Caen", 4,"Hypodrome");
     
     uneVente.setUnLieu(unLieu);
     
             
        System.out.println(uneVente.toString());
        System.out.println(unLieu.toString());
        System.out.println("La vente " + uneVente.getNom() + " qui débute le " + uneVente.getDateDebutVente() + " se déroule à " + uneVente.getUnLieu().getVille() );
     
}
}

