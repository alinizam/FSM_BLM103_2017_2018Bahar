/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab.Soru2;

/**
 *
 * @author anizam
 */
public class Test {

    public static void main(String[] args) {
        Fabrika f = new Fabrika();
        f.yeniPersonelEkle(new Personel("Ahmet", "Ak", "Müdür", 1000000));
        f.yeniPersonelEkle(new Personel("Mehmet", "Ak", "??çi", 10000));
        f.yeniPersonelEkle(new Personel("Ay?e", "Ak", "??çi", 10000));
        
        System.out.println(f.toplamMaasiBul("Müdür"));
    }
}
