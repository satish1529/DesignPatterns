package com.test.abstractFactoryPattern;

/**
 * 
 * @author satish.k
 *
 */
public abstract class AbstractProviderFactory 
{
	public abstract AbstractRingtone createProviderRingtone();
	
	public abstract AbstractWallpaper createProviderWallpaper();
}
