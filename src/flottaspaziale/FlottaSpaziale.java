
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
        Flotta flotta = new Flotta("MarlonAura");
        
        GestioneEvento generator = new GestioneEvento();
        
        flotta.gestisciEvento(generator.randomEvent());
        Astronave a1 = new Astronave();
        flotta.aggiungiAstronave(a1);
        Astronave a2 = new Astronave();
        flotta.aggiungiAstronave(a2);
        Astronave a3 = new Astronave();
        flotta.aggiungiAstronave(a3);
        Modulo m1 = new Modulo();
        a1.aggiungiModulo(m1);
        MembroEquipaggio e1 = new MembroEquipaggio();
        a1.aggiungiMembro(e1);
        flotta.gestisciEvento(generator.randomEvent());
        flotta.gestisciEvento(generator.randomEvent());
        flotta.gestisciEvento(generator.randomEvent());
        flotta.gestisciEvento(generator.randomEvent());
        flotta.gestisciEvento(generator.randomEvent());
        flotta.stampaStato();
        
    }
    
}
