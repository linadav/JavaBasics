package JavaStep3.Task2_PatrolStation;

public enum EnumGasTypePrice {

    Diesel("dyzelis", 1.20),
    Gas95("95 benzinas", 1.15),
    Gas99("99 benzinas", 1.35),
    Gas("dujos", 0.80);

    private final double price;
    private final String gasType;

    EnumGasTypePrice(String gasType, double price) {
        this.gasType = gasType;
        this.price = price;
     }

    public String getGasType(){
        return gasType;
    }

    public double getPrice() {
        return price;
    }
}
