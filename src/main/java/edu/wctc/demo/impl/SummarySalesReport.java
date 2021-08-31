package edu.wctc.demo.impl;

import edu.wctc.demo.Sale;
import edu.wctc.demo.iface.SalesReport;
import edu.wctc.demo.iface.ShippingPolicy;

import java.util.ArrayList;
import java.util.List;

public class SummarySalesReport implements SalesReport {

    @Override
    public void createReport(List<Sale> sales, ShippingPolicy policy) {
        System.out.println("SUMMARY SALES REPORT");
        System.out.printf("%-22s%-22s%-22s%-22s\n","Country","Amount", "Tax", "Shipping");

        List<String> countries = new ArrayList<>();
        for (Sale sale: sales) {
            if (!countries.contains(sale.country)) {
                countries.add(sale.country);
            }
        }

        for (String country: countries) {
            double amount = 0;
            double tax = 0;
            double shipping = 0;

            for (Sale sale: sales) {
                if (sale.country.equals(country)) {
                    amount += sale.amount;
                    tax += sale.tax;
                    shipping += policy.getShippingCost(sale);
                }
            }
            System.out.printf("%-22s%-22s%-22s%-22s\n",country,amount,tax,shipping);
        }
    }
}
