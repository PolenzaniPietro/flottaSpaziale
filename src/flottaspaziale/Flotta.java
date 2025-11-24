
package flottaspaziale;

import flottaspaziale.GestioneEvento.Evento;
import java.util.ArrayList;
import java.util.Random;


public class Flotta {
    private String eventi;
    private ArrayList<Astronave> astronavi;
    private String nome;

    public void setAstronavi(ArrayList<Astronave> astronavi, String nome) {
        this.astronavi = astronavi;
        this.nome= nome;
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
    public void campoAsteroidi(){
        for( Astronave astronave: astronavi ){            
            if(astronave.asteroide()==0){
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
                this.astronavi.remove(astronavi.get(rnd));
                System.out.println("UN'ASTRONAVE HA COLPITO UN ASTEDOIDE ED E' STATA DISTRUTTA");
            }
        }
        else
        {
           this.astronavi.remove(astronavi.get(rnd));
           System.out.println("UN'ASTRONAVE HA COLPITO UN ASTEDOIDE ED E' STATA DISTRUTTA");
        }
        
    }
    public void epidemia(){
        int rnd = new Random().nextInt (astronavi.size());
        Astronave a = astronavi.get(rnd);
        if(a.checkMedicoMembers()){
            a.malattiaConMedico();
        }
        else {
            a.danneggiaTutti(30);  
            System.out.println("UNA MALATTIA HA COLPITO LA NAVE DANNEGGIANDO TUTTI I MEMBRI");
        }
    }
    // gestione cura
    public void cura(){
        for( Astronave astronave: astronavi ){
            astronave.curaTutti();
            System.out.println(" IL GRANDE GROTTELLI HA CURATO TUTTI I MEMBRI DELL'EQUIPAGGIO");    
        }    
    }
    public void traditore(){
        int rnd = new Random().nextInt(astronavi.size());
        Astronave a = astronavi.get(rnd);
        a.gestisciTraditore();
    }
    public void alieni(){
            int rnd1 = new Random().nextInt(astronavi.size());
            astronavi.remove(astronavi.get(rnd1));
            System.out.println("GLI ALIENI HANNO RUBATO UN'ASTRONAVE!!");
        }
    
    public void gestisciEvento(Evento randomEvent) {
        Flotta f = new Flotta();
        if (randomEvent == Evento.Alieni) {
             f.alieni();
        }
        else if (randomEvent == Evento.Asteroidi) {
             
             f.campoAsteroidi();
        }
        else if (randomEvent == Evento.Avaria) {
             f.avariaMotore();
        }
        else if (randomEvent == Evento.IncontraGrottelli) {
             f.cura();
        }
        else if (randomEvent == Evento.Traditore) {
             f.traditore();
        }   
        else if (randomEvent == Evento.Epidemia){
             f.epidemia();
        }
    }
    @Override
    public String toString(){
        return "nome: " + nome ;
    }
    
    public void StampaStato(){
    System.out.println(this);
    for( Astronave astronave: astronavi ){
        astronave.stampaAstronave();
    }
    }
}