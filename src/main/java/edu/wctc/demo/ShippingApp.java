package edu.wctc.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShippingApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        ((ReportMaker)context.getBean("reportMaker")).makeReport();
    }
}
