package Parsers;

import java.io.IOException;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class SaxRunner {
	public static void main(String[] args) {
		try {
			// создание SAX-анализатора
			XMLReader reader = XMLReaderFactory.createXMLReader();
			Sax handler = new Sax();
			reader.setContentHandler(handler);
			reader.parse("src/Parsers/point.xml");
		} catch (SAXException e) {
			System.err.print("ошибка SAX парсера " + e);
		} catch (IOException e) {
			System.err.print("ошибка I/О потока " + e);

		}

	}
}
