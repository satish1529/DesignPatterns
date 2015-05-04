package com.test.CompositePattern;
public class Service implements CategoryTree {

	String name;
	
	Service(String name)
	{
		this.name = name;
	}
	
	@Override
	public void addChild(CategoryTree categoryTree) {
		System.out.println("Add is not supported. This is leaf");
	}

	@Override
	public void prefixName(String prefix) {
		this.name = prefix+this.name;
	}

	@Override
	public void printName(int count) {
		printSpaces(count);
		count++;
		System.out.println(this.name);
	}
	
	public void printSpaces(int count)
	{
		System.out.print(" ");
		CategoryTree.printStaticSpaces(count);
	}
}
