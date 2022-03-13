package com.foray.core;

public abstract class Shape {
	String color;
	public Shape(String color) {
		this.color=color;
	}
	abstract double area() ;
	abstract String info();
	
	public String getColor()
	{
		return color;
	}
}
