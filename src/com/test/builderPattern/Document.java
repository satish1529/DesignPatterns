package com.test.builderPattern;

public class Document implements DocumentIF 
{
	private String documentType;
	private String documentTitle;
	private String documentHeader;
	private String documentFooter;

	@Override
	public void setDocumentType(String type) {
		this.documentType = type;
	}
	@Override
	public void setDocumentTitle(String title) {
		this.documentTitle = title;
	}
	@Override
	public void setDocumentHeader(String header) {
		this.documentHeader = header;
	}
	@Override
	public void setDocumentFooter(String footer) {
		this.documentFooter = footer;		
	}
	public String getDocumentType() {
		return documentType;
	}
	public String getDocumentTitle() {
		return documentTitle;
	}
	public String getDocumentHeader() {
		return documentHeader;
	}
	public String getDocumentFooter() {
		return documentFooter;
	}
}
