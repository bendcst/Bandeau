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
public class Rotate extends Effet {

    public Rotate(String message, int repets, Bandeau bandeau) {
        super(message, repets, bandeau);
    }

    @Override
    public void afficher() {
        bandeau.setMessage(message);
        for (int n = 0; n < this.repets; n++) {
            for (int i = 0; i <= 100; i++) {
                this.bandeau.setRotation(2 * Math.PI * i / 100);
                this.bandeau.sleep(100);
            }
        }

    }
}
