/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03Lab;

/**
 *
 * @author anizam
 */
public class Ornek1a {

    public static void main(String[] args) {
        int not = 60;
        String harfNot = "";
        if (not >= 70 && not <= 100) {
            harfNot = "AA";
        }
        if (not >= 40 && not < 70) {
            harfNot = "CC";
        }
        if (not >= 0 && not < 40) {
            harfNot = "FF";
        }
        if (not < 0 && not > 100) {
            harfNot = "Hata";
        }
        System.out.println(harfNot);
    }

}
