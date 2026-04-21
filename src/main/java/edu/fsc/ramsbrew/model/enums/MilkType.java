package edu.fsc.ramsbrew.model.enums;

public enum MilkType {
    NONE(0.00),
    WHOLE(0.00),
    SKIM(0.00),
    ALMOND(0.50),
    OAT(0.60),
    SOY(0.45);

    private final double priceAdjustment;

    MilkType(double priceAdjustment) {
        this.priceAdjustment = priceAdjustment;
    }

    public double getPriceAdjustment() {
        return priceAdjustment;
    }
}
