package com.test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinMaxSum {

	public static void main(String[] args) {
		miniMaxSum(Arrays.asList(new Integer[] {5 ,5 ,5 ,5 ,5}));


	}


    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    int minValue=Collections.min(arr);
    int maxValue=Collections.max(arr);
    Optional<BigInteger> minSum=Optional.of(BigInteger.ONE);
    Optional<BigInteger> maxSum=Optional.of(BigInteger.ONE);
    if(!arr.isEmpty()){
        if(minValue!=maxValue){
    List<BigInteger> minValues=arr.stream().filter(val->val!=maxValue).
    		map(val->BigInteger.valueOf(val.intValue())).collect(Collectors.toList());

    minSum=minValues.stream().reduce(BigInteger::add);
     List<BigInteger> maxValues=arr.stream().filter(val->val!=minValue)
    		.map(val->BigInteger.valueOf(val.intValue())) .collect(Collectors.toList());
     maxSum=maxValues.stream().reduce(BigInteger::add);
        }else{
            List<BigInteger> finalValues=arr.stream().
                    map(val->BigInteger.valueOf(val.intValue())).collect(Collectors.toList());
                    finalValues.remove(0);
                 maxSum=finalValues.stream().reduce(BigInteger::add);minSum=finalValues.stream().reduce(BigInteger::add);
                }
        	
        System.out.print(minSum.get()+" "+maxSum.get());

    }
     else{
        System.out.print(minSum.get()+" "+maxSum.get());
    }
    }
}
