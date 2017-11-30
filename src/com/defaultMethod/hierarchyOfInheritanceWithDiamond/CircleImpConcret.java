package com.defaultMethod.hierarchyOfInheritanceWithDiamond;

public class CircleImpConcret implements Circle, Shape{
	
	public void draw(){
		Shape.super.draw();
	}
	
	// Please note, As we can see there is a diamond problem i.e. Circle and shape have same signature default method
	// So if we don't override the draw() then it will not compile. We can chose to have pick up any implementation as 
	// per our requirement. We can pick any implementation from the parent default interface. 
	// "InerfaceThatWeWant.super.method()" 
	public static void main(String[] args) {
		new CircleImpConcret().draw();
	}
	
}
