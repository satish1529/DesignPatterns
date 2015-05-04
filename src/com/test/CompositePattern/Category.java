package com.test.CompositePattern;
import java.util.ArrayList;
import java.util.List;
public class Category implements CategoryTree {
	private List<CategoryTree> childs = new ArrayList<CategoryTree>();
	int count;
	String name;
	Category(String name)
	{
		this.name = name;
	}
	@Override
	public void addChild(CategoryTree categoryTree) {
		childs.add(categoryTree);
	}
	@Override
	public void prefixName(String prefix) {
		for(CategoryTree ct : childs)
		{
			ct.prefixName(prefix);
		}
		this.name = prefix+this.name;
	}
	@Override
	public void printName(int count) {
		printSpaces(count);
		count++;
		System.out.println(this.name);
		for(CategoryTree ct : childs){
			ct.printName(count);
		}
	}
	
	public void printSpaces(int count)
	{
		CategoryTree.printStaticSpaces(count);
		System.out.print("-");
	}
}
