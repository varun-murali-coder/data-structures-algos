package com.test;

import java.util.ArrayList;
import java.util.List;

public class SquareMatrixDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static int diagonalDifference(List<List<Integer>> arr) {
		    // Write your code here
		 int absDifference=0;
		 List<Integer> leftSide=new ArrayList<>();
		 List<Integer> rightSide=new ArrayList<>();
		 for(int i=0;i<=arr.size()-1;i++) {
			 leftSide.add(arr.get(i).get(i));
		 }
		 for(int i=0;i<=arr.size()-1;i++) {
			 rightSide.add(arr.get(i).get((arr.size()-1)-i));
		 }
		 Integer left=leftSide.stream().reduce(0, Integer::sum);
		 Integer right=rightSide.stream().reduce(0, Integer::sum);
		 absDifference=Math.abs(left.intValue()-right.intValue());

		 return absDifference;

		    }

}
