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
public class Listinterface {

    public Listinterface(int par, String anil, String ravi, int par1, Object par4) {
    }
    public static void main(String[] args) {
      List<Listinterface1> list =new ArrayList<Listinterface1>(); 
      Listinterface1 L1=new Listinterface1(1,"Anil","ravi",1);
      Listinterface1 L2=new Listinterface1(1, "naveen", "rohal", 1);
      Listinterface1 L3=new Listinterface1(1, "mani", "vgs", 1);
      list.add(L1);
      list.add(L2);
      list.add(L3);
      for(Listinterface1 Bi:list ){
        System.out.println(Bi.id+" "+Bi.name+" "+Bi.publisher+" "+Bi.quality);
      }
    }
}
