package com.defaultMethod.hierarchyOfInheritanceWithConcretClass;

public class CircleImpConcret extends CircleImpl implements Circle, Shape{

	// Please note, even if we are extending the class from CircleImpl, CircleImpl does not override
	// draw() methods in that case will pick from Circle implementation.
	public static void main(String[] args) {
		new CircleImpConcret().draw();
	}
	
}
