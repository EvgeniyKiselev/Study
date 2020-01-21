package NewYearGift;

public abstract class NewYearGift {

    private String name;
    private double weight;
    private double price;

    public NewYearGift(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public NewYearGift() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "NewYearGift {" +
                "name = '" + name + '\'' +
                ", weight = " + weight +
                ", price = " + price +
                '}';
    }
}
