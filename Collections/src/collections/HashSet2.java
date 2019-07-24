/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 *
 * @author Linga357
 */
import java.util.*;
public class HashSet2 {
    public static void main(String[] args) {
       HashSet<String> set=new HashSet();
       set.add("combine");
       set.add("abc");
       set.add("xyz");
       set.add("integer");
       set.add("String");
       set.add("char");
       set.add("dell");
       set.add("lenovo");
       set.add("thinkpad");
       
    
       HashSet<String> set1=new HashSet(set);
       set1.add("gnt");
       set1.add("bza");
       set1.add("sc");
       set1.add("vkn");
       set1.add("ongle");
           Iterator<String> i=set1.iterator();
           while(i.hasNext()){
               System.out.println(i.next());
           }
           
       
    
    }
    
    
    
}
