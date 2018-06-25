package com.demo;

import org.testng.annotations.Test;

public class FourthClass {
	int a=9;
	int b=10;
	int c=11;
	
@Test
public void areacuboid() {
System.out.println("This is the area of the cuboid");
System.out.println("The area of the cuboid is : " + (a*b*c));
}
@Test
public void lsacuboid() {
	System.out.println("This is the lateral surface area of the cuboid");
	System.out.println("The las of the cuboid is  : " + 2 *(a*c + b*c));

}

@Test
public void tsacuboid() {
	System.out.println("This is the total surface area of the cuboid");
	System.out.println("The total surface area of the cuboid is : " + 2*(a*b+b*c+c*a));
}
}

