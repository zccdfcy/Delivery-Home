package com.dh.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
 
import com.dh.dao.ReviewDAO;
import com.dh.pojo.Product;
import com.dh.pojo.Review;
 
@Service
public class ReviewService {
 
    @Autowired ReviewDAO reviewDAO;
    @Autowired ProductService productService;
 
    public void add(Review review) {
        reviewDAO.save(review);
    }
 
    public List<Review> list(Product product){
        List<Review> result =  reviewDAO.findByProductOrderByIdDesc(product);
        return result;
    }
 
    public int getCount(Product product) {
        return reviewDAO.countByProduct(product);
    }
     
}