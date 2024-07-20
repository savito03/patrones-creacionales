package com.patronesdiseno.estructurales.adapter.ejemplo3;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
@SpringBootApplication
public class MainAdapter {
    public static void main(String[] args) throws IOException {
        XMLReport xmlReport = new XMLReport();

        ProductsReport jsonReport = new XMLReportAdapter(xmlReport);

        String jsonReportData = jsonReport.generateReport();

        System.out.println(jsonReportData);
    }
}
