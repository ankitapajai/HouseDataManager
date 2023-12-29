package com.bootCoding.house.helper;

import com.bootCoding.house.model.House;

public class ToCsvConverter {

    public static String toCsv(House house) {
        return house.getSquareFeet()
                + "," + house.getBedrooms()
                + "," + house.getBathrooms()
                + "," + house.getNeighborhood()
                + "," + house.getYearBuilt()
                + "," + house.getPrice();
    }
}
