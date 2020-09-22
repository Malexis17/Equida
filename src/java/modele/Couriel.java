/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *08/09/2020
 * @author sio2
 * Alexis MOREL
 */



public class Couriel {
    private int id;
    private String date;
    private String objet;
    private String corps;
    private ArrayList<PieceJointe> lesPiecesJointes;
    private Vente uneVente;
    

    
    
    
    public Couriel() {
    }

    public Couriel(int id, String date, String objet, String corps) {
        this.id = id;
        this.date = date;
        this.objet = objet;
        this.corps = corps;
    }

    public Couriel(ArrayList<PieceJointe> lesPiecesJointes) {
        this.lesPiecesJointes = lesPiecesJointes;
    }

    public Couriel(Vente uneVente) {
        this.uneVente = uneVente;
    }
    
    

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getObjet() {
        return objet;
    }

    public String getCorps() {
        return corps;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    public ArrayList<PieceJointe> getLesPiecesJointes() {
        return lesPiecesJointes;
    }

    public void setLesPiecesJointes(ArrayList<PieceJointe> lesPiecesJointes) {
        this.lesPiecesJointes = lesPiecesJointes;
    }
    
    
    public void addPieceJointe(PieceJointe unePieceJointe) {
        if (this.lesPiecesJointes == null) {
            this.lesPiecesJointes = new ArrayList<PieceJointe>();
        }
        lesPiecesJointes.add(unePieceJointe);
    }

    public Vente getUneVente() {
        return uneVente;
    }

    public void setUneVente(Vente uneVente) {
        this.uneVente = uneVente;
    }
    
    
    
    
}
