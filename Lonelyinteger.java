package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lonelyinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int uinqueVal=lonelyinteger(Arrays.asList(new Integer[] {
				34, 95, 34, 64, 45, 95, 16, 80 ,80, 75, 3, 25, 75, 25, 31 ,3 ,64, 16, 31
		}));
		System.out.println(uinqueVal);

	}
	public static int lonelyinteger(List<Integer> a) {
	    // Write your code here
		HashMap<Integer,Integer>valToCountMap=new HashMap<>();
		int lonelyValue=0;
		for(Integer value:a) {
			if(valToCountMap.containsKey(value)) {
				valToCountMap.put(value, valToCountMap.get(value)+1);
			}else {
			valToCountMap.put(value,1);

			}
		}
		System.out.println("the new hash map is:-"+valToCountMap);
		for(Map.Entry<Integer, Integer>uniqueIdentifier:valToCountMap.entrySet()) {
			if(uniqueIdentifier.getValue()==1) {
				lonelyValue=uniqueIdentifier.getKey();
			}
			
		}
		return lonelyValue;

	    }

}
