package com.cafe.Cafe.Management.System.dao;

import com.cafe.Cafe.Management.System.POJO.Product;
import com.cafe.Cafe.Management.System.wrapper.ProductWrapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface ProductDao extends JpaRepository<Product,Integer> {

    List<ProductWrapper> getAllProduct();

    @Modifying
    @Transactional
    Integer updateProductStatus(@Param("status") String status,@Param("id") Integer id);

    List<ProductWrapper> getProductByCategory(@Param("id") Integer id);
}
