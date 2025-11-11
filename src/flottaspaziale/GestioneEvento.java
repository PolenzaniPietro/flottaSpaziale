/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flottaspaziale;

import java.util.Random;


/**
 *
 * @author polenzani.pietro
 */
public class GestioneEvento {
    
    enum Evento {
        alieni, // attaccano le astronavi uccidendo l'equipaggio
        cura, // ripristina la salute dei membri dell'equipaggio
        riparazioni, // ripara una nave
        asteroidi, // danneggia la flotta (tutte le navi)
        traditore // uccide membri del'equipaggio
        
    }
    public Evento randomEvent(){
        int rnd = new Random().nextInt(Evento.values().length);
        Evento eventoRandom = Evento.values()[rnd];
        if(eventoRandom == asteroidi){
            
        }
        return eventoRandom;
    }
    
   
}
