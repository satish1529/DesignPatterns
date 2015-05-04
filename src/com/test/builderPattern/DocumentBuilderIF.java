package com.test.builderPattern;

public interface DocumentBuilderIF 
{
	public void buildDocumentType();
	public void buildDocumentTitle();
	public void buildDocumentHeader();
	public void buildDocumentFooter();
	
	public Document getDocument();
}
