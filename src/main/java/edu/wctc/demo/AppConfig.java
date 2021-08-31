package edu.wctc.demo;

import edu.wctc.demo.iface.SalesInput;
import edu.wctc.demo.iface.SalesReport;

import edu.wctc.demo.iface.ShippingPolicy;
import edu.wctc.demo.impl.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.demo")
public class AppConfig {

    @Bean
    public SalesReport salesReport() {
        return new SummarySalesReport();
    }
    @Bean
    public SalesInput salesInput() {
        return new SalesFromCSV();
    }
    @Bean
    public ShippingPolicy shippingPolicy() {
        return new FreeShippingPolicy();
    }


}
