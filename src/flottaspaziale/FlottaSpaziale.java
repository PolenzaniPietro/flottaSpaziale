/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flottaspaziale;

/**
 *
 * @author polenzani.pietro
 */
public class FlottaSpaziale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Flotta flotta = new Flotta();
        
        GestioneEvento generator = new GestioneEvento();
        
        flotta.gestisciEvento(generator.randomEvent());
        
    }
    
}
