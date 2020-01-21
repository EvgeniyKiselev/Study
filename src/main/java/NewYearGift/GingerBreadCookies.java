package NewYearGift;

public class GingerBreadCookies extends NewYearGift {
    private String hardness;

    public GingerBreadCookies(String name, double weight, double price, String hardness) {
        super(name, weight, price);
        this.hardness = hardness;
    }

    public String getHardness() {
        return hardness;
    }

    public void setHardness(String hardness) {
        this.hardness = hardness;
    }

    @Override
    public String toString() {
        return "GingerBreadCookies {" + super.toString() +
                "hardness = '" + hardness + '\'' +
                '}';
    }
}
