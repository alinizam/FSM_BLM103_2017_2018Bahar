/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.util.ArrayList;

/**
 *
 * @author anizam
 */
public class Ornek1 {

    public static void main(String[] args) {
        ArrayList iller=new ArrayList();  
        iller.add("Istanbul");
        iller.add("Ankara");
        iller.add("?zmir");
       
        System.out.println(iller.size());
        
        System.out.println(iller.get(2));   
        
        System.out.println("?zmirin s?ras?: "+iller.indexOf("?zmir"));
        
        iller.remove("?zmir");
        System.out.println("Tüm elemanlar -----");
        for (int i = 0; i < iller.size(); i++) {
            System.out.println(iller.get(i));
        }
        
        System.out.println("Haz?r metotla tüm elemanlar -----");
        System.out.println(iller);
        
    }
}
