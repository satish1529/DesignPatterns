package com.test.StatePattern;

public class TrafficSingalRed implements TrafficSignalState {


	@Override
	public void changeState(TrafficLight trafficLight) {
		// TODO Auto-generated method stub
		trafficLight.setColor("red");
		trafficLight.setPauseTime(3000);
	}

}
