/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 *
 * @author Linga357
 */import java.util.*;
public class Hashtble1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
             ht.put(100,"Amit");
             ht.put(101,"Amit");    
             ht.put(102,"Amit");    
             ht.put(103,"Amit");    
             ht.put(104,"Amit");    
             ht.put(105,"Amit");    
             ht.put(106,"Amit"); 
             System.out.println("Hashtable : "+ht );
             ht.putIfAbsent(107, "value");
             System.out.println("Hashtable :"+ht);


    }
    
}
