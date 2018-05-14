 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14.Ornek2;

/**
 *
 * @author anizam
 */
public class Test {
    public static void main(String[] args) {
       // ISekil sekil=new ISekil();
        Oda o = new Oda();
        o.elemanlar.add(new Ucgen(1,4));
        o.elemanlar.add(new Dikdortgen(2,4));
     //   o.elemanlar.add(new Sekil());
        System.out.println(o.getToplamAlan());
    }
}
