/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.util.ArrayList;

/**
 *
 * @author Benjamin
 */
public class Scenario {
    
    public Bandeau b;
    private ArrayList<Effet> lesEffets = new ArrayList<>();

    public Scenario(Bandeau b) {
        this.b = b;
    }
    
    public void addEffets(Effet lesEffets){
        this.lesEffets.add(lesEffets);
    }
    
    public void afficheScenario(){
        for (Effet e : lesEffets){
            e.afficher();
            b.sleep(1000);
        }
        b.close();
    }
}
