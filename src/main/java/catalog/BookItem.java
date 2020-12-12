package catalog;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class BookItem extends CatalogItem {

    @Getter
    private String name;
    int price;

    public BookItem(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
