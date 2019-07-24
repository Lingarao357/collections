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
public class HashMap1 {
    public static void main(String[] args) {
       Map <Integer,String> map= new HashMap<Integer,String>();
        map.put(101,"apple");
        map.put(102, "grip");
        map.put(103, "banana");
        map.put(104, "guva");
        map.put(105,"brid");
        System.out.println(map);
       for(Map.Entry m:map.entrySet()){
           System.out.println(m.getKey()+" "+m.getValue());
       }}
       

    }

