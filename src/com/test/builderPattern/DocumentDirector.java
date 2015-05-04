package com.test.builderPattern;

public class DocumentDirector 
{
	DocumentBuilderIF documentBuilderIF;
	
	DocumentDirector(DocumentBuilderIF documentBuilder)
	{
		documentBuilderIF = documentBuilder;
	}
	
	public void buildDocument()
	{
		documentBuilderIF.buildDocumentType();
		documentBuilderIF.buildDocumentTitle();
		documentBuilderIF.buildDocumentHeader();
		documentBuilderIF.buildDocumentFooter();
	}
	
	public Document getDocument()
	{
		return documentBuilderIF.getDocument();
	}
}
