package com.test.abstractFactoryPattern;

public class RingtoneProviderTwo extends AbstractRingtone {

	RingtoneProviderTwo()
	{
		System.out.println("Ringtone Provider Two");
	}
	
	@Override
	public void ringtoneProvider() {
		System.out.println("Ringtone Provider Two");
	}
}
