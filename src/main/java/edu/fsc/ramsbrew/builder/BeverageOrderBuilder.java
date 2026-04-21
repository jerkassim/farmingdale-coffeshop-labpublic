package edu.fsc.ramsbrew.builder;

import edu.fsc.ramsbrew.factory.BeverageFactory;
import edu.fsc.ramsbrew.model.Beverage;
import edu.fsc.ramsbrew.model.BeverageOrder;
import edu.fsc.ramsbrew.model.enums.BeverageType;
import edu.fsc.ramsbrew.model.enums.MilkType;
import edu.fsc.ramsbrew.model.enums.Size;
import edu.fsc.ramsbrew.model.enums.Sweetener;
import edu.fsc.ramsbrew.model.enums.Temperature;
import edu.fsc.ramsbrew.strategy.DineInStrategy;
import edu.fsc.ramsbrew.strategy.OrderTypeStrategy;

public class BeverageOrderBuilder {
    private Beverage beverage;
    private Temperature temperature = Temperature.HOT;
    private Size size = Size.SMALL;
    private MilkType milkType = MilkType.NONE;
    private int shots = 0;
    private Sweetener sweetener = Sweetener.NONE;
    private OrderTypeStrategy orderTypeStrategy = new DineInStrategy();

    public BeverageOrderBuilder chooseBeverage(BeverageType beverageType) {
        this.beverage = BeverageFactory.createBeverage(beverageType);
        return this;
    }

    public BeverageOrderBuilder chooseTemperature(Temperature temperature) {
        this.temperature = temperature;
        return this;
    }

    public BeverageOrderBuilder chooseSize(Size size) {
        this.size = size;
        return this;
    }

    public BeverageOrderBuilder chooseMilk(MilkType milkType) {
        this.milkType = milkType;
        return this;
    }

    public BeverageOrderBuilder chooseShots(int shots) {
        this.shots = shots;
        return this;
    }

    public BeverageOrderBuilder chooseSweetener(Sweetener sweetener) {
        this.sweetener = sweetener;
        return this;
    }

    public BeverageOrderBuilder chooseOrderType(OrderTypeStrategy orderTypeStrategy) {
        this.orderTypeStrategy = orderTypeStrategy;
        return this;
    }

    public BeverageOrder build() {
        validate();
        return new BeverageOrder(
                beverage,
                temperature,
                size,
                milkType,
                shots,
                sweetener,
                orderTypeStrategy
        );
    }

    private void validate() {
        if (beverage == null) {
            throw new IllegalStateException("A beverage type must be selected.");
        }

        if (temperature == Temperature.ICED && !beverage.supportsIced()) {
            throw new IllegalStateException(beverage.getName() + " cannot be ordered iced.");
        }

        if (!beverage.supportsMilkOptions() && milkType != MilkType.NONE) {
            throw new IllegalStateException(beverage.getName() + " does not support milk customization.");
        }

        if (!beverage.supportsEspressoShots() && shots > 0) {
            throw new IllegalStateException(beverage.getName() + " does not allow espresso shots.");
        }

        if (shots < 0 || shots > 3) {
            throw new IllegalStateException("Shots must be between 0 and 3.");
        }
    }
}
