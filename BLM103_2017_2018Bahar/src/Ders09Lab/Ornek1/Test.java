/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab.Ornek1;

/**
 *
 * @author anizam
 */
public class Test {

    public static void main(String[] args) {
        Saat s = new Saat(23,59,59);
        for (int i = 0; i < 100; i++) {
            s.saatKac();
            s.saniyeArttir();
        }
    }
}
