package lr8;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JSON_books {
    private JSONObject root;
    private JSONArray booksArray;
    private String jsonFilePath;

    public JSON_books(String jsonFilePath) throws IOException, ParseException {
        this.jsonFilePath = jsonFilePath;
        JSONParser parser = new JSONParser();
        root = (JSONObject) parser.parse(new FileReader(jsonFilePath));
        booksArray = (JSONArray) root.get("books");
    }

    // Поиск книг по автору
    public List<JSONObject> findByAuthor(String authorQuery) {
        List<JSONObject> result = new java.util.ArrayList<>();
        for (Object obj : booksArray) {
            if (obj instanceof JSONObject) {
                JSONObject book = (JSONObject) obj;
                Object auth = book.get("author");
                if (auth instanceof String && authorQuery.equalsIgnoreCase((String) auth)) {
                    result.add(book);
                }
            }
        }
        return result;
    }

    // Добавление новой книги
    public void addBook(String title, String author, int year) {
        JSONObject newBook = new JSONObject();
        newBook.put("title", title);
        newBook.put("author", author);
        newBook.put("year", year);
        booksArray.add(newBook);
    }

    // Удаление книги по названию
    public boolean deleteByTitle(String titleQuery) {
        Iterator<?> iterator = booksArray.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if (obj instanceof JSONObject) {
                JSONObject book = (JSONObject) obj;
                if (titleQuery.equalsIgnoreCase((String) book.get("title"))) {
                    iterator.remove();
                    return true;
                }
            }
        }
        return false;
    }

    // Сохранение изменений
    public void save() throws IOException {
        try (FileWriter writer = new FileWriter(jsonFilePath)) {
            // Для красивого вывода можно использовать сторонние библиотеки, здесь - простой
            writer.write(root.toJSONString());
        }
    }

    // Утилита для печати книг
    private void printBooks(List<JSONObject> list) {
        if (list.isEmpty()) {
            System.out.println("Книг не найдено.");
        } else {
            list.forEach(book -> {
                System.out.println("-------------------------");
                System.out.println("Название: " + book.get("title"));
                System.out.println("Автор   : " + book.get("author"));
                System.out.println("Год     : " + book.get("year"));
            });
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            JSON_books manager = new JSON_books("src/lr8/books.json");
            while (true) {
                System.out.println("Выберите действие: 1=Поиск, 2=Добавить, 3=Удалить, 4=Выход");
                String choice = scanner.nextLine().trim();
                switch (choice) {
                    case "1":
                        System.out.print("Автор для поиска: ");
                        String author = scanner.nextLine().trim();
                        manager.printBooks(manager.findByAuthor(author));
                        break;
                    case "2":
                        System.out.print("Название: ");
                        String title = scanner.nextLine().trim();
                        System.out.print("Автор: ");
                        String auth = scanner.nextLine().trim();
                        System.out.print("Год: ");
                        int year = Integer.parseInt(scanner.nextLine().trim());
                        manager.addBook(title, auth, year);
                        manager.save();
                        System.out.println("Книга добавлена.");
                        break;
                    case "3":
                        System.out.print("Название для удаления: ");
                        String toDelete = scanner.nextLine().trim();
                        if (manager.deleteByTitle(toDelete)) {
                            manager.save();
                            System.out.println("Книга удалена.");
                        } else {
                            System.out.println("Книга не найдена.");
                        }
                        break;
                    case "4":
                        System.out.println("Выход...");
                        return;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
