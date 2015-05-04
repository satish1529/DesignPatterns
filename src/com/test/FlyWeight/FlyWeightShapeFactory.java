package com.test.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightShapeFactory {

	private static Map<String,FlyWeightShape> shapeColors = new HashMap<String,FlyWeightShape>();
	
	public static FlyWeightShape getShape(String color)
	{
		FlyWeightShape shape = 	shapeColors.get(color);
		if(shape == null)
		{
			shape = new ConcreteFlyWeightCircle(color);
			shapeColors.put(color, shape);
		}
		return shape;
	}
}
