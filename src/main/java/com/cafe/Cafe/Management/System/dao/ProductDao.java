package com.cafe.Cafe.Management.System.dao;

import com.cafe.Cafe.Management.System.POJO.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {

}
