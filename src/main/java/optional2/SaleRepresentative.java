package optional2;

public class SaleRepresentative implements Comparable<SaleRepresentative> {

    private String firstName;
    private String lastName;
    private int sale;
    private double quota;

    public double revenue() {
        return sale * quota;
    }

    public SaleRepresentative(String firstName, String lastName, int sale, int quota) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sale = sale;
        this.quota = quota;

    }

    public double getRevenue() {
        return revenue();
    }

    public String toString() {
        return firstName + " " + lastName + " " + "has " + sale + " sales" + " with a quota of " + quota + "$." + " She has achieved a revenue of " + getRevenue() + "$.";
    }

    @Override
    public int compareTo(SaleRepresentative o) {
        return ((Double) this.revenue()).compareTo(o.revenue());
    }
}
