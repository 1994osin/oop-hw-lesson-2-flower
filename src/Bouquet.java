public class Bouquet {
    private final Flower[] flowers;

    Bouquet(Flower... flowers) {
        this.flowers = flowers;
    }

    double bouquetCost() {
        double summa = 0;
        for (Flower flower : flowers) {
            summa += flower.getCost();
        }
        return summa + summa * 0.1;
    }

    int lifeSpan() {
        int day = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (day > flower.getLifeSpan()) {
                day = flower.getLifeSpan();
            }
        }
        return day;
    }

    @Override
    public String toString() {
        return String.format("Сумма букета: %.2f. Срок стояния: %d", bouquetCost(), lifeSpan());
    }
}
