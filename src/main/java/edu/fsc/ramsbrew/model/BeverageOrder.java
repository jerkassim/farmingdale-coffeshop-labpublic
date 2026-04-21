package edu.fsc.ramsbrew.model;

import edu.fsc.ramsbrew.model.enums.MilkType;
import edu.fsc.ramsbrew.model.enums.Size;
import edu.fsc.ramsbrew.model.enums.Sweetener;
import edu.fsc.ramsbrew.model.enums.Temperature;
import edu.fsc.ramsbrew.strategy.OrderTypeStrategy;

public class BeverageOrder {
    private final Beverage beverage;
    private final Temperature temperature;
    private final Size size;
    private final MilkType milkType;
    private final int shots;
    private final Sweetener sweetener;
    private final OrderTypeStrategy orderTypeStrategy;

    public BeverageOrder(Beverage beverage,
                         Temperature temperature,
                         Size size,
                         MilkType milkType,
                         int shots,
                         Sweetener sweetener,
                         OrderTypeStrategy orderTypeStrategy) {
        this.beverage = beverage;
        this.temperature = temperature;
        this.size = size;
        this.milkType = milkType;
        this.shots = shots;
        this.sweetener = sweetener;
        this.orderTypeStrategy = orderTypeStrategy;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public Size getSize() {
        return size;
    }

    public MilkType getMilkType() {
        return milkType;
    }

    public int getShots() {
        return shots;
    }

    public Sweetener getSweetener() {
        return sweetener;
    }

    public OrderTypeStrategy getOrderTypeStrategy() {
        return orderTypeStrategy;
    }

    public double calculateTotal() {
        double total = beverage.getBasePrice();
        total += size.getPriceAdjustment();
        if (beverage.supportsMilkOptions()) {
            total += milkType.getPriceAdjustment();
        }
        if (beverage.supportsEspressoShots()) {
            total += shots * 0.75;
        }
        total += orderTypeStrategy.getServiceCharge();
        return total;
    }

    public String getSummary() {
        String milkDisplay = beverage.supportsMilkOptions() ? milkType.toString() : "N/A";
        String shotsDisplay = beverage.supportsEspressoShots() ? String.valueOf(shots) : "N/A";

        return """
                ------------------------------
                Order Type: %s
                Beverage: %s
                Temperature: %s
                Size: %s
                Milk: %s
                Shots: %s
                Sweetener: %s
                Prep Note: %s
                Total: $%.2f
                ------------------------------
                """.formatted(
                orderTypeStrategy.getOrderTypeName(),
                beverage.getName(),
                temperature,
                size,
                milkDisplay,
                shotsDisplay,
                sweetener,
                orderTypeStrategy.getPreparationNote(),
                calculateTotal()
        );
    }
}
