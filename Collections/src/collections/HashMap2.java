/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Linga357
 */
public class HashMap2 {
    public static void main(String[] args) {
        Map<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(100, "value");
        hm.put(101, "value");
        hm.put(102, "value");
        hm.put(103, "value");
        hm.put(105, "value");
       
        hm.replace(104, "apple", "banagana");
        for(Map.Entry h:hm.entrySet()){
            System.out.println(h.getKey()+"  "+h.getValue());
        }
    }
}
