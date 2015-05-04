package com.test.CompositePattern;

public class Client {

	public static void main(String[] args) {
		CategoryTree root = new Category("root");
		
		CategoryTree categoryChild1 = new Category("child1");
		
		CategoryTree categoryChild2 = new Category("child2");
		
		CategoryTree categoryc1s1 = new Service("child1-service1");
		CategoryTree categoryc1s2 = new Service("child1-service2");
		
		CategoryTree categoryc2s1 = new Service("child2-service1");
		CategoryTree categoryc2s2 = new Service("child3-service2");
		
		root.addChild(categoryChild1);
		root.addChild(categoryChild2);
		
		categoryChild1.addChild(categoryc1s1);
		categoryChild1.addChild(categoryc1s2);
		
		categoryChild2.addChild(categoryc2s1);
		categoryChild2.addChild(categoryc2s2);
		
		root.prefixName("prefix-");
		root.printName(0);
	}
}
