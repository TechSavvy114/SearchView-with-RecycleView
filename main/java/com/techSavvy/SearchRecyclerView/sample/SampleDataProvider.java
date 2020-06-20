package com.techSavvy.SearchRecyclerView.sample;

import com.techSavvy.SearchRecyclerView.model.CityDataItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleDataProvider {

    public static List<CityDataItem> cityDataItemList;
    public static Map<String,CityDataItem> dataItemMap;

    static {
        cityDataItemList =new ArrayList<>();
        dataItemMap = new HashMap<>();

        addItem(new CityDataItem(
                null,"Agra","UttarPradesh" ));

        addItem(new CityDataItem(
                null,"Chandigarh","Punjab"));

        addItem(new CityDataItem(
                null,"Delhi","Delhi"));

        addItem(new CityDataItem(
                null,"Mumbai","Maharashta"));

        addItem(new CityDataItem(
                null,"Gurugram","Haryana"));

        addItem(new CityDataItem(
                null,"Banglore","Karnataka"));

        addItem(new CityDataItem(
                null,"Haridwar","Uthrakhand"));

        addItem(new CityDataItem(
                null,"Hyderabad","Telengana"));

        addItem(new CityDataItem(
                null,"Ranchi","Jharkhand"));

        addItem(new CityDataItem(
                null,"Tata","Jharkhand"));

        addItem(new CityDataItem(
                null,"Jind","Haryana"));

        addItem(new CityDataItem(
                null,"Rohtak","Haryana"));

        addItem(new CityDataItem(
                null,"Ghaziabad","UttarPradesh"));

        addItem(new CityDataItem(
                null,"Rewari","Haryana"));

        addItem(new CityDataItem(
                null,"Faridabad","Haryana"));

        addItem(new CityDataItem(
                null,"Bhiwani","Haryana"));

        addItem(new CityDataItem(
                null,"Varansi","UttarPradesh"));

        addItem(new CityDataItem(
                null,"Lucknow","UttarPradesh"));

    }

    private static void addItem(CityDataItem cityDataItem){
        cityDataItemList.add(cityDataItem);
        dataItemMap.put(cityDataItem.getCityId(), cityDataItem);
    }
}
