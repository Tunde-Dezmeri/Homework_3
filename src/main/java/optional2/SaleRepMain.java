package optional2;

public class SaleRepMain {

    public static void main(String... args) {

        SaleRepresentative[] saleRepresentatives = new SaleRepresentative[3];
        SaleRepresentative saleRepresentative = new SaleRepresentative("Pop", "Oana", 10, 500);
        saleRepresentatives[0] = saleRepresentative;
        saleRepresentative = new SaleRepresentative("Pop", "Carmen", 11, 200);
        saleRepresentatives[1] = saleRepresentative;
        saleRepresentative = new SaleRepresentative("Pop", "Alina", 4, 1000);
        saleRepresentatives[2] = saleRepresentative;

        SortingUtility.sort(saleRepresentatives, SortingUtility.DESC_ORDER);
        System.out.println("Sorting in descending order on basis of revenue");
        printArray(saleRepresentatives);
    }

    public static <T> void printArray(T[] a) {
        for (T t : a) {
            System.out.println(t);
        }
    }
}
