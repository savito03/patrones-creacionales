package com.patronesdiseno.estructurales.adapter.ejemplo3;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

public interface ProductsReport {

    String generateReport() throws IOException;
}
