package com.test.StatePattern;

public class TrafficSingalYellow implements TrafficSignalState {

	@Override
	public void changeState(TrafficLight trafficLight) {
		// TODO Auto-generated method stub
		trafficLight.setColor("yellow");
		trafficLight.setPauseTime(2000);
	}
}
