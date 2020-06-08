package com.cuelogic.camel.demo.model;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord( separator = ",", skipFirstLine = true)
public class Sale {

    @DataField(pos = 1)
    String Region;
    
    @DataField(pos = 2)
    String Country;
    
    @DataField(pos = 3)
    String Item_Type;
    
    @DataField(pos = 4)
    String Sales_Channel;
    
    @DataField(pos = 5)
    String Order_Priority;
    
    @DataField(pos = 6)
    String Order_Date;
    
    @DataField(pos = 7)
    String Order_ID;
    
    @DataField(pos = 8)
    String Ship_Date;
    
    @DataField(pos = 9)
    String Units_Sold;
    
    @DataField(pos = 10)
    String Unit_Price;
    
    @DataField(pos = 11)
    String Unit_Cost;
    
    @DataField(pos = 12)
    String Total_Revenue;
    
    @DataField(pos = 13)
    String Total_Cost;
    
    @DataField(pos = 14)
    String Total_Profit;

}
