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
public class Ornek2 {

    public static void main(String[] args) {
        
        String iller[]={"Istanbul","Ankara"};

        for (String il : iller) {
            System.out.println(il+".in isminin karakter uzunlu?u "+il.length());
        }
        
        ArrayList<String> illerList = new ArrayList();
        illerList.add("Istanbul");
        illerList.add("Ankara");
        illerList.add("?zmir");
        
        for (String il : illerList) {
            System.out.println(il+".in isminin karakter uzunlu?u "+il.length());
        }
        
    }
}
