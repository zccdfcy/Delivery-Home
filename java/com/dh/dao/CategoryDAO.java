package com.dh.dao;
  
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.dh.pojo.Category;
 
public interface CategoryDAO extends JpaRepository<Category,Integer>{
 
}