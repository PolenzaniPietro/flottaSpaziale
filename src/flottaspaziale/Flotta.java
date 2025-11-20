
package flottaspaziale;

import flottaspaziale.GestioneEvento.Evento;
import java.util.ArrayList;
import java.util.Random;


public class Flotta {
    private String eventi;
    private ArrayList<Astronave> astronavi;

    public void setAstronavi(ArrayList<Astronave> astronavi) {
        this.astronavi = astronavi;
    }
    
    public ArrayList<Astronave> getAstronavi() {
        return astronavi;
    }
    public ArrayList<Astronave> aggiungiAstronave(Astronave a){
        astronavi.add(a);
        return astronavi;
    }
    public ArrayList<Astronave> rimuoviAstronave(Astronave a){
        astronavi.remove(a);
        return astronavi;
    }
    // gestione asteroidi
    public void campoAsteoidi(){
        for( Astronave astronave: astronavi ){            
            if(astronave.subisciDanno()==0){
                astronavi.remove(astronave);
            }
        }
    }
    // gestione motore
    public void avariaMotore(){
        int rnd = new Random().nextInt(astronavi.size());
        Astronave a = astronavi.get(rnd);
        if (a.checkIngMembers() == true) {
            if(!a.motoreInAvaria()){
                this.rimuoviAstronave(a);
            }
        }
        else
        {
            this.rimuoviAstronave(a);
        }
        
    }
    // gestione cura
    public void cura(){
        for( Astronave astronave: astronavi ){
            if(astronave.salute <100){
                astronave.curaTutti();
            }
        }
                
    }
    public void traditore(){
        int rnd = new Random().nextInt(astronavi.size());
        Astronave a = astronavi.get(rnd);
        a.gestisciTraditore();
    }
    public void alieni(){
        int rnd = new Random().nextInt(1,2);
        if(rnd == 1){
            int rnd1 = new Random().nextInt(astronavi.size());
            Astronave a = astronavi.remove(rnd1);
        }
        else{
           // Astronave a = astronavi.
                    
        }
               
    }
    
    void gestisciEvento(Evento randomEvent) {
        if (randomEvent == Evento.Alieni) {
             
        }
        else if (randomEvent == Evento.Asteroidi) {
             
        }
    }
    
    
    
}

