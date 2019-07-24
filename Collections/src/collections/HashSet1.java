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
public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet();
        set.add("abc");
        set.add("xyz");
        set.add("control");
        set.add("string");
        set.add("boolean");
        Iterator<String> li=set.iterator();
//        for(li.hasNext()){
//        System.out.println(li.next());}
          System.out.println(set);
          set.remove("string");
          System.out.println(set);
          HashSet<String> set1=new HashSet();
          set1.add("phy");
          set1.add("che");
          set1.add("sco");
          set1.addAll(set);
          System.out.println(set1);
          set.removeAll(set1);
          System.out.println(set);
        }
    }

