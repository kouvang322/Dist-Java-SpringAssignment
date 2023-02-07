package edu.wctc.sales;

import java.util.List;

public class SalesReporter implements SalesReport {


    @Override
    public void generateReport(List<Sale> saleList) {
        System.out.println("SALES DETAIL REPORT\n");
        System.out.printf("%15s %15s %15s %15s %15s\n", "Customer", "Country", "Amount", "Tax", "Shipping Cost");
        for (Sale sale : saleList) {
            System.out.println(sale.toString());
        }
        System.out.println("\n\n");
        System.out.println("End of Report\n");
    }
}
