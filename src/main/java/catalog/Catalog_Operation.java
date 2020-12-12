package catalog;

import java.util.List;

public interface Catalog_Operation {

    /**
     * Adds a new Book Item to the List of Catalog Items
     *
     * @param name, String type
     */
    void addBookItem(String name, int price);

    /**
     * Updates the item's price with the given index from the Catalog
     *
     * @param index, int type
     */

    void updateItem(int index, int price);

    /**
     * Deletes the item with the given index from the Catalog
     *
     * @param index, int type
     */

    void deleteItem(int index);

    List<CatalogItem> getAll();

    void setItems(List<CatalogItem> items);
}
