package edu.wctc.sales;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class SaleRecorder implements SalesInput{

    @Autowired
    private ConsoleInput userInput;

    @Override
    public List<Sale> getSales() {
//
        List<Sale> salesList = new ArrayList<>();

        String addMore;
        do {
            String customerName = userInput.getInput("Enter customer name: ");
            String country = userInput.getInput("Enter shipping country: ");
            double saleAmount = Double.parseDouble(userInput.getInput("Enter sale amount: "));
            double tax = Double.parseDouble(userInput.getInput("Enter tax amount: "));
            Sale saleInfo = new Sale(customerName, country, saleAmount, tax);
            salesList.add(saleInfo);
            addMore = userInput.getInput("Add another sale?(Y/N): ");
        } while (addMore.isEmpty() || !addMore.equalsIgnoreCase("N"));
        return salesList;
    }
}
