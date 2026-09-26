package live_coding_w2.class_problems;

public class CsvStudentParser {
    static void parseStudentRecord(String csvLine) {
        String[] parts = csvLine.split(",");
        if (parts.length != 3) {
            System.out.println("Invalid Record");
        } else {
            System.out.println("Name: " + parts[0].trim() + " | Roll No: " + parts[1].trim() + " | Dept: " + parts[2].trim());
        }
    }
}