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
    }
    public Modulo(int salute) {
        this.salute = salute;
    }
    public int getSalute() {
        return salute;
    }

    public void setSalute(int salute) {
        this.salute = salute;
    }
 
}
