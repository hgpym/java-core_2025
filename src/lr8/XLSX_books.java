package lr8;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class XLSX_books {
    private String excelPath;
    private Workbook workbook;
    private Sheet sheet;

    public XLSX_books(String excelPath) throws IOException {
        this.excelPath = excelPath;
        File file = new File(excelPath);
        if (!file.exists() || file.length() == 0) {
            workbook = new XSSFWorkbook();
            sheet = workbook.createSheet("Sheet1");
            Row header = sheet.createRow(0);
            header.createCell(0).setCellValue("Title");
            header.createCell(1).setCellValue("Author");
            header.createCell(2).setCellValue("Year");
            saveWorkbook();
        } else {
            try (FileInputStream fis = new FileInputStream(file)) {
                workbook = new XSSFWorkbook(fis);
                sheet = workbook.getSheetAt(0);
            }
        }
    }

    public List<Row> findByAuthor(String authorQuery) {
        List<Row> result = new ArrayList<>();
        for (Row row : sheet) {
            if (row.getRowNum() == 0) continue;
            Cell authorCell = row.getCell(1);
            if (authorCell != null && authorCell.getCellType() == CellType.STRING) {
                if (authorCell.getStringCellValue().equalsIgnoreCase(authorQuery)) {
                    result.add(row);
                }
            }
        }
        return result;
    }

    public void addBook(String title, String author, int year) {
        int newRowNum = sheet.getLastRowNum() + 1;
        Row newRow = sheet.createRow(newRowNum);
        newRow.createCell(0).setCellValue(title);
        newRow.createCell(1).setCellValue(author);
        newRow.createCell(2).setCellValue(year);
    }

    public boolean deleteByTitle(String titleQuery) {
        Iterator<Row> iterator = sheet.iterator();
        while (iterator.hasNext()) {
            Row row = iterator.next();
            if (row.getRowNum() == 0) continue;
            Cell titleCell = row.getCell(0);
            if (titleCell != null && titleCell.getCellType() == CellType.STRING
                    && titleCell.getStringCellValue().equalsIgnoreCase(titleQuery)) {
                removeRow(row.getRowNum());
                return true;
            }
        }
        return false;
    }

    private void removeRow(int rowIndex) {
        int lastRowNum = sheet.getLastRowNum();
        if (rowIndex >= 0 && rowIndex < lastRowNum) {
            sheet.shiftRows(rowIndex + 1, lastRowNum, -1);
        } else if (rowIndex == lastRowNum) {
            Row removingRow = sheet.getRow(rowIndex);
            if (removingRow != null) sheet.removeRow(removingRow);
        }
    }

    private void saveWorkbook() throws IOException {
        try (FileOutputStream fos = new FileOutputStream(excelPath)) {
            workbook.write(fos);
        }
    }

    public void save() throws IOException {
        saveWorkbook();
    }

    public void close() throws IOException {
        if (workbook != null) {
            workbook.close();
        }
    }

    private void printRows(List<Row> rows) {
        if (rows.isEmpty()) {
            System.out.println("Книг не найдено.");
        } else {
            System.out.println("Title | Author | Year");
            for (Row row : rows) {
                System.out.printf("%s | %s | %d%n",
                        row.getCell(0).getStringCellValue(),
                        row.getCell(1).getStringCellValue(),
                        (int)row.getCell(2).getNumericCellValue());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        XLSX_books manager = null;
        try {
            manager = new XLSX_books("src/lr8/books.xlsx");
            boolean running = true;
            while (running) {
                System.out.println("1=Поиск, 2=Добавить, 3=Удалить, 4=Выход");
                switch (scanner.nextLine().trim()) {
                    case "1":
                        System.out.print("Автор: ");
                        manager.printRows(manager.findByAuthor(scanner.nextLine().trim()));
                        break;
                    case "2":
                        System.out.print("Title: ");
                        String t = scanner.nextLine().trim();
                        System.out.print("Author: ");
                        String a = scanner.nextLine().trim();
                        System.out.print("Year: ");
                        int y = Integer.parseInt(scanner.nextLine().trim());
                        manager.addBook(t, a, y);
                        manager.save();
                        System.out.println("Added.");
                        break;
                    case "3":
                        System.out.print("Title to delete: ");
                        if (manager.deleteByTitle(scanner.nextLine().trim())) {
                            manager.save();
                            System.out.println("Deleted.");
                        } else {
                            System.out.println("Not found.");
                        }
                        break;
                    case "4":
                        manager.save();
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (manager != null) manager.close();
            } catch (IOException ignored) {}
            scanner.close();
        }
    }

}

