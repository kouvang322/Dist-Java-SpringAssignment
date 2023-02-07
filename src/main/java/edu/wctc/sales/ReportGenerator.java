package edu.wctc.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ReportGenerator {

    @Autowired
    private SalesInput saleRecorderInstance;
    @Autowired
    private ShippingPolicy shippingPolicy;
    @Autowired
    private SalesReport generateCompleteReport;

    private List<Sale> salesList;


    public void startReport(){

        salesList = saleRecorderInstance.getSales();


        for (Sale sale : salesList){
            shippingPolicy.applyShipping(sale);
        }

        generateCompleteReport.generateReport(salesList);
    }







}
