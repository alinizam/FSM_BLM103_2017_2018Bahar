/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders04Lab;

/**
 *
 * @author anizam
 */
public class Ornek3 {

    public static void main(String[] args) {
      
        for (int j = 0; j < 10; j++) {
            int f = 1;
            for (int i = 1; i <= j; i++) {
                f = f * i;
            }
            System.out.println(j + " faktöriyel = " + f);
        }
        
    }
}
