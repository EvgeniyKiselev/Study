import NewYearGift.Candy;
import NewYearGift.NewYearGift;
import NewYearGift.Pancakes;
import NewYearGift.GingerBreadCookies;

/**
 * Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей.
 * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 */

public class HnYGift {

    public static void main(String[] args) {
        Candy candy = new Candy("CrabNeck", 0.800, 45.50, "medium" );
        Candy candy1 = new Candy();
        candy1.setPrice(155);
        candy1.setName("ThreeBears");
        candy1.setSize("big");
        candy1.setWeight(0.570);
        Pancakes pancakes = new Pancakes("RoundPancakes", 0.700, 350, "13");
        GingerBreadCookies gingerBreadCookies = new GingerBreadCookies("Tulskiy", 0.300, 37, "Brick");
        NewYearGift[] gift = {candy, candy1, pancakes, gingerBreadCookies};
        for (NewYearGift someGift : gift) {
            System.out.println(someGift.toString());
        }
        System.out.println("Стоимость новогоднего подарка: " + (candy.getPrice() + candy1.getPrice() + pancakes.getPrice() + gingerBreadCookies.getPrice()) + " руб.");
        System.out.println("Вес новогоднего подарка: " + (candy.getWeight() + candy1.getWeight() + pancakes.getWeight() + gingerBreadCookies.getWeight()) + " кг");
    }
}
