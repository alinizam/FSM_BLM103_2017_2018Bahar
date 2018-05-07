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
public class TestDowncast {

    public static void main(String[] args) {
        Personel p = new Personel();
        if (p instanceof Isci) {
            Isci i = (Isci) p;
            System.out.println(i.getMesai());
            System.out.println(((Isci) p).getMesai());
        }
    }
}
