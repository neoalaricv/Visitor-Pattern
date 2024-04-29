public class Sofa implements Furniture {
    private int weight;
    private int distance;

    public Sofa(int weight, int distance) {
        this.weight = weight;
        this.distance = distance;
    }

    @Override
    public int accept(ShippingCostVisitor visitor) {
        return visitor.calculateSofaShippingCost(weight, distance);
    }
}