/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.*;
import java.util.Comparator;
/**
 *
 * @author Linga357
 */
public abstract class AgeComparator implements Comparator<Student> {
  public int compare(Student s1,Student s2){  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
  }
    
}
