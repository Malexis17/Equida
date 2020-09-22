/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *08/09/2020
 * @author sio2
 * Alexis MOREL
 */
public class PieceJointe {
    private int id;
    private String chemin;
    private String description;

    public PieceJointe() {
    }

    public PieceJointe(int id, String chemin, String description) {
        this.id = id;
        this.chemin = chemin;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getChemin() {
        return chemin;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
