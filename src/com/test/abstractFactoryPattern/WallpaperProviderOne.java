package com.test.abstractFactoryPattern;

public class WallpaperProviderOne extends AbstractWallpaper {

	WallpaperProviderOne()
	{
		System.out.println("Wallpaper Provider One");
	}
	
	@Override
	public void wallpaperProvider() {
		System.out.println("Wallpaper Provider One");
	}
}
