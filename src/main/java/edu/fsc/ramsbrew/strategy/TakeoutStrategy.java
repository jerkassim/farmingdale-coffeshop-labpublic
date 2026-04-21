package edu.fsc.ramsbrew.strategy;

public class TakeoutStrategy implements OrderTypeStrategy {

    @Override
    public String getOrderTypeName() {
        return "Takeout";
    }

    @Override
    public String getPreparationNote() {
        return "Package drink in a to-go cup.";
    }

    @Override
    public double getServiceCharge() {
        return 0.25;
    }
}

