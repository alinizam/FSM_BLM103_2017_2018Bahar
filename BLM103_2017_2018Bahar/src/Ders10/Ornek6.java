/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

/**
 *
 * @author anizam
 */
public class Ornek6 {

    public static void main(String[] args) {
        int sayilar[][] = new int[3][4];
        sayilar[0][0] = 5;
        sayilar[0][1] = 3;
        sayilar[1][0] = 4;
        sayilar[2][0] = 1;
        sayilar[2][2] = 7;
        sayilar[2][3] = 5;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.print(sayilar[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("--Toplam alma---");

        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                toplam += sayilar[i][j];
            }
        }
        System.out.println("Toplam = " + toplam);

        System.out.println("--Sat?r toplamlar?n? yazd?r?n?z.---");
       
        for (int i = 0; i < sayilar.length; i++) {
            int toplam1 = 0;
            for (int j = 0; j < sayilar[i].length; j++) {
                toplam1 += sayilar[i][j];
            }
            System.out.println(toplam1);
        }
        
        System.out.println("--Sütunlar?n toplamlar?n? yazd?r?n?z.---");
       
        for (int i = 0; i < sayilar[0].length; i++) {
            int toplam1 = 0;
            for (int j = 0; j < sayilar.length; j++) {
                toplam1 += sayilar[j][i];
            }
            System.out.println(toplam1);
        }
        
    }

}
