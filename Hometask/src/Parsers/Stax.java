package Parsers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class Stax {

	public static void main(String args[]) {
		boolean isPL = false;
		boolean isPoint = false;
		boolean isX = false;
		boolean isY = false;
		boolean isUnit = false;

		XMLInputFactory factory = XMLInputFactory.newFactory();
		try {
			XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("src/Parsers/point.xml"));
			while (reader.hasNext()) {
				int res = reader.next();
				if (res == XMLStreamConstants.START_ELEMENT) {
					if (reader.getLocalName().equals("pointList"))
						isPL = true;
					else if (reader.getLocalName().equals("point"))
						isPoint = true;
					else if (reader.getLocalName().equals("x"))
						isX = true;
					else if (reader.getLocalName().equals("y"))
						isY = true;
					else if (reader.getLocalName().equals("unit"))
						isUnit = true;
				} else if (res == XMLStreamConstants.CHARACTERS) {
					if (isPL) {
						System.out.println("PointList");
						isPL = false;
					} else if (isPoint) {
						System.out.print("point: ");
						isPoint = false;
					} else if (isX) {
						System.out.print(reader.getText() + ", ");
						isX = false;
					} else if (isY) {
						System.out.print(reader.getText());
						isY = false;
					} else if (isUnit) {
						System.out.println(reader.getText());
						isUnit = false;
					}
				}
			}
		} catch (FileNotFoundException |

				XMLStreamException e) {
			e.printStackTrace();
		}
	}
}
