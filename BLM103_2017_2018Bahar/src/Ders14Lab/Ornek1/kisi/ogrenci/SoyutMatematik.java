/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab.Ornek1.kisi.ogrenci;

import Ders14Lab.Ornek1.Matematik;

/**
 *
 * @author anizam
 */
public class SoyutMatematik  extends Matematik{

    public SoyutMatematik(int[] notlar) {
        super(notlar);
    }
    void metotA(){
        super.adi="Soyut";
    }
}
