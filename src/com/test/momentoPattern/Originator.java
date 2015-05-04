package com.test.momentoPattern;
public class Originator
{
	String state;

	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public Momento saveState()
	{
		return new Momento(this.state);
	}
	
	public void undoState(Object momento)
	{
		this.state = ((Momento)momento).getState();
	}
	
	private class Momento
	{
		String state;
		private String getState() {
			return state;
		}

		Momento(String state) {
			this.state = state;
		}
	}
}
