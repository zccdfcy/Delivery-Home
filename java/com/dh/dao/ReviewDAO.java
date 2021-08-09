package com.dh.dao;
  
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.dh.pojo.Product;
import com.dh.pojo.Review;
 
public interface ReviewDAO extends JpaRepository<Review,Integer>{
 
    List<Review> findByProductOrderByIdDesc(Product product);
    int countByProduct(Product product);
 
}