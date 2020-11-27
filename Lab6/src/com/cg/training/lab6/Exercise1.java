package com.cg.training.lab6;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hashMap=new HashMap<>();
		acceptValues(hashMap);
		
		
	}

	private static void displayValues(Map<Integer, String> hashMap) {
		// TODO Auto-generated method stub
		//System.out.println(hashMap);
		System.out.println("\nBefore sorting.....");
		for(Map.Entry<Integer,String> mobj:hashMap.entrySet()) {
			System.out.println(mobj.getKey()+ ":"+ mobj.getValue());
		}
		
		//list to store hashmap
		List<Map.Entry<Integer,String>> list=
				new LinkedList<Map.Entry<Integer,String>>(hashMap.entrySet());
	
		//sort list
		Collections.sort(list,
				new Comparator<Map.Entry<Integer, String>>(){

					@Override
					public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {

						return o1.getValue().compareTo(o2.getValue());
					}
			
		}
		);
		
//		Map<Integer,String> sorted=new HashMap<Integer,String>();
//		for(Map.Entry<Integer,String> slist:list) {
//			sorted.put(slist.getKey()+" : "+slist.getValue());
//		}
		
		//add list into map
		HashMap<Integer, String> temp = new LinkedHashMap<Integer, String>(); 
        for (Map.Entry<Integer, String> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        
		System.out.println("\nAfter sorting.....");

        for(Map.Entry<Integer,String> sobj:temp.entrySet()) {
        	System.out.println(sobj.getKey()+" : "+sobj.getValue());
        }
        
	}

	private static void acceptValues(Map<Integer, String> hashMap) {

		hashMap.put(1,"java");
		hashMap.put(2,"c++");
		hashMap.put(4,"php");
		hashMap.put(3,"android");
//		System.out.println(hashMap);
		displayValues(hashMap);

	}

}
