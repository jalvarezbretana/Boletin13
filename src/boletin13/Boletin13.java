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
public class Boletin13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SeleccionDeFutbol obx = new SeleccionDeFutbol();

        Xogador obx1 = new Xogador(25, "paco", "ruiz", 23, 6, "delantero");
        System.out.println(obx1.toString());
        obx1.concentrarse();
        obx1.viaxar();
        obx1.concentrarse();
        Adestrador obx2 = new Adestrador(22, "pepe", "camiña", 45, "56");
        System.out.println(obx2.toString());
        obx2.concentrarse();
        obx2.viaxar();
        Masajista obx3 = new Masajista(34, "pablo", "mendez", 32, "masajista", 12);
        System.out.println(obx3.toString());
        obx3.concentrarse();
        obx3.viaxar();
    }

}
