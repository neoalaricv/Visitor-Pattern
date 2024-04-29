public interface ShippingCostVisitor {
    int calculateChairShippingCost(int weight);

    int calculateSofaShippingCost(int weight, int distance);

    int calculateTableShippingCost(int weight, int dimensions[]);
}