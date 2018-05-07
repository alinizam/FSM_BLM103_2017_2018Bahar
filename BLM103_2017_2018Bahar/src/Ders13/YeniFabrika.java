/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

/**
 *
 * @author FSMBLM1
 */
public class YeniFabrika {

    Personel[] personeller = new Personel[5];

    int toplamMaas() {
        int toplamMaas = 0;
        for (Personel p : personeller) {
            toplamMaas += p.getMaas();
        }
        return toplamMaas;
    }

    int toplamMesai() {
        int toplamMesai = 0;
        for (Personel p : personeller) {
            if (p instanceof Isci) {
                toplamMesai += ((Isci) p).getMesai();
            }
            /*System.out.println(p.getClass());
            if (p.getClass().toString().equals("class Ders13.Isci")) {
                toplamMesai += ((Isci) p).getMesai();
            }*/
        }
        return toplamMesai;

    }

}
