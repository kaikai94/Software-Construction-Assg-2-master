package com.example.StoreProductManagementSystem.controller;
import java.util.List;
 
import com.example.StoreProductManagementSystem.dao.ProductDAO;
import com.example.StoreProductManagementSystem.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
 
public class Controller {
 
    @Autowired
    private ProductDAO ProductDAO;
 
    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome to Store Management System.";
    }
 
    @RequestMapping(value = "/Products", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public List<Product> getProducts() {
        List<Product> list = ProductDAO.getAllProducts();
        return list;
    }
    @RequestMapping(value = "/Product/{proNo}", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Product getProduct(@PathVariable("proNo") String proNo) {
        return ProductDAO.getProduct(proNo);
    }
 
    @RequestMapping(value = "/Product", //
            method = RequestMethod.POST, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Product addProduct(@RequestBody Product pro) {
 
        System.out.println("(Service Side) Creating Product: " + pro.getProNo());
 
        return ProductDAO.addProduct(pro);
    }
    
    @RequestMapping(value = "/updateProduct", //
            method = RequestMethod.PUT, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Product updateProduct(@RequestBody Product pro) {
 
        System.out.println("(Service Side) Editing Product: " + pro.getProNo());
 
        return ProductDAO.updateProduct(pro);
    }
 
    @RequestMapping(value = "/Product/{proNo}", //
            method = RequestMethod.DELETE, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void deleteProduct(@PathVariable("proNo") String proNo) {
 
        System.out.println("(Service Side) Deleting Product: " + proNo);
 
        ProductDAO.deleteProduct(proNo);
    }
    
    
 
}