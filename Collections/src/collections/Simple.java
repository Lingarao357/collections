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
import java.util.ArrayList;
import java.util.Collections;
public class Simple {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();  
al.add(new Student(101,"Vijay",23));  
al.add(new Student(106,"Ajay",27));  
al.add(new Student(105,"Jai",21));  
  
//System.out.println("Sorting by Name");  
//  
//Collections.sort(al,new NameComparator());  
//for(Student st: al){  
//System.out.println(st.rollno+" "+st.name+" "+st.age);  
//}  
  
System.out.println("Sorting by age");  
  
Collections.sort(al,new AgeComparator() {});  
for(Student st: al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  

    }
}
