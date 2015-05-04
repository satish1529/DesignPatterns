package com.test.CompositePattern;

public interface CategoryTree {

	void addChild(CategoryTree categoryTree);
	
	void prefixName(String prefix);

	void printName(int count);
	
	default void printSpaces(int count)
	{
		for(int i =0;i<count;i++)
			System.out.print(" ");
	}
	
	static void printStaticSpaces(int count)
	{
		for(int i =0;i<count;i++)
			System.out.print(" ");
	}
}
