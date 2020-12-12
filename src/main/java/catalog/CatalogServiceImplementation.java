package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogServiceImplementation implements Catalog_Operation {

    private List<CatalogItem> items = new ArrayList<>();

    @Override
    public void addBookItem(String name, int price) {
        BookItem bookItem = new BookItem(name, price);
        items.add(bookItem);
    }

    @Override
    public void updateItem(int index, int price) {
        items.get(index).setPrice(price);
    }

    @Override
    public void deleteItem(int index) {
        items.remove(index);
    }

    @Override
    @Deprecated
    public List<CatalogItem> getAll() {
        return items;
    }

     public void setItems(List<CatalogItem> items){
        this.items = items;
     }
}
