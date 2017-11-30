package com.defaultMethod.hierarchyOfInheritanceWithDiamond;

public interface Shape {

	public default void draw(){
		System.out.println("Calling from Interface Drawing from Shape!!!!!!");
	}
	
}
