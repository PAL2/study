package Parsers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Sax extends DefaultHandler {
	String thisElement = "";
	boolean bX = false;
	boolean bY = false;
	boolean bUnit = false;

	@Override
	public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
		thisElement = qName;
		if (qName.equals("pointList")) {
			System.out.println(qName);
		}
		if (qName.equals("point")) {
			System.out.print(qName + ": ");

		}
		if (qName.equals("x")) {
			bX = true;
		}
		if (qName.equals("y")) {
			bY = true;
		}
		if (qName.equals("unit")) {
			bUnit = true;
		}

	}

	@Override
	public void characters(char[] ch, int start, int length) {
		if (bX) {
			System.out.print(new String(ch, start, length) + ", ");
			bX = false;
		}
		if (bUnit) {
			System.out.print(new String(ch, start, length) + "\n");
			bUnit = false;
		}
		if (bY) {
			System.out.print(new String(ch, start, length) + "");
			bY = false;
		}
	}
}