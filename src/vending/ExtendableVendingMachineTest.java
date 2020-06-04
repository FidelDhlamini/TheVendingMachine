package vending;

import org.junit.jupiter.api.Test;
import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SoftDrink;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ExtendableVendingMachineTest {

    @Test
    public void ShouldBuySoftDrink() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(10,10,10);
        extendableVendingMachine.buy(new SoftDrink());
        assertEquals(extendableVendingMachine.getStock(new SoftDrink()),9);

    }
    @Test
    public void ShouldBuyChocolate() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(10,10,8);
        extendableVendingMachine.buy(new Chocolate());
        extendableVendingMachine.buy(new Chocolate());
        extendableVendingMachine.buy(new Chocolate());
        extendableVendingMachine.buy(new Chocolate());
        assertEquals(extendableVendingMachine.getStock(new Chocolate()),4);

    }
    @Test
    public void ShouldAddChocolateToStock() {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(10,10,8);
        extendableVendingMachine.addStock(new Chocolate());
        extendableVendingMachine.addStock(new Chocolate());
        assertEquals(extendableVendingMachine.getStock(new Chocolate()),14);

    }
}