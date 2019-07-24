/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Linga357
 */
public class Hashset {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet();
        set.add("Lingarao");
        set.add("anil");
        set.add("naveen");
        set.add("mani");
        set.add("reddy");
        set.add("Lingarao");
        set.add("mani");
        Iterator<String> l=set.iterator();
        while(l.hasNext()){
            System.out.println(l.next());
        }
        
    }
 
}
