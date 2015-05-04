package com.test.abstractFactoryPattern;
import java.util.Scanner;
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String provider = null;
		AbstractProviderFactory abstractProviderFactory =null;
		Scanner sc = new Scanner(System.in);
		System.out.println("What type of provider? (1/2)");
		if(sc.hasNextLine())
		{
			provider = sc.nextLine();
			if(provider.equals("1"))
			{
				abstractProviderFactory = new ProviderOneFactory();
			}
			else if (provider.equals("2"))
			{
				abstractProviderFactory = new ProviderTwoFactory();
			}
			else
			{
				System.out.println("Please select provider...");
				System.exit(1);
			}
		}
		if(abstractProviderFactory!=null)
		{
			abstractProviderFactory.createProviderWallpaper();
			abstractProviderFactory.createProviderRingtone();
		}
	}
}
