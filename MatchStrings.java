package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		matchingStrings(Arrays.asList(new String[] {"ab","ab","abc"}),
				Arrays.asList(new String[] {"ab","ab","bc"}));

	}
	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
	    // Write your code here
		List<Integer> matchingCount=new ArrayList<>();
		int count=0;
		if(!strings.isEmpty() && !queries.isEmpty()) {
				for(String query:queries) {
					for(String str:strings) {
					if(str.equals(query)) {
						count++;
					}
				}
				matchingCount.add(count);
				count=0;
			}
		}
		System.out.println(matchingCount);
		
		return matchingCount;

	    }

}
