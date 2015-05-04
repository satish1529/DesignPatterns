package com.test.builderPattern;

public class PDFDocumentBuilder implements DocumentBuilderIF {

	DocumentIF document = null;
	
	PDFDocumentBuilder()
	{
		document = new Document();
	}

	@Override
	public void buildDocumentType() {
		document.setDocumentType("PDF");
	}

	@Override
	public void buildDocumentTitle() {
		document.setDocumentTitle("PFD Title");
	}

	@Override
	public void buildDocumentHeader() {
		document.setDocumentHeader("PDF Header");
	}

	@Override
	public void buildDocumentFooter() {
		document.setDocumentFooter("PDF Footer");
	}

	@Override
	public Document getDocument() {
		return (Document)document;
	}
}
