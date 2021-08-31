package edu.wctc.demo.impl;

import edu.wctc.demo.Sale;
import edu.wctc.demo.iface.SalesReport;
import edu.wctc.demo.iface.ShippingPolicy;

import java.util.ArrayList;
import java.util.List;

public class DetailSalesReport implements SalesReport {

    @Override
    public void createReport(List<Sale> sales, ShippingPolicy policy) {
        System.out.println("DETAIL SALES REPORT");
        System.out.printf("%-22s%-22s%-22s%-22s%-22s\n","Customer","Country","Amount", "Tax", "Shipping");

        for (Sale sale: sales) {
            System.out.printf("%-22s%-22s%-22s%-22s%-22s\n",sale.customer,sale.country,sale.amount,sale.tax,policy.getShippingCost(sale));
        }
    }
}
