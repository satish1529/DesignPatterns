package com.test.abstractFactoryPattern;

public class ProviderTwoFactory extends AbstractProviderFactory 
{

	@Override
	public AbstractRingtone createProviderRingtone() {
		// TODO Auto-generated method stub
		AbstractRingtone abstractRingtone = new RingtoneProviderTwo(); 
		return abstractRingtone;
	}

	@Override
	public AbstractWallpaper createProviderWallpaper() {
		// TODO Auto-generated method stub
		AbstractWallpaper abstractWallpaper = new WallpaperProviderTwo();
		return abstractWallpaper;
	}
}
