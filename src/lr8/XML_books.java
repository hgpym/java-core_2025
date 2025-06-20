package lr8;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class XML_books {
    private Document doc;
    private String xmlFilePath;

    public XML_books(String xmlFilePath) throws Exception {
        this.xmlFilePath = xmlFilePath;
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        doc = dBuilder.parse(new File(xmlFilePath));
        doc.getDocumentElement().normalize();
    }

    // Добавление новой книги
    public void addBook(String title, String author, String year) {
        Element library = doc.getDocumentElement();
        Element book = doc.createElement("book");

        Element titleEl = doc.createElement("title");
        titleEl.appendChild(doc.createTextNode(title));
        book.appendChild(titleEl);

        Element authorEl = doc.createElement("author");
        authorEl.appendChild(doc.createTextNode(author));
        book.appendChild(authorEl);

        Element yearEl = doc.createElement("year");
        yearEl.appendChild(doc.createTextNode(year));
        book.appendChild(yearEl);

        library.appendChild(book);
    }

    // Сохранение изменений в файл
    public void save() throws TransformerException {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(xmlFilePath));
        transformer.transform(source, result);
    }

    // Поиск книг по автору
    public List<Element> findByAuthor(String authorQuery) {
        NodeList bookNodes = doc.getElementsByTagName("book");
        return IntStream.range(0, bookNodes.getLength())
                .mapToObj(i -> (Element) bookNodes.item(i))
                .filter(el -> el.getElementsByTagName("author").item(0)
                        .getTextContent().equalsIgnoreCase(authorQuery))
                .collect(Collectors.toList());
    }

    // Поиск книг по году издания
    public List<Element> findByYear(String yearQuery) {
        NodeList bookNodes = doc.getElementsByTagName("book");
        return IntStream.range(0, bookNodes.getLength())
                .mapToObj(i -> (Element) bookNodes.item(i))
                .filter(el -> el.getElementsByTagName("year").item(0)
                        .getTextContent().equals(yearQuery))
                .collect(Collectors.toList());
    }

    // Удаление книги по названию
    public boolean deleteByTitle(String titleQuery) {
        NodeList bookNodes = doc.getElementsByTagName("book");
        for (int i = 0; i < bookNodes.getLength(); i++) {
            Element el = (Element) bookNodes.item(i);
            String title = el.getElementsByTagName("title").item(0).getTextContent();
            if (title.equalsIgnoreCase(titleQuery)) {
                el.getParentNode().removeChild(el);
                return true;
            }
        }
        return false;
    }

    // Утилита для печати списка книг
    public void printBooks(List<Element> books) {
        if (books.isEmpty()) {
            System.out.println("No books found.");
            return;
        }
        for (Element el : books) {
            System.out.println("Title : " + el.getElementsByTagName("title").item(0).getTextContent());
            System.out.println("Author: " + el.getElementsByTagName("author").item(0).getTextContent());
            System.out.println("Year  : " + el.getElementsByTagName("year").item(0).getTextContent());
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            XML_books manager = new XML_books("src/lr8/books.xml");
            while (true) {
                System.out.println("Choose action: 1=Add, 2=Search, 3=Delete, 4=Exit");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        System.out.print("Title: ");
                        String title = scanner.nextLine();
                        System.out.print("Author: ");
                        String author = scanner.nextLine();
                        System.out.print("Year: ");
                        String year = scanner.nextLine();
                        manager.addBook(title, author, year);
                        manager.save();
                        System.out.println("Book added.");
                        break;
                    case "2":
                        System.out.println("Search by: 1=Author, 2=Year");
                        String mode = scanner.nextLine();
                        if (mode.equals("1")) {
                            System.out.print("Author: ");
                            String a = scanner.nextLine();
                            List<Element> byAuthor = manager.findByAuthor(a);
                            manager.printBooks(byAuthor);
                        } else {
                            System.out.print("Year: ");
                            String y = scanner.nextLine();
                            List<Element> byYear = manager.findByYear(y);
                            manager.printBooks(byYear);
                        }
                        break;
                    case "3":
                        System.out.print("Title to delete: ");
                        String toDel = scanner.nextLine();
                        boolean removed = manager.deleteByTitle(toDel);
                        if (removed) {
                            manager.save();
                            System.out.println("Book deleted.");
                        } else {
                            System.out.println("Book not found.");
                        }
                        break;
                    case "4":
                        System.out.println("Exiting.");
                        return;
                    default:
                        System.out.println("Invalid option.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

