package com.defaultMethod.hierarchyOfInheritance;

public class CircleImpl implements Circle, Shape{
	
	public static void main(String[] args) {
		//Both Shape and Circle interface is having method draw but as most specific
		// default-providing interface is Circle as Circle extends Shape. So it will pick up
		// the implementation of circle.
		new CircleImpl().draw();
	}

}
