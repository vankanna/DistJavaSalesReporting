package edu.wctc.demo.iface;

import edu.wctc.demo.Sale;

import java.util.List;

public interface SalesReport {
    void createReport(List<Sale> data, ShippingPolicy policy);
}
