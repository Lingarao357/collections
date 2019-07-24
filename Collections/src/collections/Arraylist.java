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
public class Arraylist {
    public static void main(String[] args) {
        List<String> li=new ArrayList();
        li.add("abc");
        li.add("xyz");
        li.add("pqrs");
        li.add("tuv");
//        System.out.println("Geting the value: "+li.get(1));
//        System.out.println(li);
//        Iterator<String> i=li.iterator();
//        for( i.hasNext()){
//        
//            System.out.println(i.next());
//        }
//
//         while(i.hasNext()){
//             System.out.println(i.next());
//         }       
       List<String> li1=new LinkedList(li);

        li1.add("abc");
        li1.add("xyz");
        li1.add("pqrs");
        li1.add("tuv");
        System.out.println(li1);
        Iterator<String> i1=li1.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }

    }
    }

