/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Font;
/**
 *
 * @author Benjamin
 */
public class Zoom extends Effet {

    public Zoom(String message, int repets, Bandeau bandeau) {
        super(message, repets, bandeau);
    }

    @Override
    public void afficher() {
 bandeau.setMessage(message);
        for (int n = 0; n < this.repets; n++) {
            for (int i = 5; i < 60; i += 5) {
                this.bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
                this.bandeau.sleep(100);

            }
        }
    }
    
}
