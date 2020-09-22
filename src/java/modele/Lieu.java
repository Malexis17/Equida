/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author Zakina
 */
public class Lieu {
    private int id ;
    private String Ville;
    private int nbBoxes;
    private String Commentaires;
     

    public Lieu() {
    }

    public Lieu(int id, String Ville, int nbBoxes, String Commentaires) {
        this.id = id;
        this.Ville = Ville;
        this.nbBoxes = nbBoxes;
        this.Commentaires = Commentaires;
    }

 
    

    public int getId() {
        return id;
    }

    public String getVille() {
        return Ville;
    }

    public int getNbBoxes() {
        return nbBoxes;
    }

    public String getCommentaires() {
        return Commentaires;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVille(String Ville) {
        this.Ville = Ville;
    }

    public void setNbBoxes(int nbBoxes) {
        this.nbBoxes = nbBoxes;
    }

    public void setCommentaires(String Commentaires) {
        this.Commentaires = Commentaires;
    }
    
    
    
}
