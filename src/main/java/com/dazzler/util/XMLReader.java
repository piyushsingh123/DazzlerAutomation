package com.dazzler.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;

public class XMLReader {

	public static synchronized HashMap<String, String> getTestData(String testDataFile) 
			{
		HashMap<String, String> testData = new HashMap<String, String>();

		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File(
					"src/test/java/com/dazzler/booking" + testDataFile));

			NodeList nodeList = document.getDocumentElement().getChildNodes();

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node parentElementNode = nodeList.item(i);
				if (parentElementNode.getNodeName().equals("testData")) {
					String name = parentElementNode.getAttributes().item(0)
							.getTextContent();
					String value = parentElementNode.getTextContent();
					testData.put(name, value);
				}
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}

		return testData;
	}
}