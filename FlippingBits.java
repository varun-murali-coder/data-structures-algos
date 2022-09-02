package com.test;

public class FlippingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(flippingBits(2147483647l));

	}
	public static long flippingBits(long n) {
	    // Write your code here
		String binaryString=Long.toBinaryString(n);
		String s=String.format("%32s", binaryString).replaceAll(" ", "0");
		s=s.replaceAll("0", "5");
		s=s.replaceAll("1", "0");
		s=s.replaceAll("5", "1");
		return Long.parseLong(s,2);

	    }

}
