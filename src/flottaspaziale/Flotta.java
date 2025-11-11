
package flottaspaziale;

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
    public void campoAsteoidi(){
        for( Astronave astronave: astronavi ){            
            if(astronave.subisciDanno()==0){
                astronavi.remove(astronave);
            }
        }
    }
    
    
    
    
}

