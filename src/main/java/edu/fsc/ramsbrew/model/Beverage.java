package edu.fsc.ramsbrew.model;

public interface Beverage {
    String getName();
    double getBasePrice();
    boolean supportsIced();
    boolean supportsMilkOptions();
    boolean supportsEspressoShots();
}

