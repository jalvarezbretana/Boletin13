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
public class SeleccionDeFutbol {

    private int id;
    private String nome;
    private String apelido;
    private int edade;

    public SeleccionDeFutbol() {
    }

    public SeleccionDeFutbol(int id, String nome, String apelido, int edade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    public void viaxar() {
        System.out.println("Viaxa a seleccion");

    }

    public void concentrarse() {
        System.out.println("Concentrase  a seleccion");
    }

    @Override
    public String toString() {
        return "id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", edade=" + edade;
    }

}
