/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12.Ornek4;

/**
 *
 * @author anizam
 */
public class Isci extends Personel{
    int maas;

    @Override
    int getMaas() {
        return super.getMaas()*110/100;
    }
     
}
