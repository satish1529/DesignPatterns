package com.test.abstractFactoryPattern;

public class RingtoneProviderOne extends AbstractRingtone {

	RingtoneProviderOne()
	{
		System.out.println("Ringtone Provider One");
	}
	
	@Override
	public void ringtoneProvider() {
		System.out.println("Ringtone Provider One");
	}
}
