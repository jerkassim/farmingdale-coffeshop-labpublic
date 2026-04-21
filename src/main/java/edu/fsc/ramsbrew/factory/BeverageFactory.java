package edu.fsc.ramsbrew.factory;

import edu.fsc.ramsbrew.model.Beverage;
import edu.fsc.ramsbrew.model.Cappuccino;
import edu.fsc.ramsbrew.model.Coffee;
import edu.fsc.ramsbrew.model.Latte;
import edu.fsc.ramsbrew.model.Tea;
import edu.fsc.ramsbrew.model.enums.BeverageType;

public final class BeverageFactory {

    private BeverageFactory() {
    }

    public static Beverage createBeverage(BeverageType beverageType) {
        return switch (beverageType) {
            case COFFEE -> new Coffee();
            case LATTE -> new Latte();
            case CAPPUCCINO -> new Cappuccino();
            case TEA -> new Tea();
        };
    }
}

