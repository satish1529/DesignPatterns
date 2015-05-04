package com.test.StatePattern;

public class TrafficSingalGreen implements TrafficSignalState {

	@Override
	public void changeState(TrafficLight trafficLight) {
		// TODO Auto-generated method stub
		trafficLight.setColor("green");
		trafficLight.setPauseTime(5000);
	}
}
