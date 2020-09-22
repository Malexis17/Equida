/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.Lieu;

/**
 *08/09/2020
 * @author sio2
 * Alexis MOREL
 */
public class LieuTest {

  
  public static void main(String[] args) {

       Lieu unLieu = new Lieu(1, "Caen", 4,"Hypodrome");
        //unLieu.setUnPays(new Pays("FRA", "FRANCE"));    
        System.out.println(unLieu.toString());
        System.out.println(unLieu.getId()+ "  " + unLieu.getVille() + " " + unLieu.getNbBoxes() + " " + unLieu.getCommentaires());
    
}
}