package person_application;

public class Hobby {
    private String name;
    private int frequency;

    public Hobby(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "" + name + " " + frequency + " times during a week" + " in " + Country.ROMANIA;
    }
}
