package collection;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList a2= new ArrayList<>();
        a2.add(2);
        a2.add("Shruti");
        a2.add(23.45);
        a2.add(null);
        a2.add(2);
        a2.add("Ashu");
        
        System.out.println(a2);
        System.out.println(a2.get(3));
               
             
        //addAll
        ArrayList a1= new ArrayList<>();
        a1.add("Java");
        a1.add("Selenium");
        a1.add("Python");
        a1.add("Ruby");
        
        System.out.println(a1);
        System.out.println("******************************");
        a2.addAll(a1);
        System.out.println(a2);
        
        //removeAll
        a2.removeAll(a1);
        System.out.println(a2);
        
        //1.Using for loop
        //2.Iterator
	}

}
