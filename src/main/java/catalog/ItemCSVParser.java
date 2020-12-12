package catalog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ItemCSVParser {

    public List<CatalogItem> readFromFile() throws IOException {

        List<CatalogItem> items = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/catalog/catalog_items.csv"));

        String line = bufferedReader.readLine();


        while (line != null) {
            String[] tokens = line.split(",");

            CatalogItem item = null;
            switch (tokens[0]) {
                case "Book":
                    item = new BookItem(tokens[1], Integer.parseInt(tokens[2]));
                    break;
                case "Sport":
                    item = new SportItem(tokens[1], Integer.parseInt(tokens[2]), SportType.valueOf(tokens[3]));
                    break;
            }
            items.add(item);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();

        return items;
    }
}