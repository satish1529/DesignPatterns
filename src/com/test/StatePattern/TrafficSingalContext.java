package com.test.StatePattern;
public class TrafficSingalContext {
	
	private TrafficSignalState trafficSignalState = null;
	TrafficSingalContext()
	{
		trafficSignalState = new TrafficSingalRed();
	}
	
	public void changeToRed(TrafficLight trafficLight) {
		if(trafficSignalState instanceof  TrafficSingalYellow)
		{
			trafficSignalState = new TrafficSingalRed();
		}
		else
		{
			System.out.println("invalid operation");
		}
		this.changeState(trafficLight);
	}
	
	public void changeToYellow(TrafficLight trafficLight) {
		if(trafficSignalState instanceof  TrafficSingalGreen)
		{
			trafficSignalState = new TrafficSingalYellow();
		}
		else
		{
			System.out.println("invalid operation");
		}
		this.changeState(trafficLight);
	}
	
	public void changeToGreen(TrafficLight trafficLight) {
		if(trafficSignalState instanceof  TrafficSingalRed)
		{
			trafficSignalState = new TrafficSingalGreen();
		}
		else
		{
			System.out.println("invalid operation");
		}
		this.changeState(trafficLight);
	}
	
	public void changeState(TrafficLight trafficLight) {
		trafficSignalState.changeState(trafficLight);
		try {
			System.out.println("current state : "+trafficLight.getColor());
			Thread.sleep(trafficLight.getPauseTime());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
