package edu.wctc.demo;

import edu.wctc.demo.iface.SalesInput;


import edu.wctc.demo.iface.SalesInput;
import edu.wctc.demo.iface.SalesReport;
import edu.wctc.demo.iface.ShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class ReportMaker {
    private SalesInput in;
    private SalesReport out;
    private ShippingPolicy policy;

    @Autowired
    public ReportMaker(SalesInput in, SalesReport out, ShippingPolicy policy) {
        this.in = in;
        this.out = out;
        this.policy = policy;
    }

    public void makeReport() {
        out.createReport(in.getSalesData(), policy);

    }
}