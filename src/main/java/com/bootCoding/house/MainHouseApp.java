package com.bootCoding.house;

import com.bootCoding.house.helper.HeaderReader;
import com.bootCoding.house.inmemory.InMemoryStorage;
import com.bootCoding.house.service.CsvReader;
import com.bootCoding.house.service.CsvWriter;
import com.bootCoding.house.service.JsonWriter;
import com.bootCoding.house.service.Operation;

public class MainHouseApp {

    public static void main(String[] args) {

        Operation csvReader = new CsvReader();
        csvReader.read("D:\\programs\\housing.csv");

        Operation csvWriter = new CsvWriter();
        //2bhk houses
        csvWriter.write(InMemoryStorage.houses, 2 ,"D:\\programs\\houses2bhk.csv", HeaderReader.getHeader("D:\\programs\\housing.csv"));

        //3bhk houses
        csvWriter.write(InMemoryStorage.houses, 3, "D:\\programs\\houses3bhk.csv", HeaderReader.getHeader("D:\\programs\\housing.csv"));

        //4bhk houses
        csvWriter.write(InMemoryStorage.houses, 4, "D:\\programs\\houses4bhk.csv", HeaderReader.getHeader("D:\\programs\\housing.csv"));

        //5bhk houses
        csvWriter.write(InMemoryStorage.houses, 5, "D:\\programs\\houses5bhk.csv", HeaderReader.getHeader("D:\\programs\\housing.csv"));

        Operation jsonWriter = new JsonWriter();
        //2bhk houses
        jsonWriter.write(InMemoryStorage.houses, 2 ,"D:\\programs\\houses2bhk.json", null);

        //3bhk houses
        jsonWriter.write(InMemoryStorage.houses, 3, "D:\\programs\\houses3bhk.json", null);

        //4bhk houses
        jsonWriter.write(InMemoryStorage.houses, 4, "D:\\programs\\houses4bhk.json", null);

        //5bhk houses
        jsonWriter.write(InMemoryStorage.houses, 5, "D:\\programs\\houses5bhk.json", null);

    }
}

