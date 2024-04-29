public class Chair implements Furniture {
    private int weight;

    public Chair(int weight) {
        this.weight = weight;
    }

    @Override
    public int accept(ShippingCostVisitor visitor) {
        return visitor.calculateChairShippingCost(weight);
    }
}