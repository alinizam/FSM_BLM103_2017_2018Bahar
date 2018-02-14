/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders01_Lab;

/**
 *
 * @author anizam
 */
public class Ornek6_1 {
    public static void main(String[] args) {
        int fn,fn_1=1,fn_2=0;
        
        
        System.out.println("0. ad?m = "+fn_2);
        System.out.println("1. ad?m = "+fn_1);
        fn=fn_1+fn_2;
        System.out.println("2. ad?m = "+fn);
        fn_2=fn_1;
        fn_1=fn;
                 
        fn=fn_1+fn_2;
        System.out.println("3. ad?m = "+fn);
        fn_2=fn_1;
        fn_1=fn;
             
        fn=fn_1+fn_2;
        System.out.println("4. ad?m = "+fn);
        fn_2=fn_1;
        fn_1=fn;
        
        
         fn=fn_1+fn_2;
        System.out.println("5. ad?m = "+fn);
    }
}
