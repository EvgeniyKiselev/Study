package NewYearGift;

public class Pancakes extends NewYearGift {
    private String radius;

    public Pancakes(String name, double weight, double price, String radius) {
        super(name, weight, price);
        this.radius = radius;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Pancakes {" + super.toString() +
                "radius = '" + radius + '\'' +
                '}';
    }
}
