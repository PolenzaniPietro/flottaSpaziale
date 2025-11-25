/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flottaspaziale;


public class MembroEquipaggio {
    private String nome;
    private String ruolo;
    private int salute;
    private Boolean operatività = true;
    private int forza;
     // costruttore parametrizzato
    public MembroEquipaggio(String nome, String ruolo, int salute, int forza){
        this.nome=nome;
        this.ruolo=ruolo;
        this.salute=salute;
        this.forza=forza;
    }
    // costruttore non parametrizzato
    public MembroEquipaggio() {
        this.nome= "Marlon";
        this.ruolo="ingegnere";
        this.salute = 100;
        this.forza = 10;
    }

    public int getForza() {
        return forza;
    }
    
    // set e get operatività
    public void setOperatività(Boolean operatività) {
        this.operatività = operatività;
    }

    public Boolean getOperatività() {
        return operatività;
    }
    
    // set e get nome
   
    // set e get ruolo
    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }
    public String getRuolo() {
        return ruolo;
    }
    //set e get salute
    public void setSalute(int salute) {
        this.salute = salute;
    }
    public int getSalute() {
        return salute;
    }
    //controllo la presenza di un ingegnere
    public boolean controllaIng(){
        if(ruolo.equals("ingegnere")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean controllaMed(){
        if(ruolo.equals("medico")){
            return true;
        }else{
            return false;
        }
    }
    

    public int subisciDanno(int danno) {
        if(salute-danno>0){
            salute-=danno;
            System.out.println(" IL MEMBRO " + nome + " HA SUBITO " + danno + " DANNO");
        }
        else {
            salute=0;
        }
        return salute;
        
    }

    public void setOperativita(boolean b) {
        this.operatività=b;
    }
    public void scriviEquipaggio(){
        MembroEquipaggio a = new MembroEquipaggio();
        System.out.println(a);
    }
    
    @Override
    public String toString(){
        return " nome membro: " + nome + "\n" + " ruolo: " + ruolo + "\n" + " salute: " + salute + "\n" + " forza: " + forza;
    }
}
