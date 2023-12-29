package com.bootCoding.house.service;

import com.bootCoding.house.helper.HouseBuilder;
import com.bootCoding.house.inmemory.InMemoryStorage;
import com.bootCoding.house.model.House;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CsvReader implements Operation{


    @Override
    public void read(String path) {
        File file = new File(path);

        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line = reader.readLine();
            while ((line = reader.readLine()) != null){
                House house = HouseBuilder.buildHouse(line);
                InMemoryStorage.houses.add(house);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void write(List<House> houses, int count, String path, String header) {

    }
}
