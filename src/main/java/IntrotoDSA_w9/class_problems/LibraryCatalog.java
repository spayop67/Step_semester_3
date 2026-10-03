package IntrotoDSA_w9.class_problems;

public class LibraryCatalog {
    static String findBook(String[][] catalog, String targetIsbn) {
        int low = 0;
        int high = catalog.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            String midIsbn = catalog[mid][0];
            int comparison = midIsbn.compareTo(targetIsbn);
            if (comparison == 0) {
                return catalog[mid][1];
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return "Not Found";
    }
}