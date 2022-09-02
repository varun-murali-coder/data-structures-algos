package com.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
	    public static void plusMinus(List<Integer> arr) {
	    // Write your code here
	    int countPositive=0;
	    int countNegative=0;
	    int countZero=0;
	    List<BigDecimal> finalValues=new ArrayList<>();
	    for(Integer value:arr){
	        if(value>0){
	          countPositive++;  
	        }else if(value==0){
	        	countZero++; 
	        }else{
	            countNegative++;
	        }
	    };
	    finalValues.add( new BigDecimal(countPositive).divide(new BigDecimal(arr.size()),6,RoundingMode.CEILING));
	    finalValues.add( new BigDecimal(countNegative).divide(new BigDecimal(arr.size()),6,RoundingMode.CEILING));
	    finalValues.add( new BigDecimal(countNegative).divide(new BigDecimal(arr.size()),6,RoundingMode.CEILING));
	 System.out.println("Final list is:-"+finalValues);
//	   for(Integer val:finalValues){
//	       if(val>0)
//	       System.out.println(val);
//	   }
	    }



	public static void main(String[] args) {
		plusMinus(Arrays.asList(new Integer[] {1,1,0,-1,-1}));
	}

}
