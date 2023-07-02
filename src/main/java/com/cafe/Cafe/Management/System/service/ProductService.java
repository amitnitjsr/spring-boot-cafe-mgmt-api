package com.cafe.Cafe.Management.System.service;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface ProductService {

    ResponseEntity<String> addNewProduct(Map<String,String> requestMap);

}
