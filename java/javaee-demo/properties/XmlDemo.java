/*
    REQUIREMENTS:
        - To write a program to add 5 elements to a xml file and print the elements in the xml file using list. 
          Remove the 3rd element from the xml file and print the xml file.
    ENTITIES:
        - XmlDemo
    METHOD SIGNATURE:
        - private static Node getCollege(Document document, String id, String name, String age, String role)
        - private static Node getCollegeElements(Document document, Element element, String name, String value)
    WORK TO BE DONE:
        - get property.txt file
        - load the property.txt file into the properties class
        - set values to the properties 
        - store the values into the file
        - print the values using key
*/

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
 
 
public class XmlDemo {
 
    public static void main(String[] args) {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder;

        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();
            Element mainRootElement = document.createElementNS("", "Colleges");
            document.appendChild(mainRootElement);
 
            mainRootElement.appendChild(getCollege(document, "1", "Ammu", "CSE", "student"));
            mainRootElement.appendChild(getCollege(document, "2", "Anu", "IT", "teacher"));
            mainRootElement.appendChild(getCollege(document, "3", "Aishu", "CSE", "hod"));
 
            // output DOM XML to console 
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); 
            DOMSource source = new DOMSource(document);
            StreamResult console = new StreamResult(System.out);
            transformer.transform(source, console);
 
            System.out.println("\nXML Created");
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    private static Node getCollege(Document document, String id, String name, String age, String role) {
        Element college = document.createElement("College");
        college.setAttribute("id", id);
        college.appendChild(getCollegeElements(document, college, "Name", name));
        college.appendChild(getCollegeElements(document, college, "Department", age));
        college.appendChild(getCollegeElements(document, college, "Role", role));
        return college;
    }
 
    // utility method to create text node
    private static Node getCollegeElements(Document document, Element element, String name, String value) {
        Element node = document.createElement(name);
        node.appendChild(document.createTextNode(value));
        return node;
    }
}
