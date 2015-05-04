package com.test.FlyWeight;

public class Client {

	public static void main(String[] args) {
		Circle c = new Circle("red");
		Circle c1 = new Circle("black");
		Circle c2 = new Circle("blue");
		Circle c3 = new Circle("orange");
		Circle c4 = new Circle("red");
		Circle c5 = new Circle("black");
		
		c.moveCircle(10,40);
		c1.moveCircle(20,50);
		c2.moveCircle(30,60);
		c3.moveCircle(40,70);
		c4.moveCircle(50,80);
		c5.moveCircle(60,90);
	}
}
