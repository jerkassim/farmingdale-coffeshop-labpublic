package edu.fsc.ramsbrew.model.enums;

public enum Size {
    SMALL(0.00),
    MEDIUM(0.75),
    LARGE(1.50);

    private final double priceAdjustment;

    Size(double priceAdjustment) {
        this.priceAdjustment = priceAdjustment;
    }

    public double getPriceAdjustment() {
        return priceAdjustment;
    }
}

