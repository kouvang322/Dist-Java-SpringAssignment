package edu.wctc.sales;

public class FlatDomesticShippingRate implements ShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
        switch (sale.getCountry().toUpperCase()) {
            case "UNITED STATES":
                sale.setShippingCost(29.95);
                break;
            case "JAPAN":
                sale.setShippingCost(14.50);
                break;
            case "INDIA":
                sale.setShippingCost(7.54);
                break;
            case "SCOTLAND":
                sale.setShippingCost(11.79);
                break;
            default:
                sale.setShippingCost(5.50);
        }

    }
}