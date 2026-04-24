package com.interbank.shop.utils;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVDataReader {
    
    public static List<Map<String, String>> readCSV(String filePath) throws IOException {
        List<Map<String, String>> data = new ArrayList<>();
        
        try (FileReader reader = new FileReader(filePath)) {
            CSVFormat format = CSVFormat.DEFAULT.withFirstRecordAsHeader();
            Iterable<CSVRecord> records = format.parse(reader);
            
            for (CSVRecord record : records) {
                Map<String, String> map = record.toMap();
                data.add(map);
            }
        }
        
        return data;
    }
    
    public static Map<String, String> getRowByIndex(String filePath, int index) throws IOException {
        List<Map<String, String>> data = readCSV(filePath);
        if (index >= 0 && index < data.size()) {
            return data.get(index);
        }
        return new HashMap<>();
    }
    
    public static List<Map<String, String>> filterByColumn(String filePath, String columnName, String value) throws IOException {
        List<Map<String, String>> data = readCSV(filePath);
        List<Map<String, String>> filtered = new ArrayList<>();
        
        for (Map<String, String> record : data) {
            if (record.getOrDefault(columnName, "").equals(value)) {
                filtered.add(record);
            }
        }
        
        return filtered;
    }
}
