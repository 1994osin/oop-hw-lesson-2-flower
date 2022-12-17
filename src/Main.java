public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower("Роза", "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", null, 15, 5);
        Flower peony = new Flower("Пион", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5, 10);

        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(peony);
        System.out.println(gypsophila);

        System.out.println(new Bouquet(chrysanthemum, chrysanthemum, peony));
    }
}