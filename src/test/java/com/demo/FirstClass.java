package com.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstClass {
	
@Test
public void add() {
	int a=5;
	int b=6;
	Assert.assertEquals(11, a+b);
	System.out.println("It is the sum method");
	System.out.println("The sum is : " + (a+b));
}

@Test
public void subtract() {
	int a=70;
	int b=54;
	Assert.assertEquals(16, a-b);
	System.out.println("It is the subtraction method");
	System.out.println("The subtraction is : " + (a-b));
}
@Test
public void multiply() {
	int a=25;
	int b=25;
	Assert.assertEquals(625, a*b);
	System.out.println("It is the multiplication method");
	System.out.println("The multiplication  is : " + (a*b));
}
@Test
public void divide() {
	int a=99;
	int b=9;
	Assert.assertEquals(11, a/b);
	System.out.println("It is the division method");
	System.out.println("The division is : " + (a/b));
}

}
