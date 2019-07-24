/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Linga357
 */ 

import java.util.*;

public class Testsort1 {
    public static void main(String[] args) {
      List<Student> li=new ArrayList<>();
        li.add(new Student(101,"vija",23));
        li.add(new Student(102,"ajai",24));
        li.add(new Student(104,"dsf",22));
        Comparator<Student> cm1=Comparator.comparing(Student::getName);  
            Collections.sort(li,cm1);  
               System.out.println("Sorting by Name");  
                 for(Student st: li){  
        System.out.println(st.rollno+" "+st.name+" "+st.age);  
     } 
                 Comparator<Student> cm2=Comparator.comparing(Student::getAge);
                  Collections.sort(li, cm2);
                  System.out.println("Sorting by Age");
                  for(Student s:li){
                  System.out.println(s.rollno+" "+s.name+" "+s.age);
                  }

    }
}
