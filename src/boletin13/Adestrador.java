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
public class Adestrador extends SeleccionDeFutbol {

    private String idFederacion;

    public Adestrador() {
    }

    public Adestrador(int id, String nome, String apelido, int edade, String idFederacion) {
        super(id, nome, apelido, edade);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirixirPartido() {
        System.out.println("Tienes que dirigir el partido");
    }

    public void dirixirAdestramento() {
        System.out.println("Tienes que dirigir el entrenamiento");
    }

    @Override
    public String toString() {
        return super.toString() + "Adestrador{" + "idFederacion=" + idFederacion + '}';
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxa o adestrador");
    }

}
