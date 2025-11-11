/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flottaspaziale;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author polenzani.pietro
 */
public class Astronave {
    private ArrayList <MembroEquipaggio> equipaggio;
    private ArrayList <Modulo> modulo;
    private String nome;
    private int salute;
    // aggiunta membri dell equipaggio
    public ArrayList aggiungiMembro(MembroEquipaggio m){
        this.equipaggio.add(m);
        return equipaggio;
    }
    // rimozione membri dell equipaggio
    public ArrayList rimuoviMembro(MembroEquipaggio m){
        this.equipaggio.remove(m);
        return equipaggio;
    }
    
    public String getNome() {
        return nome;
    }    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int subisciDanno(){
        int rnd = new Random().nextInt(10);
            if(rnd<4){
                salute-=25;
            }
            else if(rnd < 8){
                salute = 0;
            }
            return salute;
    }
}


