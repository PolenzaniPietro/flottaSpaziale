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
     // costruttore parametrizzato
    public MembroEquipaggio(String nome, String ruolo, int salute){
        this.nome=nome;
        this.ruolo=ruolo;
        this.salute=salute;
    }
    // costruttore non parametrizzato
    public MembroEquipaggio() {
        this.nome= "Trivella";
        this.ruolo="medico";
        this.salute = 100;
    }
    // set e get operatività
    public void setOperatività(Boolean operatività) {
        this.operatività = operatività;
    }

    public Boolean getOperatività() {
        return operatività;
    }
    
    // set e get nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
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

}
