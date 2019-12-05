/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13;

/**
 *
 * @author jalvarezbretana
 */
public class Xogador extends SeleccionDeFutbol {

    private int dorsal;
    private String demarcacion;

    public Xogador() {
    }

    public Xogador(int id, String nome, String apelido, int edade, int dorsal, String demarcacion) {
        super(id, nome, apelido, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void xogarPartido() {
        System.out.println("Tienes que jugar el partido");
    }

    public void entrenar() {
        System.out.println("Hay que entrenar");
    }

    @Override
    public String toString() {
        return super.toString() + "dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxa o xogador");
    }

}
