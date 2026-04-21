package edu.fsc.ramsbrew.strategy;

public class DineInStrategy implements OrderTypeStrategy {

    @Override
    public String getOrderTypeName() {
        return "Dine-In";
    }

    @Override
    public String getPreparationNote() {
        return "Serve in a mug or cup for in-store use.";
    }

    @Override
    public double getServiceCharge() {
        return 0.00;
    }
}

