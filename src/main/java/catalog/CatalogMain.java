package catalog;


import java.io.IOException;
import java.util.List;

public class CatalogMain {

    public static void main(String... args) {

        try {

            ItemCSVParser ItemCSVParser = new ItemCSVParser();

            List<CatalogItem> itemList = ItemCSVParser.readFromFile();
            System.out.println(itemList);

            Catalog_Operation catalogService = new CatalogServiceImplementation();
            catalogService.setItems(itemList);

            catalogService.addBookItem("Financial Analysis", 140);

            List<CatalogItem> itemListWithNewBook = catalogService.getAll();

            System.out.println("Catalog Items with new Book added");
            System.out.println(itemListWithNewBook);

            catalogService.deleteItem(itemListWithNewBook.size() - 1);
            System.out.println("Catalog Items without the Book added previously");
            System.out.println(catalogService.getAll());

            catalogService.updateItem(0, 213);
            System.out.println("Update first catalog item's price");
            System.out.println(catalogService.getAll());


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
