/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

/**
 *
 * @author Benjamin
 */
public abstract class Effet {
    public String message;
    public int repets;
    public Bandeau bandeau;

    public Effet(String message, int repets, Bandeau bandeau) {
        this.message = message;
        this.repets = repets;
        this.bandeau = bandeau;
    }
    
    public abstract void afficher();
}
