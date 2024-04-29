public class ShippingCostCalculator implements ShippingCostVisitor {

    @Override
    public int calculateChairShippingCost(int weight) {
        return weight * 5;
    }

    @Override
    public int calculateSofaShippingCost(int weight, int distance) {
        return weight * 10 + distance;
    }

    @Override
    public int calculateTableShippingCost(int weight, int dimensions[]) {
        int volume = dimensions[0] * dimensions[1] * dimensions[2];
        return weight * 15 + volume;
    }
}