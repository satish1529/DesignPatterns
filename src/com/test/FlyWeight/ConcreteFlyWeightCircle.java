package com.test.FlyWeight;

public class ConcreteFlyWeightCircle implements FlyWeightShape {

	String color;
	
	ConcreteFlyWeightCircle(String color)
	{
		this.color = color;
	}
	
	@Override
	public void move(int oldPositionx, int oldPositiony, int newPositionx,
			int newPositiony) {
		System.out.println("Moved "+color+" circle from :"+ oldPositionx
				+","+oldPositiony+" to " +newPositionx+","+newPositiony);
	}

}
