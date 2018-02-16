package org.gkh.rest.jersey;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "xmlpojo")
@XmlAccessorType(XmlAccessType.NONE)
public class XmlPojo {

	@XmlElement(name = "id")
	private long id;
	
	@XmlElement(name = "text")
	private String text;
	
	/*
	 * Default no-argument constructor needed for JAXB.
	 */
	public XmlPojo() {	
	}
	
	public XmlPojo(long id, String text) {
		this.id = id;
		this.text = text;
	}		
	
	public long getId() {
		return id;
	}
		
	public String getText() {
		return text;
	}
	
}
