package com.test.factoryPattern;

public class ContentFactory {

	public Content getContent(String contentType)
	{
		Content content = null;
		if(contentType==null)
			return null;
		
		if(contentType.equals("W"))
			content = new WallpaperConent();
		else if(contentType.equals("R"))
			content = new RingtoneContent();
		return content;
	}
}
