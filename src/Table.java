public class Table implements Furniture {
    private int weight;
    private int dimensions[];

    public Table(int weight, int length, int width, int height) {
        this.weight = weight;
        this.dimensions = new int[]{length, width, height};
    }

    @Override
    public int accept(ShippingCostVisitor visitor) {
        return visitor.calculateTableShippingCost(weight, dimensions);
    }
}