package edu.wctc.demo.iface;

import edu.wctc.demo.Sale;

public interface ShippingPolicy {
    double getShippingCost(Sale sale);
}
