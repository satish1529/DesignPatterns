package com.test.StatePattern;

public class Client {

	public static void main(String[] args) {
		
		TrafficLight trafficLight = new TrafficLight();
		trafficLight.setColor("red");
		
		TrafficSingalContext trafficSingalContext = new TrafficSingalContext();
		while(true)
		{
			trafficSingalContext.changeToGreen(trafficLight);
			trafficSingalContext.changeToYellow(trafficLight);
			trafficSingalContext.changeToRed(trafficLight);
		}
	}
}
