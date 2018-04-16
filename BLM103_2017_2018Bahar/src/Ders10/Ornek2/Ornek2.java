/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10.Ornek2;

/**
 *
 * @author anizam
 */
public class Ornek2 {

    public static void main(String[] args) {
        int maas1 = 1000, maas2 = 500, maas3 = 600, maas4 = 400, maas5 = 500;
        int toplamMaas = maas1 + maas2 + maas3 + maas4 + maas5;
        System.out.println("Toplam Maa? = " + toplamMaas);
        
        int maaslar[]=new int[10];
        maaslar[0]=1000;
        maaslar[1]=500;
        maaslar[2]=600;
        maaslar[3]=400;
        maaslar[4]=500;
        
        //alternatif dzi tan?mlama ?ekli
        int maaslar1[]={1000,500,600,400,500};
        
        
        toplamMaas=maaslar[0]+maaslar[1]+maaslar[2]+maaslar[3]+maaslar[4];
        System.out.println("toplam ma? dize üzerinden : "+toplamMaas);
        
        for (int i = 0; i < 10; i++) {
            System.out.println(maaslar[i]);
        }
        toplamMaas=0;
        for (int i = 0; i < 10; i++) {
            toplamMaas=toplamMaas+maaslar[i];
        }
    }
}
