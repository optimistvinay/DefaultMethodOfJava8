package com.defaultMethod.simpleInheritance;

public interface Drawing {
	
	public default void dispay(){
		System.out.println("Calling from Interface Drawing !!!!!!");
	}

}
