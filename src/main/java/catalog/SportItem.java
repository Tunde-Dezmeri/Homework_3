package catalog;

import lombok.Getter;
import lombok.ToString;


@ToString
public class SportItem extends CatalogItem {

    @Getter
    private String seller;
    int price;
    private SportType sporttype;

    public SportItem(String seller, int price, SportType sporttype) {
        this.seller = seller;
        this.price = price;
        this.sporttype = sporttype;

    }
}
