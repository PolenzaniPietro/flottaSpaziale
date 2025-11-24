/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flottaspaziale;


/**
 *
 * @author polenzani.pietro
 */
public class Modulo {
    private String modulo;
    private int salute;
    private Boolean integrità = true;

    public Modulo(){
        this.salute = 100;
        this.modulo="motore";
        this.integrità=true;
                
    }
    public Modulo(int salute, boolean integrita) {
        this.salute = salute;
        this.integrità=integrita;
    }
    public int getSalute() {
        return salute;
    }

    public void setSalute(int salute) {
        this.salute = salute;
    }

    public void setIntegrità(Boolean integrità) {
        this.integrità = integrità;
    }

    public Boolean getIntegrità() {
        return integrità;
    }
     @Override
    public String toString(){
        return " nome: " + modulo +"\n" + " salute: "+ salute + "\n" + " stato di integrità: " + integrità +"\n"; 
    }
    public void stampaModulo(){
        System.out.println(this);
    }
}
