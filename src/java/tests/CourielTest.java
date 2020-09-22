/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import modele.Couriel;
import modele.PieceJointe;
import modele.Vente;

/**
 *
 * @author sio2
 */
public class CourielTest {
    
      
          public static void main(String[] args) {

       Couriel unCouriel = new Couriel(1, "Vente", "14/08/2020", "Bonjour ");
       PieceJointe unePieceJointe = new PieceJointe(1, "cheval/test ", "cheval course");
        PieceJointe deuxPieceJointe = new PieceJointe(2, "cheval/test2", "cheval"); 
        Vente uneVente = new Vente(30917, "Garibaldi Princess", "12/05/20");
       
        System.out.println(unCouriel.toString());
        System.out.println(unCouriel.getObjet() + " " + unCouriel.getDate() + " " + unCouriel.getCorps());
        
        System.out.println(uneVente.toString());
        System.out.println(uneVente.getNom()+ " " + uneVente.getUnLieu()+ " " + uneVente.getUneCategVente() + " " + uneVente.getDateDebutVente());
        
        unCouriel.addPieceJointe(unePieceJointe);
         unCouriel.addPieceJointe(deuxPieceJointe);
         
         for(int i = 0; i < unCouriel.getLesPiecesJointes().size(); i++){
         System.out.println("Objet : " + unCouriel.getLesPiecesJointes().get(i).getDescription());
         }
        
     
               
    
}
    
    
}
