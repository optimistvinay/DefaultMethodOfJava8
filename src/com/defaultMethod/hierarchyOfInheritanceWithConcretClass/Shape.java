package com.defaultMethod.hierarchyOfInheritanceWithConcretClass;

public interface Shape {

	public default void draw(){
		System.out.println("Calling from Interface Drawing from Shape!!!!!!");
	}
	
}
