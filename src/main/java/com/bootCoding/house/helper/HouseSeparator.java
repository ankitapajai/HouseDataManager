package com.bootCoding.house.helper;

import com.bootCoding.house.model.House;

import java.util.List;

public class HouseSeparator {

    public static List<House> separateHouses(List<House> houses, int count) {
        return houses.stream()
                .filter(house -> house.getBedrooms() == count).toList();
    }
}
