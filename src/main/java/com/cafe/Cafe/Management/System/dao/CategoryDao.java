package com.cafe.Cafe.Management.System.dao;

import com.cafe.Cafe.Management.System.POJO.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category,Integer> {

    List<Category> getAllCategory();

}
