package com.test.builderPattern;

public class Client 
{
	public static void main(String[] args) {
		DocumentBuilderIF pdfDocument = new PDFDocumentBuilder();
		DocumentDirector documentDirector  = new DocumentDirector(pdfDocument);
		documentDirector.buildDocument();
		Document document = documentDirector.getDocument();
		System.out.println("document Type : "+document.getDocumentType());
		System.out.println("document Title : "+document.getDocumentTitle());
		System.out.println("document Header : "+document.getDocumentHeader());
		System.out.println("document Footer : "+document.getDocumentFooter());
	}
}
