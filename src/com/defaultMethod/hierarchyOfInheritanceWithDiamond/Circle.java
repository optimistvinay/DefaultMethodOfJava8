package com.defaultMethod.hierarchyOfInheritanceWithDiamond;

public interface Circle {
	
	public default void draw(){
		System.out.println("Calling from Interface Drawing from Circle!!!!!!");
	}
	

}
