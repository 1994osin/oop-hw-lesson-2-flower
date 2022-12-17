import java.util.Locale;

public class Flower {
    private String flowerName;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String flowerName, String country, double cost, int lifeSpan) {
        setFlowerName(flowerName);
        setCountry(country);
        setCost(cost);
        this.lifeSpan = (lifeSpan <= 0) ? 3 : lifeSpan;
    }

    @Override
    public String toString() {
        return String.format("Цветок: %s. Страна происхождения: %s. " +
                "Стоимость: %.2f руб. Срок стояния: %d дн.", flowerName, country, cost, lifeSpan);
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = (flowerName == null || flowerName.isBlank()) ? "Тип цветка не указан" : flowerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = (country == null || country.isBlank()) ? "Россия" : country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = (cost <= 0) ? 1 : cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }
}
