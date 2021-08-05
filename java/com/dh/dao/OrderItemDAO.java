package com.dh.dao;
  
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.dh.pojo.Order;
import com.dh.pojo.OrderItem;
import com.dh.pojo.Product;
import com.dh.pojo.User;
 
public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{
    List<OrderItem> findByOrderOrderByIdDesc(Order order);
    List<OrderItem> findByProduct(Product product);
    List<OrderItem> findByUserAndOrderIsNull(User user);
}