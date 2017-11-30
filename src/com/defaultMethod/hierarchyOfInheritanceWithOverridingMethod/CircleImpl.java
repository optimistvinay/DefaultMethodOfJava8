package com.defaultMethod.hierarchyOfInheritanceWithOverridingMethod;

public class CircleImpl implements Circle, Shape{

	@Override
	public void draw() {
		
		System.out.println("Calling from Interface Drawing from CircleImpl!!!!!!");
	}
	



}
