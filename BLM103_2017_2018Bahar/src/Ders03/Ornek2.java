/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        int x=3;
        
        System.out.println(++x);
        
        System.out.println(x++);
        
        System.out.println(x);
        
        x=1;
        int y=(3*x++)+(2*--x);
        System.out.println(y);
        
        x=(++x)*3;
        System.out.println(x);
        
        y+=x;  //y=y+x;
        y*=x;  //y=y*x;
        y-=x;  //y=y-x;
        
    }
}
