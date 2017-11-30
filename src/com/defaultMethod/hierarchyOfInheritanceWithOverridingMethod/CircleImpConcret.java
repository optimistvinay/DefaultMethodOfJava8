package com.defaultMethod.hierarchyOfInheritanceWithOverridingMethod;

public class CircleImpConcret extends CircleImpl implements Circle, Shape{

	
	
	// Please note, As we are extending the class from CircleImpl, CircleImpl does override
	// draw() methods in that case will pick from CircleImpl implementation.
	public static void main(String[] args) {
		new CircleImpConcret().draw();
	}
	
}
