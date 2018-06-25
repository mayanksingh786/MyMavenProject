package com.demo;

import org.testng.annotations.Test;

public class ThirdClass {
	
@Test
public void arearectangle() {
	int a=60;
	int b=70;
	System.out.println("This is the Area of the rectangle");
	System.out.println("the area of the rectangle is  : " + (a*b));
}

@Test
public void perirectangle() {
	int a=50;
	int b=60;
System.out.println("this is perimeter of the rectangle");
System.out.println("the perimeter of the rectangle is  : " + 2*(a+b));

}
@Test
public void areatriangle() {
	int a=36;
	int b=31;
	System.out.println("This is the area of the triangle ");
	System.out.println("The area of the triangle is  : " + 0.5*a*b);
}


}
