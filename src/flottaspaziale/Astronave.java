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
    private ArrayList <Modulo> moduli;
    private String nome;
    public int salute;
    private boolean ingegnere;
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
    //aggiunta modulo
    public ArrayList aggiungiModulo(Modulo modulo){
        this.moduli.add(modulo);
        return moduli;
    }
    //rimozione modulo
    public ArrayList rimuoviModulo(Modulo modulo){
        this.moduli.remove(modulo);
        return moduli;
    }
    //controllo presenza ingegnere 
    public boolean checkIngMembers(){
        boolean i=true;
        for (MembroEquipaggio membro : equipaggio){
            i = membro.controllaIng();
            if ( i == true){
                return i;
            }                    
        }
        return i;
    }
    //gestisco motore in avaria
    public boolean motoreInAvaria(){
        int rand = new Random().nextInt(3);
        if(rand == 2){
            return false;
        }
        else{
            return true;
        }
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
    public void curaTutti() {
        for (MembroEquipaggio membro : equipaggio){
            membro.curaMembro();
        }
    }
    public ArrayList <MembroEquipaggio> gestisciTraditore(){
        for ( MembroEquipaggio membro : equipaggio){
            membro.subisciDanno(10);
        }
        return equipaggio;
    }
}
    

