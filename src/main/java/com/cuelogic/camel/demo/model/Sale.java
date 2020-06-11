package com.cuelogic.camel.demo.model;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord( separator = ",", skipFirstLine = false)
public class Sale {

    @DataField(pos = 1)
    String Region;

    @DataField(pos = 2, required = false)
    String Country;

    @DataField(pos = 3, required = false)
    String Item_Type;

    @DataField(pos = 4, required = false)
    String Sales_Channel;

    @DataField(pos = 5, required = false)
    String Order_Priority;

    @DataField(pos = 6, required = false)
    String Order_Date;

    @DataField(pos = 7, required = false)
    String Order_ID;

    @DataField(pos = 8, required = false)
    String Ship_Date;

    @DataField(pos = 9, required = false)
    String Units_Sold;

    @DataField(pos = 10, required = false)
    String Unit_Price;

    @DataField(pos = 11, required = false)
    String Unit_Cost;

    @DataField(pos = 12, required = false)
    String Total_Revenue;

    @DataField(pos = 13, required = false)
    String Total_Cost;

    @DataField(pos = 14, required = false)
    String Total_Profit;

    @DataField(pos = 15, required = false)
    String Total_Profit2;

    public String getTotal_Profit2() {
        return Total_Profit2;
    }

    public void setTotal_Profit2(String total_Profit2) {
        Total_Profit2 = total_Profit2;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getItem_Type() {
        return Item_Type;
    }

    public void setItem_Type(String item_Type) {
        Item_Type = item_Type;
    }

    public String getSales_Channel() {
        return Sales_Channel;
    }

    public void setSales_Channel(String sales_Channel) {
        Sales_Channel = sales_Channel;
    }

    public String getOrder_Priority() {
        return Order_Priority;
    }

    public void setOrder_Priority(String order_Priority) {
        Order_Priority = order_Priority;
    }

    public String getOrder_Date() {
        return Order_Date;
    }

    public void setOrder_Date(String order_Date) {
        Order_Date = order_Date;
    }

    public String getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(String order_ID) {
        Order_ID = order_ID;
    }

    public String getShip_Date() {
        return Ship_Date;
    }

    public void setShip_Date(String ship_Date) {
        Ship_Date = ship_Date;
    }

    public String getUnits_Sold() {
        return Units_Sold;
    }

    public void setUnits_Sold(String units_Sold) {
        Units_Sold = units_Sold;
    }

    public String getUnit_Price() {
        return Unit_Price;
    }

    public void setUnit_Price(String unit_Price) {
        Unit_Price = unit_Price;
    }

    public String getUnit_Cost() {
        return Unit_Cost;
    }

    public void setUnit_Cost(String unit_Cost) {
        Unit_Cost = unit_Cost;
    }

    public String getTotal_Revenue() {
        return Total_Revenue;
    }

    public void setTotal_Revenue(String total_Revenue) {
        Total_Revenue = total_Revenue;
    }

    public String getTotal_Cost() {
        return Total_Cost;
    }

    public void setTotal_Cost(String total_Cost) {
        Total_Cost = total_Cost;
    }

    public String getTotal_Profit() {
        return Total_Profit;
    }

    public void setTotal_Profit(String total_Profit) {
        Total_Profit = total_Profit;
    }

    @Override
    public String toString() {
        return "Sale [Region=" + Region + ", Country=" + Country + ", Item_Type=" + Item_Type + ", Sales_Channel="
                + Sales_Channel + ", Order_Priority=" + Order_Priority + ", Order_Date=" + Order_Date + ", Order_ID="
                + Order_ID + ", Ship_Date=" + Ship_Date + ", Units_Sold=" + Units_Sold + ", Unit_Price=" + Unit_Price
                + ", Unit_Cost=" + Unit_Cost + ", Total_Revenue=" + Total_Revenue + ", Total_Cost=" + Total_Cost
                + ", Total_Profit=" + Total_Profit + "]";
    }
}
