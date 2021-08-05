package com.dh.dao;
  
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.dh.pojo.Product;
import com.dh.pojo.ProductImage;
 
public interface ProductImageDAO extends JpaRepository<ProductImage,Integer>{
    public List<ProductImage> findByProductAndTypeOrderByIdDesc(Product product, String type);
     
}