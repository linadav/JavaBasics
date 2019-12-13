package JavaStep3.Task2_PatrolStation;

public class Gas {
    private EnumGasTypePrice gasType;
    private int amount;

    public Gas (EnumGasTypePrice gasType, int amount){
        this.amount = amount;
        this.gasType = gasType;
    }

    public EnumGasTypePrice getGasType() {
        return gasType;
    }

    public int getAmount() {
        return amount;
    }
}
