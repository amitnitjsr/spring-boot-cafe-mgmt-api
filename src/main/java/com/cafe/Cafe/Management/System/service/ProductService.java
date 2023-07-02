package com.cafe.Cafe.Management.System.service;

import com.cafe.Cafe.Management.System.wrapper.ProductWrapper;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface ProductService {

    ResponseEntity<String> addNewProduct(Map<String,String> requestMap);

    ResponseEntity<List<ProductWrapper>> getAllProduct();

}
