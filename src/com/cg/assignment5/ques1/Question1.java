package com.cg.assignment5.ques1;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
		ht1.put(1,"vara");
		ht1.put(4,"abhi");
		ht1.put(3,"anand");
		ht1.put(2,"saketh");
		
		
		for (Map.Entry m : ht1.entrySet())
		System.out.println(m.getKey() + " " + m.getValue());
	/*	int size = ht1.size(); // size of hashtable using size() function
		int bucketsize = 10; // bucket size
		System.out.println(size); // printing size of hashtable
		int loadfactor = size % bucketsize;
		System.out.println(loadfactor); // printing loadfactor*/

	}
}
//Iterator itr = keys.iterator();
	/*	Set<Integer> keys = ht1.keySet();
      Iterator<Integer> itr = keys.iterator();

      // traverse the TreeMap using iterator
      while (itr.hasNext()) {
          Integer i = itr.next();
          System.out.println(i + " " + ht1.get(i));
      }*/