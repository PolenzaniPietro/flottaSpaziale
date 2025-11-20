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
    
    static public enum Evento {
        Alieni, // attaccano le astronavi uccidendo l'equipaggio oppure rubano un'astronave    
        IncontraGrottelli, // ripristina la salute dei membri dell'equipaggio   FINITO
        Asteroidi, // danneggia la flotta (tutte le navi)    FINITO
        Traditore, // uccide membri del'equipaggio   SEMI-FINITO 
        Avaria //danno al modulo motore   FINITO
        
    }

   
    public Evento randomEvent(){
        int rnd = new Random().nextInt(Evento.values().length);
        Evento eventoRandom = Evento.values()[rnd];       
        return eventoRandom;
    }
    
   
}
