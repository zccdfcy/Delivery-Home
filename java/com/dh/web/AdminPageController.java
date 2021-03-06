package com.dh.web;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class AdminPageController {
    @GetMapping(value="/admin")
    public String admin(){
        return "redirect:admin_category_list";
    }
    @GetMapping(value="/admin_category_list")
    public String listCategory(){
        return "admin/listCategory";
    }
    @GetMapping(value="/admin_category_edit")
    public String editCategory(){ return "admin/editCategory"; }
    @GetMapping(value="/admin_product_list")
    public String listProduct(){ return "admin/listProduct"; }
    @GetMapping(value="/admin_product_edit")
    public String editProduct(){ return "admin/editProduct"; }
    @GetMapping(value="/admin_productImage_list")
    public String listProductImage(){ return "admin/listProductImage"; }
    @GetMapping(value="/admin_user_list")
    public String listUser(){ return "admin/listUser"; }
    @GetMapping(value="/admin_order_list")
    public String listOrder(){return "admin/listOrder"; }

}