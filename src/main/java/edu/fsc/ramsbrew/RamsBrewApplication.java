package edu.fsc.ramsbrew;

import edu.fsc.ramsbrew.builder.BeverageOrderBuilder;
import edu.fsc.ramsbrew.model.BeverageOrder;
import edu.fsc.ramsbrew.model.enums.BeverageType;
import edu.fsc.ramsbrew.model.enums.MilkType;
import edu.fsc.ramsbrew.model.enums.Size;
import edu.fsc.ramsbrew.model.enums.Sweetener;
import edu.fsc.ramsbrew.model.enums.Temperature;
import edu.fsc.ramsbrew.strategy.DineInStrategy;
import edu.fsc.ramsbrew.strategy.MobilePickupStrategy;
import edu.fsc.ramsbrew.strategy.TakeoutStrategy;

public class RamsBrewApplication {
    public static void main(String[] args) {
        BeverageOrder latteOrder = new BeverageOrderBuilder()
                .chooseBeverage(BeverageType.LATTE)
                .chooseTemperature(Temperature.ICED)
                .chooseSize(Size.LARGE)
                .chooseMilk(MilkType.OAT)
                .chooseShots(2)
                .chooseSweetener(Sweetener.HONEY)
                .chooseOrderType(new TakeoutStrategy())
                .build();

        BeverageOrder coffeeOrder = new BeverageOrderBuilder()
                .chooseBeverage(BeverageType.COFFEE)
                .chooseTemperature(Temperature.HOT)
                .chooseSize(Size.MEDIUM)
                .chooseMilk(MilkType.SKIM)
                .chooseSweetener(Sweetener.SUGAR)
                .chooseOrderType(new DineInStrategy())
                .build();

        BeverageOrder teaOrder = new BeverageOrderBuilder()
                .chooseBeverage(BeverageType.TEA)
                .chooseTemperature(Temperature.ICED)
                .chooseSize(Size.SMALL)
                .chooseSweetener(Sweetener.STEVIA)
                .chooseOrderType(new MobilePickupStrategy())
                .build();

        System.out.println(latteOrder.getSummary());
        System.out.println(coffeeOrder.getSummary());
        System.out.println(teaOrder.getSummary());
    }
}
