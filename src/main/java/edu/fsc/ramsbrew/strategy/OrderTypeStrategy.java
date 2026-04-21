package edu.fsc.ramsbrew.strategy;

public interface OrderTypeStrategy {
    String getOrderTypeName();
    String getPreparationNote();
    double getServiceCharge();
}

