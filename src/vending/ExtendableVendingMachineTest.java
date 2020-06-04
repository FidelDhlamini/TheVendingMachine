package vending;

import org.junit.jupiter.api.Test;
import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SoftDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ExtendableVendingMachineTest {

    @Test
    public void buySoftDrinkTest() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(10,10,10);
        extendableVendingMachine.buy(new SoftDrink());
        assertEquals(extendableVendingMachine.getStock(new SoftDrink()),9);

    }
    @Test
    public void buyChocolateTest() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(10,10,8);
        extendableVendingMachine.buy(new Chocolate());
        extendableVendingMachine.buy(new Chocolate());
        extendableVendingMachine.buy(new Chocolate());
        extendableVendingMachine.buy(new Chocolate());
        assertEquals(extendableVendingMachine.getStock(new Chocolate()),4);

    }
}