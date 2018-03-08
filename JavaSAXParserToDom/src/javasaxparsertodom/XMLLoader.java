/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasaxparsertodom;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author rjy7wb
 */
public class XMLLoader {
    /*
    * Static method for the Java SAX parser
    */
    public static NodeOfParent load(File xmlNodeFile) throws Exception {
        NodeOfParent parentElement = new NodeOfParent();
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document document = dBuilder.parse(xmlNodeFile);
            document.getDocumentElement().normalize();
            NodeList childElements = document.getElementsByTagName("childNode");
            for(int i = 0; i < childElements.getLength(); i++) {
                Node childNode = childElements.item(i);
            }
        } catch (Exception e) {
            throw e;
        }
        return parentElement;
    }
}
