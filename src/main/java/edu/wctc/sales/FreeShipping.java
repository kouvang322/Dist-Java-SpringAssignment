package edu.wctc.sales;

public class FreeShipping implements ShippingPolicy{

    @Override
    public void applyShipping(Sale sale) {
        sale.setShippingCost(0.00);
    }
}
