package com.test.factoryPattern;

import java.util.Scanner;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String typeOfContent = null;
		Content content = null;
		ContentFactory contentFactory = new ContentFactory();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What type of content? (W/R)");
		
		if(sc.hasNextLine())
		{
			typeOfContent = sc.nextLine();
			content = contentFactory.getContent(typeOfContent) ;
		}
	
		if(content!=null)
		{
			content.getContent();
		}
		else
		{
			System.out.println("Please enter type of content");
		}
		
	}

}
