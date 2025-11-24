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
    public boolean checkMedicoMembers(){
        boolean i=true;
        for (MembroEquipaggio membro : equipaggio){
            i = membro.controllaMed();
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
    public ArrayList malattiaConMedico(){
        for (MembroEquipaggio membro : equipaggio){
        int rand = new Random().nextInt(10);
        if(rand> 7){
            equipaggio.remove(membro);
        }
        }
        return equipaggio;
    }
    public String getNome() {
        return nome;
    }    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int asteroide(){
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
            membro.setSalute(100);
            membro.setOperatività(true);
        }
    }
    public ArrayList <MembroEquipaggio> gestisciTraditore(){
        int forzaTraditore= new Random().nextInt(10);
        for ( MembroEquipaggio membro : equipaggio){
            if(forzaTraditore>membro.getForza()){
                if(salute-10>=0){
                    membro.subisciDanno(10);
                }else {
                    equipaggio.remove(membro);
                }
                
            }
            else {
                if(salute+10<=100){
                    membro.setSalute(salute+10);
                }
                else{
                    membro.setSalute(100);
                }
                
            }
            
        }
        return equipaggio;
    }

    public void danneggiaTutti(int i) {
        for ( MembroEquipaggio membro : equipaggio){
            if(salute-1>=0){
                membro.setSalute(salute-i);
            }
            else{
                equipaggio.remove(membro);
            }

        }
    }
    @Override
    public String toString(){
        return "nome: " + nome + "\n" + " salute: " + salute;
    }
    public void stampaAstronave(){
        System.out.println(this);
        for ( MembroEquipaggio membro : equipaggio){
            System.out.println(stampaMembro());
        }
        for ( Modulo m : moduli){
            System.out.println(stampaModulo());
        }
    }
}
    

