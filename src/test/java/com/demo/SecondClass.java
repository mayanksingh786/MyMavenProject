package com.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondClass {

	@Test
	public void modulus() {
		int a=56;
		int b=6;
		Assert.assertEquals(2, a%b);
		System.out.println("It is the modulus method");
		System.out.println("The modulus is  : " + (a%b));
	}
  @Test
  public void square() {
	  int a=87;
	  Assert.assertEquals(7569, a*a);
	  System.out.println("It is the square method");
	  System.out.println("The square is  : " + (a*a));
  }
 @Test
 public void cube() {
	 int a=6;
	 Assert.assertEquals(216, a*a*a);
	 System.out.println("It is the cube method");
	 System.out.println("The cube is : " + (a*a*a));
 }
}
