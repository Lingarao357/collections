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

public class TreeMap5 {

    public static void main(String[] args) {
        NavigableMap<Integer, String> m = new TreeMap();
        m.put(1, "AAvalue");
        m.put(2, "BBvalue");
        m.put(3, "CCvalue");
        m.put(4, "DDvalue");
        System.out.println("LinkedHashMapBeforeUseRemoveMethod:" + m);
        ///        m.get(3);
        System.out.println("LinkedHashMapGetuse:" + m.get(3));
        System.out.println("LinkedHashmapDescendingmap:" + m.descendingMap());
        System.out.println("LinkedHashMapAscending :"+m.descendingKeySet());
        System.out.println("LinkedHashmapHeadMap:" + m.headMap(2,true));
        System.out.println("LinkedHashmapTillMap:"+m.tailMap(2,true));
        System.out.println("LinkedHashmapSubMap:"+m.subMap(1, 3));
    }

}
