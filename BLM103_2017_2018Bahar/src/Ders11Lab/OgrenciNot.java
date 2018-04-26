/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders11Lab;

/**
 *
 * @author anizam
 */
public class OgrenciNot {
    int notlar[];
    String dersAdi;
    int ogrenciNo;
    int getNotOrtalama(){
        int toplam=0;
        for (int o : notlar) {
            toplam+=o;
        }
        return toplam/notlar.length;
    }
}
