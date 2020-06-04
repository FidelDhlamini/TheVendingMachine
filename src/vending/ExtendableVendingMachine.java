package vending;

import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class ExtendableVendingMachine {
    private int SaltySnacks;
    private int Chocolates;
    private int SoftDrinks;
    private int StockLevel;

    public ExtendableVendingMachine(int SoftDrinks, int SaltySnacks, int Chocolates) {
        this.SoftDrinks = SoftDrinks;
        this.SaltySnacks = SaltySnacks;
        this.Chocolates = Chocolates;
    }

    public void buy(Product product) {

        if (product instanceof SaltySnack) {
            if (SaltySnacks > 0) {
                SaltySnacks -= 1;
            } else {
                System.out.println("Salty Snacks are out of stock");
            }
        }

        if (product instanceof Chocolate) {
            if (Chocolates > 0) {
                Chocolates -= 1;
            } else {
                System.out.println("Chocolates are out of stock");
            }
        }

        if (product instanceof SoftDrink) {
            if (SoftDrinks > 0) {
                SoftDrinks -= 1;
            } else {
                System.out.println("Soft Drinks are out of stock");
            }
        }

    }

    public void addStock(Product product) {
        if (product instanceof SaltySnack) {
            SaltySnacks += 3;

        }
        if (product instanceof Chocolate) {
            Chocolates += 3;

        }
        if (product instanceof SoftDrink) {
            SoftDrinks += 3;
        }
    }

    public int getStock(Product product) {
        if (product instanceof Chocolate) {
            StockLevel = Chocolates;
            return StockLevel;
        }
        if (product instanceof SaltySnack) {
            StockLevel = SaltySnacks;
            return StockLevel;
        }
        if (product instanceof SoftDrink) {
            StockLevel = SoftDrinks;
            return StockLevel;
        }
        if (product instanceof Product){
            StockLevel = Chocolates + SaltySnacks + SoftDrinks;
            return StockLevel;
        }
        else {
            StockLevel = 0;
            return StockLevel;
        }
    }
    public static void main(String[] args) {
        ExtendableVendingMachine extendableVendingMachine = new ExtendableVendingMachine(4,6,10);
        extendableVendingMachine.buy(new SaltySnack());
        System.out.println(extendableVendingMachine.getStock(new SaltySnack()));

    }
}
