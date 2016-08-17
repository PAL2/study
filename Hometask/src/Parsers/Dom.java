package Parsers;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Dom {

	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		Document doc = null;

		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		File f = new File("src/Parsers/point.xml");
		try {
			doc = builder.parse(f);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Element root = doc.getDocumentElement();
		System.out.println(root.getTagName());

		NodeList nList = root.getChildNodes();

		for (int i = 0; i < nList.getLength(); i++) {

			if (nList.item(i) instanceof Element) {

				NodeList nList2 = nList.item(i).getChildNodes();

				String s = nList.item(i).getNodeName() + " " + (i / 2 + 1) + ": " + nList2.item(1).getTextContent()
						+ nList2.item(5).getTextContent() + ", " + nList2.item(3).getTextContent()
						+ nList2.item(5).getTextContent();
				System.out.println(s);
			}
		}
	}
}