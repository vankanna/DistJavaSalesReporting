package edu.wctc.demo.impl;

import edu.wctc.demo.Sale;
import edu.wctc.demo.iface.ShippingPolicy;

public class FlatRateShippingPolicy implements ShippingPolicy {
    @Override
    public double getShippingCost(Sale sale) {
        return sale.amount / 5;
    }
}
