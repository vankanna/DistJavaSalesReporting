package edu.wctc.demo.impl;

import edu.wctc.demo.Sale;
import edu.wctc.demo.iface.SalesInput;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SalesFromCSV implements SalesInput {
    @Override
    public List<Sale> getSalesData() {
        String line = "";
        String lineSplit = ",";
        List<Sale> sales = new ArrayList<>();
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("./sales.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] saleArr = line.split(lineSplit);
                sales.add(new Sale(saleArr[0], saleArr[1], Double.parseDouble(saleArr[2]), Double.parseDouble(saleArr[3])));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return sales;
    }
}
