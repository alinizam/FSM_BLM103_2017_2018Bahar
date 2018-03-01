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
public class Ornek2a {
    public static void main(String[] args) {
        double maas = 10000;
        int ay =2;
        
        if(ay>=1){
            maas = maas + (maas/10);
        }
        if(ay>=2){
            maas = maas + (maas/10);
        }
        if(ay>=3){
            maas = maas + (maas/10);
        }
        System.out.println(ay+". ayin maasi = "+maas);
    }
}
