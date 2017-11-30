package com.defaultMethod.hierarchyOfInheritanceWithConcretClass;

public interface Circle extends Shape {
	
	public default void draw(){
		System.out.println("Calling from Interface Drawing from Circle!!!!!!");
	}
	

}
