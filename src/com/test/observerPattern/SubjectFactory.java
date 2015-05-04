package com.test.observerPattern;

public class SubjectFactory {

	static volatile Subject s = null;
	
	public static Subject getInstance()
	{
		if(s==null)
		{
			s = new SubjectImpl();
		}
		return s;
	}
}
