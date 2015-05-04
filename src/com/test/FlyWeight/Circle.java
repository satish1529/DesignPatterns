package com.test.FlyWeight;

public class Circle {

	private FlyWeightShape shape = null;
	
	int currentPositionx=10;
	
	int currentPositiony=10;
	
	Circle(String color)
	{
		shape = FlyWeightShapeFactory.getShape(color);
	}
	
	public void moveCircle(int newPositionx,int newPositiony)
	{
		shape.move(currentPositionx, currentPositiony, newPositionx, newPositiony);
		currentPositionx = newPositionx;
		currentPositiony = newPositiony;
	}
}
