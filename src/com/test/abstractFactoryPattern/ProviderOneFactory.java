package com.test.abstractFactoryPattern;

public class ProviderOneFactory extends AbstractProviderFactory 
{

	@Override
	public AbstractRingtone createProviderRingtone() {
		// TODO Auto-generated method stub
		AbstractRingtone abstractRingtone = new RingtoneProviderOne(); 
		return abstractRingtone;
	}

	@Override
	public AbstractWallpaper createProviderWallpaper() {
		// TODO Auto-generated method stub
		AbstractWallpaper abstractWallpaper = new WallpaperProviderOne();
		return abstractWallpaper;
	}
	
}
