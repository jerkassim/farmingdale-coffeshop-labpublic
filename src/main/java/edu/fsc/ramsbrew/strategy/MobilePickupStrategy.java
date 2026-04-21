package edu.fsc.ramsbrew.strategy;

public class MobilePickupStrategy implements OrderTypeStrategy {

    @Override
    public String getOrderTypeName() {
        return "Mobile Pickup";
    }

    @Override
    public String getPreparationNote() {
        return "Label the order and place it on the pickup shelf.";
    }

    @Override
    public double getServiceCharge() {
        return 0.15;
    }
}

