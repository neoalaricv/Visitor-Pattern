public class Client {
    public static void main(String[] args) {
        Furniture chair = new Chair(10);
        Furniture sofa = new Sofa(20, 10);
        Furniture table = new Table(30, 4, 4, 3);

        ShippingCostCalculator calculator = new ShippingCostCalculator();

        System.out.println("Chair shipping cost: " + chair.accept(calculator));
        System.out.println("Sofa shipping cost: " + sofa.accept(calculator));
        System.out.println("Table shipping cost: " + table.accept(calculator));
    }
}