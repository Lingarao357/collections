/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Map;
import java.util.*;
/**
 *
 * @author Linga357
 */
public class HashMap4 {
    public static void main(String[] args) {
        Map<Integer,HashMap3> map=new HashMap<Integer,HashMap3>();
        
        HashMap3 hm3=new HashMap3(102,"Audi","Audiq1",5);
        HashMap3 hm4=new HashMap3(202,"BMW","Bmw1",5);
        HashMap3 hm5=new HashMap3(370,"Benz","Benz1",5);
        HashMap3 hm6=new HashMap3(420,"audi","audiq2",6);
        map.put(1,hm3);
        map.put(2, hm4);
        map.put(3,hm5);
        map.put(4,hm6);
        for(Map.Entry<Integer,HashMap3> e:map.entrySet()){
            int key= e.getKey();
            HashMap3 sh= e.getValue();
                    System.out.println(key+" Details:");  
        System.out.println(sh.id+"  "+sh.carname+"  "+sh.model+"  "+sh.doors);   

            System.out.println();
        }
    }
}
