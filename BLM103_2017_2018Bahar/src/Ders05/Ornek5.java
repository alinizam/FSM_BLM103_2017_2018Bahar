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
public class Ornek5 {
    public static void main(String[] args) {
        int sinir=5;
          for (int i = 1; i <= sinir; i++) {
         
            for (int j = 1; j <= sinir - i +1 ; j++) {
                System.out.print(j+" ");
                
                
            }
            System.out.println( " ");
        }
    }
}
