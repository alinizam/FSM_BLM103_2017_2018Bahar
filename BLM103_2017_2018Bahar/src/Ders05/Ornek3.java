/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

/**
 *
 * @author anizam
 */
public class Ornek3 {

    public static void main(String[] args) {
        int f = 1;
        int sinir = 6;
        for (int i = 2; i <= sinir; i++) {
            f = f * i;
            int temp = f;
            for (int j = 0; j <= sinir - i ; j++) {
                System.out.print(temp + "    ");
                if (i % 2 == 0) {
                    temp++;
                } else {
                    temp--;
                }
                
            }
            System.out.println( " ");
        }
    }
}
