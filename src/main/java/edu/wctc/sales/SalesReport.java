package edu.wctc.sales;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> saleList);
}
