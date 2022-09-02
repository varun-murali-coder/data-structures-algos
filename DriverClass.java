package com.test;

class X { 
static int i = 1111; 
static{ i = i-- - --i; //L1 }//1111-1109=2
}
 { i = i++ + ++i; //L2 }0+2=2;
 }
 
 }
 class Y extends X{ 
static{ 
i = --i - i--; //1-1=0
//L3
 }
 { 
i = ++i + i++; //3+3=6
//L4 }
 }
 }
public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y y = new Y(); System.out.println(y.i); //L5
	}

}
