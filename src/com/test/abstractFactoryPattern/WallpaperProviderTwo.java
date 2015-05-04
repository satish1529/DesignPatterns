package com.test.abstractFactoryPattern;

public class WallpaperProviderTwo extends AbstractWallpaper {

	WallpaperProviderTwo()
	{
		System.out.println("Wallpaper Provider Two");
	}
	
	@Override
	public void wallpaperProvider() {
		System.out.println("Wallpaper Provider Two");
	}

}
